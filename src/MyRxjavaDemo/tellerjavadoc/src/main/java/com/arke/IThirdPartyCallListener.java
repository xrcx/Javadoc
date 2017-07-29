package com.arke;

/**
 * @auth hongqy
 */

public class IThirdPartyCallListener {
    /**
     * 交易开始
     */
    void onStart() {
    }

    /**
     * 交易过程中,信息反馈
     *
     * @param value 反馈的信息
     */
    void onNext(String value) {
    }

    /**
     * 交易结束
     *
     * @param responseData 响应信息
     */
    void onComplete(String responseData) {
    }
}