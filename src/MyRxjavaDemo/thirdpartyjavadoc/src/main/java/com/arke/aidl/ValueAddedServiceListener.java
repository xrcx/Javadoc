package com.arke.aidl;

/**
 * @auth hongqy
 */

public class ValueAddedServiceListener {
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
