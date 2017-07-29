package com.arke;

/**
 * @auth hongqy
 */

public class IThirdPartyCallBinder {
    /**
     * 签到
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    public void signIn(IThirdPartyCallListener listener) {
    }

    /**
     * 消费
     *
     * @param requestData 消费请求数据，JSON格式
     * @param listener    监听器
     * @see IThirdPartyCallListener
     */
    public void consume(String requestData, IThirdPartyCallListener listener) {
    }

    /**
     * 消费撤销
     *
     * @param requestData 消费请求数据，JSON格式
     * @param listener    监听器
     * @see IThirdPartyCallListener
     */
    public void voided(String requestData, IThirdPartyCallListener listener) {
    }

    /**
     * 结算
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    public void settle(IThirdPartyCallListener listener) {
    }

    /**
     * 打印交易汇总
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    public void printTransactionSummary(IThirdPartyCallListener listener) {
    }

    /**
     * 打印交易明细
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    public void printTransactionDetail(IThirdPartyCallListener listener) {
    }

    /**
     * 终端密钥管理
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    public void terminalKeyManagement(IThirdPartyCallListener listener) {
    }

    /**
     * 获取交易开关
     *
     * @return 交易开关
     */
    public String getActionConfig() {
        return null;
    }

    /**
     * 预留交易扩展接口(暂不使用)
     *
     * @param requestData
     * @param listener    监听器
     * @see IThirdPartyCallListener
     */
    public void doAction(String requestData, IThirdPartyCallListener listener) {
    }
}
