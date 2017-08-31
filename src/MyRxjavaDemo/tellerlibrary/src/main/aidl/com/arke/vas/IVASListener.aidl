// IVASListener.aidl
package com.arke.vas;
import com.arke.vas.VASPayload;
interface IVASListener {
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
    void onComplete(in VASPayload responseData);
}
