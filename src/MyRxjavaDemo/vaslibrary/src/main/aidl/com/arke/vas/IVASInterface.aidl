package com.arke.vas;
import com.arke.vas.IVASListener;
import com.arke.vas.data.VASPayload;
/**
 * Value added service interface
 * <p>
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
        * Sale transactions
        *
        * @param requestData Consumption body request data, JSON format
        *                    <p>
        *                    <table border="1" cellspacing="0" cellpadding="5px">
        *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
        *                    <tr><td>amount</td><td>Double</td><td>Transaction amount</td></tr>
        *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
        *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>Whether the need for value added service to print</td></tr>
        *                    <tr><td>inputRemarkInfo</td><td>String</td><td>Value added service need to print the note information</td></tr>
        *                    <tr><td>tellerCardData</td><td>TellerCardData</td><td>Collected card information by the teller</td></tr>
        *                    </table>
        * @param listener    Listener
        *                    <p>
        *                    Examples of consumption request data：
        *                    <p>
        *                    <img src="../../../../image/consume_payload.png">
        * @throws RemoteException
        * @see VASPayload
        * @see IVASListener
        *
        * ---------------------------
        * 消费
        *
        * @param requestData 消费 body 请求数据，JSON格式
        *                    <p>
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
        *                    <p>
        *                    <img src="../../../../image/consume_payload.png">
        * @throws RemoteException
        * @see VASPayload
        * @see IVASListener
        */
       void sale(in VASPayload requestData, IVASListener listener);

       /**
        * Sale void transactions
        *
        * @param requestData Sale void body request data, JSON format
        * <p>
        *                    <table border="1" cellspacing="0" cellpadding="5px">
        *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
        *                    <tr><td>originalVoucherNumber</td><td>String</td><td>Original transaction voucher number</td></tr>
        *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
        *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>Whether the need for value added service to print</td></tr>
        *                    <tr><td>inputRemarkInfo</td><td>String</td><td>Value added service need to print the note information</td></tr>
        *                    </table>
        * @param listener    Listener
        * @throws RemoteException
        * @see VASPayload
        * @see IVASListener
        * ----------------------------------------
        * 消费撤销
        *
        * @param requestData 消费撤销 body 请求数据，JSON格式
        *                    <p><table border="1" cellspacing="0" cellpadding="5px">
        *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
        *                    <tr><td>originalVoucherNumber</td><td>String</td><td>原交易凭证号</td></tr>
        *                    <tr><td>orderNumber</td><td>String</td><td>第三方增值服务订单号</td></tr>
        *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方增值服务打单</td></tr>
        *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方增值服务传入的需要打印的备注信息</td></tr>
        *                    </table>
        * @param listener    监听器
        *
        * @throws RemoteException
        * @see VASPayload
        * @see IVASListener
        */
       void voided(in VASPayload requestData, IVASListener listener);


       /**
        * Settlement
        *
        * 结算
        *
        * @param listener
        * @throws RemoteException
        * @see IVASListener
        */
       void settle(IVASListener listener);

       /**
        * According to value added service order number to get transaction record
        *
        * @param requestData Body request data, JSON format
        *                    <p><table border="1" cellspacing="0" cellpadding="5px">
        *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
        *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
        *                    </table>
        * @param listener
        * @see VASPayload
        * @see IVASListener
        * ----------------------------------------
        * 根据增值服务流水获取交易记录
        *
        * @param requestData body 请求数据，JSON格式
        *                    <p><table border="1" cellspacing="0" cellpadding="5px">
        *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
        *                    <tr><td>orderNumber</td><td>String</td><td>第三方增值服务流水号</td></tr>
        *                    </table>
        * @param listener    监听器
        * @see VASPayload
        * @see IVASListener
        */
       void orderNumberQuery(in VASPayload requestData, IVASListener listener);

       /**
        * Print transaction summary
        *
        * 打印交易汇总
        *
        * @param listener 监听器
        * @throws RemoteException
        * @see IVASListener
        */
       void printTransactionSummary(IVASListener listener);

       /**
        * Print the transaction details
        *
        * 打印交易明细
        *
        * @param listener 监听器
        * @throws RemoteException
        * @see IVASListener
        */
       void printTransactionDetail(IVASListener listener);

       /**
        * Terminal key management
        *
        * 终端密钥管理
        *
        * @param listener 监听器
        * @throws RemoteException
        * @see IVASListener
        */
       void terminalKeyManagement(IVASListener listener);
}