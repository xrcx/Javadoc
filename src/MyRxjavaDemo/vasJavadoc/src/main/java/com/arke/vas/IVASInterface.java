package com.arke.vas;

import android.os.RemoteException;

import com.arke.vas.data.VASPayload;

/**
 * Value added service interface
 *
 * 增值业务接口
 */
interface IVASInterface {
    /**
     * 签到
     *
     * @param listener 监听器
     * @see IVASListener
     */
    void signIn(IVASListener listener);

    /**
     * 消费
     *
     * @param requestData 消费 body 请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>交易金额</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方交易订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方传入的需要打印的备注信息</td></tr>
     *                    <tr><td>tellerCardData</td><td>TellerCardData</td><td>收银台收集的卡信息</td></tr>
     *                    </table>
     * @param listener    监听器
     *                    <p>
     *                    消费请求数据例子：
     *                    <br/>
     *                    <img src="../../../image/consume_payload.png">
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void sale(VASPayload requestData, IVASListener listener);

    /**
     * 消费撤销
     *
     * @param requestData 消费撤销 body 请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>原交易凭证号</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方交易订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方传入的需要打印的备注信息</td></tr>
     *                    </table>
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void voided(VASPayload requestData, IVASListener listener);

    /**
     * 结算
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    void settle(IVASListener listener);

    /**
     * 根据第三方交易流水获取交易记录
     *
     * @param requestData body 请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方流水号</td></tr>
     *                    </table>
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    void orderNumberQuery(VASPayload requestData, IVASListener listener);

    /**
     * 打印交易汇总
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    void printTransactionSummary(IVASListener listener);

    /**
     * 打印交易明细
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    void printTransactionDetail(IVASListener listener);

    /**
     * 终端密钥管理
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    void terminalKeyManagement(IVASListener listener);
}