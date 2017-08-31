package com.arke.aidl;

/**
 * 交易过程信息回调
 */
interface ValueAddedServiceListener {
     /**
      * 交易开始
      */
     void onStart() ;

     /**
      * 交易过程中,信息反馈
      *
      * @param value 反馈的信息
      */
     void onNext(String value) ;

     /**
      * 交易结束
      *
      * @param responseData 响应信息
      * <br/>
      * 消费返回例子：
      * <br/>
      * <img src="../../../image/consume_response_json.png">
      */
     void onComplete(String responseData) ;
}
