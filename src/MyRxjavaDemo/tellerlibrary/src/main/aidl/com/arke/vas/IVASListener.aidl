package com.arke.vas;
import com.arke.vas.data.VASPayload;
interface IVASListener {
    /**
     *The transaction begins
     *
     * 交易开始
     */
    void onStart() ;

    /**
     * 交易过程中,信息反馈
     *
     * @param value 反馈的信息
     */
    void onNext(in VASPayload responseData);

   /**
     * 交易结束
     *
     * @param responseData 响应信息
     * <br/>
     * 消费返回例子：
     * <br/>
     * <img src="../../../../image/sale_on_complete_ch.png">
     */
    void onComplete(in VASPayload responseData);
}
