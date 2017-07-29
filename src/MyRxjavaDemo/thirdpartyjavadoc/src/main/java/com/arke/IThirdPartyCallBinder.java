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
    void signIn(IThirdPartyCallListener listener) {
    }

    /**
     * 消费
     *
     * @param requestData 消费请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>交易金额</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方交易订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方传入的需要打印的备注信息</td></tr>
     *                    </table>
     * @param listener    监听器
     * @see IThirdPartyCallListener
     * @see com.arke.thirdcalling.ThirdPartyCallRequestData
     */
    void consume(String requestData, IThirdPartyCallListener listener) {
    }

    /**
     * 消费撤销
     *
     * @param requestData 消费请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>原交易凭证号</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方交易订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方传入的需要打印的备注信息</td></tr>
     *                    </table>
     * @param listener    监听器
     * @see IThirdPartyCallListener
     * @see com.arke.thirdcalling.ThirdPartyCallRequestData
     */
    void voided(String requestData, IThirdPartyCallListener listener) {
    }

    /**
     * 结算
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    void settle(IThirdPartyCallListener listener) {
    }

    /**
     * 打印交易汇总
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    void printTransactionSummary(IThirdPartyCallListener listener) {
    }

    /**
     * 打印交易明细
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    void printTransactionDetail(IThirdPartyCallListener listener) {
    }

    /**
     * 终端密钥管理
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    void terminalKeyManagement(IThirdPartyCallListener listener) {
    }
}
