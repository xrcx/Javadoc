package com.arke.vas;

import android.os.RemoteException;

import com.arke.vas.data.VASPayload;

/**
 * 增值服务接口
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
     * @param requestData 消费交易，请求参数
     *                    <p>
     *                    <li>消息体(body)请求参数如下，JSON格式，可选<li/>
     *                    <p>
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>交易金额</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方增值服务订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方增值服务打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>增值服务传入的需要打印的备注信息</td></tr>
     *                    <tr><td>tellerCardData</td><td>TellerCardData</td><td>收银台收集的卡信息</td></tr>
     *                    </table>
     *                    <p>
     *                    <p>
     *                    消费，请求参数简单例子(消息体数据)：
     *                    <p>
     *                    <img src="../../../image/sale_request_data_1.png">
     *                    <p>
     *                    消费，请求带有 TellerCardData 参数例子(消息体数据)：
     *                    <p>
     *                    <img src="../../../image/sale_request_data_2.png">
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void sale(VASPayload requestData, IVASListener listener);

    /**
     * 消费撤销
     *
     * @param requestData 消费撤销交易，请求参数
     *                    <p>
     *                    消息体(body)请求参数如下，JSON格式，可选
     *                    <p>
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>原交易凭证号</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方增值服务订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方增值服务打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>增值服务传入的需要打印的备注信息</td></tr>
     *                    </table>
     *                    <p>
     *                    <p>
     *                    消费撤销，请求参数例子(消息体数据)：
     *                    <p>
     *                    <img src="../../../image/void_request_data.png">
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
     * 根据增值服务流水获取交易记录
     *
     * @param requestData 根据流水获取交易记录，请求参数
     *                    <p>
     *                    消息体(body)请求参数如下，JSON格式，可选
     *                    <p>
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方增值服务流水号</td></tr>
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