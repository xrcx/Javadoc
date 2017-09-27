package com.arke.vas;

import com.arke.vas.data.VASPayload;


/**
 * 增值业务监听器
 */
interface IVASListener {
    /**
     * 交易开始
     */
    void onStart();

    /**
     * 交易过程中,信息反馈
     *
     * @param responseData 反馈的信息
     */
    void onNext(VASPayload responseData);

    /**
     * 交易结束
     *
     * @param responseData 响应信息
     *                     <br/>
     *                     消费返回例子：
     *                     <br/>
     *                     <img src="../../../../image/sale_on_complete_ch.png">
     * @see VASPayload
     */
    void onComplete(VASPayload responseData);
}
