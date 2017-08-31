package com.arke.aidl;

import android.os.RemoteException;

import com.arke.vas.VASRequestData;

/**
 * @auth hongqy
 */

public class ValueAddedService {
    /**
     * 签到
     *
     * @param listener 监听器
     * @see ValueAddedServiceListener
     */
    void signIn(ValueAddedServiceListener listener) {
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
     *                    <p>
     *                    消费请求数据例子：
     *                    <br/>
     *                    <img src="../../../image/consume_request_json.png">
     * @throws RemoteException
     * @see ValueAddedServiceListener
     * @see VASRequestData
     */
    void consume(String requestData, ValueAddedServiceListener listener) {
    }

    /**
     * 消费撤销
     *
     * @param requestData 消费撤销请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>原交易凭证号</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方交易订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方传入的需要打印的备注信息</td></tr>
     *                    </table>
     * @param listener    监听器
     * @throws RemoteException
     * @see ValueAddedServiceListener
     * @see VASRequestData
     */
    void voided(String requestData, ValueAddedServiceListener listener) {
    }

    /**
     * 结算
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see ValueAddedServiceListener
     */
    void settle(ValueAddedServiceListener listener) {
    }

    /**
     * 根据第三方交易流水获取交易记录
     *
     * @param orderNumber 第三方交易流水
     * @param listener    监听器
     * @throws RemoteException
     * @see ValueAddedServiceListener
     */
    void orderNumberQuery(String orderNumber, ValueAddedServiceListener listener) {
    }

    /**
     * 打印交易汇总
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see ValueAddedServiceListener
     */
    void printTransactionSummary(ValueAddedServiceListener listener) {
    }

    /**
     * 打印交易明细
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see ValueAddedServiceListener
     */
    void printTransactionDetail(ValueAddedServiceListener listener) {
    }

    /**
     * 终端密钥管理
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see ValueAddedServiceListener
     */
    void terminalKeyManagement(ValueAddedServiceListener listener) {
    }
}
