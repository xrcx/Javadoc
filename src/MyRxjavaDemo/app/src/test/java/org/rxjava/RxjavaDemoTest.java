package org.rxjava;

import org.junit.Test;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/**
 * @auth hongqy
 */

public class RxjavaDemoTest {
    /**
     * 1. oncomplete 可以继续发数据，但不再接受数据
     * 2. dispose 后不再接受数据   isDisposed，false 接收器正常    dispose 后，isDisposed=true，接收器停止接收
     * 3. 发射事件方法相比1.x多了一个throws Excetion
     * 结果：value==1 时，切断，故2发送，不接收，onComplete 后发射3，发送不接收
     *
     * @throws Exception
     */
    @Test
    public void testObservable_onComplete_dispose() throws Exception {

        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                System.out.print("\nemit 1");
                e.onNext(1);
                System.out.print("\nemit 2");
                e.onNext(2);
                System.out.print("\ncall onComplete");
                e.onComplete();
                System.out.print("\nemit 3");
                e.onNext(3);
            }
        }).subscribe(new Observer<Integer>() {
            private Disposable disposable;

            @Override
            public void onSubscribe(@NonNull Disposable d) {
                this.disposable = d;
                System.out.print("\nonSubscribe,isDisposed:" + d.isDisposed());
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                System.out.print("\nonNext(), value:" + integer);
                if (integer == 1) {
                    System.out.print("\ndisposable.dispose()");
                    disposable.dispose();
                    System.out.print("\ndisposable.isDisposed().value:" + disposable.isDisposed());
                }
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.print("\nonError(), Message:" + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.print("\nonComplete()");
            }
        });
        Thread.sleep(5000);
//        assertEquals(4, 2 + 2);
    }

    /**
     * map基本作用就是将一个Observable通过某种函数关系，转换为另一种Observable
     *
     * @throws Exception
     */
    @Test
    public void testMap() throws Exception {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                System.out.print("\nemit 1");
                e.onNext(1);
                System.out.print("\nemit 2");
                e.onNext(2);
                System.out.print("\nemit 3");
                e.onNext(3);
            }
        }).map(new Function<Integer, Integer>() {

            @Override
            public Integer apply(@NonNull Integer integer) throws Exception {
                System.out.print("\nmap apply " + integer);
                return integer * 10;
            }
        }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer o) throws Exception {

                System.out.print("\naccept:" + o + "\n");
            }
        });

        Thread.sleep(5000);
    }

    /**
     * zip专用于合并事件，该合并不是连接，而是两两配对，也就意味着，最终配对出的Observable发射事件数目只和少的那个相同。
     *
     * @throws Exception
     */
    @Test
    public void testZip() throws Exception {
//        Observable.zip(getStringObservable(), getIntegerObservable(), new BiFunction<String, Integer, String>() {
//                    @Override
//                    public String apply(@NonNull String s, @NonNull Integer integer) throws Exception {
//                        System.out.print("\napply,s：" + s + ",int:" + integer);
//                        return s + integer;
//                    }
//                }
//
//        ).subscribe(new Consumer<String>() {
//            @Override
//            public void accept(String s) throws Exception {
//             System.out.print("\naccept:" + s);
//            }
//        });

        Thread.sleep(10000);
    }

    private Observable<String> getStringObservable() {
        return Observable.create(e -> {
            if (!e.isDisposed()) {
                System.out.print("emit A");
                e.onNext("A");
                System.out.print("emit B");
                e.onNext("B");
                System.out.print("emit C");
                e.onNext("C");
            }

        });
    }

    private Observable<Integer> getIntegerObservable() {
        return Observable.create(e -> {
            if (!e.isDisposed()) {
                System.out.print("emit 1");
                e.onNext(1);
                System.out.print("emit 2");
                e.onNext(2);
                System.out.print("emit 3");
                e.onNext(3);

                System.out.print("emit 4");
                e.onNext(4);
                System.out.print("emit 5");
                e.onNext(5);
            }
        });
    }


    @Test
    public void testObservable() {
        System.out.print("test");
    }
}
