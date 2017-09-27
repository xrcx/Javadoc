package com.arke.vas;

import android.os.RemoteException;

import com.arke.vas.data.VASPayload;

/**
 * Value added service interface binder, can be inherited to achieve specific transactions
 * <p>
 * 增值服务接口,可继承该类实现具体交易
 */
public class VASInterfaceStub  extends IVASInterface.Stub{

    /**
     * 签到
     *
     * @param listener 监听器
     * @see IVASListener
     */
    @Override
    public void signIn(IVASListener listener) throws RemoteException {

    }

    /**
     * Sale transactions
     *
     * @param requestData Sale transactions, request parameters
     *                    <p>
     *                        Message body (body) request parameters are as follows, JSON format, optional
     *                    <p>
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>Transaction amount</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>Whether the need for value added service to print</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>Value added service need to print the note information</td></tr>
     *                    <tr><td>tellerCardData</td><td>TellerCardData</td><td>Collected card information by the teller</td></tr>
     *                    </table>
     *                    <p>
     *                    Consumption, request parameter simple example (message body data)：
     *                    <p>
     *                    <img src="../../../../image/sale_request_data_1.png">
     *                    <p>
     *                        Consumption, request with TellerCardData parameter example (message body data):
     *                    <p>
     *                    <img src="../../../../image/sale_request_data_2.png">
     * @param listener    Listener
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     *
     * ---------------------------
     * 消费
     *
     * @param requestData 消费交易，请求参数
     *                    <p>
     *                        <li>消息体(body)请求参数如下，JSON格式，可选<li/>
     *                    <p>
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>交易金额</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方交易订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方传入的需要打印的备注信息</td></tr>
     *                    <tr><td>tellerCardData</td><td>TellerCardData</td><td>收银台收集的卡信息</td></tr>
     *                    </table>
     *
     *                    <p>
     *                    消费，请求参数简单例子(消息体数据)：
     *                    <p>
     *                    <img src="../../../image/sale_request_data_1.png">
     *                    <p>
     *                    消费，请求带有 TellerCardData 参数例子(消息体数据)：
     *                    <p>
     *                    <img src="../../../image/sale_request_data_2.png">
     * @param listener    Listener
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void sale(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Sale void transactions
     *
     * @param requestData Sale void transactions, request parameters
     * <p>
     *                    Message body (body) request parameters are as follows, JSON format, optional
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>Original transaction voucher number</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>Whether the need for value added service to print</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>Value added service need to print the note information</td></tr>
     *                    </table>

     *                    <p>
     *                    Sale void, request parameter example (message body data)：
     *                    <p>
     *                    <img src="../../../../image/void_request_data.png">
     * @param listener    Listener
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     * ----------------------------------------
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
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方增值服务传入的需要打印的备注信息</td></tr>
     *                    </table>

     *                    <p>
     *                    消费撤销，请求参数例子(消息体数据)：
     *                    <p>
     *                    <img src="../../../image/void_request_data.png">
     *
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void voided(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Settlement
     * <p>
     * 结算
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void settle(IVASListener listener) throws RemoteException {

    }

    /**
     * According to value added service order number to get transaction record
     *
     * @param requestData Order number query, request parameters
     * <p>
     *                    Message body (body) request parameters are as follows, JSON format, optional
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
    @Override
    public void orderNumberQuery(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Print transaction summary
     * <p>
     * 打印交易汇总
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void printTransactionSummary(IVASListener listener) throws RemoteException {

    }

    /**
     * Print the transaction details
     * <p>
     * 打印交易明细
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void printTransactionDetail(IVASListener listener) throws RemoteException {

    }

    /**
     * Terminal key management
     * <p>
     * 终端密钥管理
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void terminalKeyManagement(IVASListener listener) throws RemoteException {

    }

    /**
     * Refund transaction
     *
     * @param requestData Refund transactions, request parameters
     *                    <p>
     *                         Message body (body) request parameters are as follows, JSON format, optional
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>Transaction amount</td></tr>
     *                    <tr><td>originalReferenceNumber</td><td>String</td><td>Original transaction reference number</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>Whether the need for value added service to print</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>Value added service need to print the note information</td></tr>
     *                    </table>
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     *
     * --------------------------------------
     * 退货
     *
     * @param requestData 退货交易，请求参数
     *                    <p>
     *                        消息体(body)请求参数如下，JSON格式，可选
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>交易金额</td></tr>
     *                    <tr><td>originalReferenceNumber</td><td>String</td><td>原交易参考号</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方交易订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方传入的需要打印的备注信息</td></tr>
     *                    </table>
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void refund(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Authorization transaction
     *
     * @param requestData Authorization transactions, request parameters
     *                    <p>
     *                         Message body (body) request parameters are as follows, JSON format, optional
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>Transaction amount</td></tr>
     *                    <tr><td>cardNumber</td><td>Double</td><td>Card number</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>Whether the need for value added service to print</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>Value added service need to print the note information</td></tr>
     *                    </table>
     * @param listener    监听器
     *
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     *
     * ---------------------------------
     * 预授权
     *
     * @param requestData 预授权交易，请求参数
     *                    <p>
     *                        <li>消息体(body)请求参数如下，JSON格式，可选<li/>
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>交易金额</td></tr>
     *                    <tr><td>cardNumber</td><td>Double</td><td>卡号</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方交易订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方传入的需要打印的备注信息</td></tr>
     *                    </table>
     * @param listener    监听器
     *
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void authorization(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Preauthorization void
     * <p>
     * 预授权撤销
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void preAuthorizationVoid(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Offline settlement transaction
     *
     * @param requestData Offline settlement transaction, request parameters
     *                    <p>Message body (body) request parameters are as follows, JSON format, optional
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>cardNumber</td><td>Double</td><td>Card number</td></tr>
     *                    <tr><td>expiryDate</td><td>String</td><td>Expiry date</td></tr>
     *                    <tr><td>authorizationMethod</td><td>Boolean</td><td>Authorization method</td></tr>
     *                    <tr><td>authorizationCode</td><td>String</td><td>Authorization code</td></tr>
     *                    </table>
     * @param listener    监听器
     *
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     * -------------------------------------------------------
     * 离线结算
     *
     * @param requestData 离线结算交易，请求参数
     *                    <p>消息体(body)请求参数如下，JSON格式，可选
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>cardNumber</td><td>Double</td><td>卡号</td></tr>
     *                    <tr><td>expiryDate</td><td>String</td><td>有效期</td></tr>
     *                    <tr><td>authorizationMethod</td><td>Boolean</td><td>授权方式</td></tr>
     *                    <tr><td>authorizationCode</td><td>String</td><td>授权码</td></tr>
     *                    </table>
     * @param listener    监听器
     *
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void offlineSettlement(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Offline settlement adjustment
     *
     * @param requestData Offline settlement adjustment, request parameters
     *                    <p>Message body (body) request parameters are as follows, JSON format, optional
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>Original transaction voucher number</td></tr>
     *                    </table>
     * @param listener
     *
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     * -------------------------------------------------------
     * 离线结算调整
     *
     * @param requestData 离线结算调整，请求参数
     *                    <p>消息体(body)请求参数如下，JSON格式，可选
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>原交易凭证号</td></tr>
     *                    </table>
     * @param listener    监听器
     *
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void settlementAdjustment(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Get the transaction switch
     *
     * @return Transaction switch information, JSON format, true means the acquisition application support the transaction, false means the application does not support
    <p>
     *                         <br/>
     *                         Field description
     *                         <br/>
     *                        <p> <table border="1" cellspacing="0" cellpadding="5px">
     *                         <tr><th>Field</th><th>Description</th></tr>
     *                         <tr><td>SIGNIN</td><td>Sigin</td></tr>
     *                         <tr><td>CONSUME</td><td>Sale transaction</td></tr>
     *                         <tr><td>VOID</td><td>Void transaction</td></tr>
     *                         <tr><td>SETTLE</td><td>Settlement</td></tr>
     *                         <tr><td>ORDER_NUMBER_INQUIRY</td><td>Order number inquiry</td></tr>
     *                         <tr><td>PRINT_TRANSACTION_DETAIL</td><td>Print the transaction details</td></tr>
     *                         <tr><td>PRINT_TRANSACTION_SUMMARY</td><td>Print transaction summary</td></tr>
     *                         <tr><td>TERMINAL_KEY_MANAGEMENT</td><td>Terminal key management</td></tr>
     *                         <tr><td>REFUND</td><td>Refund transaction</td></tr>
     *                         <tr><td>PRE_AUTHORIZATION</td><td>Preauthorization transaction</td></tr>
     *                         <tr><td>PRE_AUTH_VOID</td><td>Preauthorization void transaction</td></tr>
     *                         <tr><td>OFFLINE_SETTLEMENT</td><td>Offline settlement</td></tr>
     *                         <tr><td>SETTLEMENT_ADJUSTMENT</td><td>Offline settlement adjustment</td></tr>
     *                         <tr><td>DOTASK</td><td>Perform scheduled tasks</td></tr>
     *                         <tr><td>ADJUST_TIPS</td><td>Tip adjustment</td></tr>
     *                         <tr><td>OFFLINE</td><td>Offline</td></tr>
     *                         <tr><td>SCAN</td><td>Scanning</td></tr>
     *                         </table>
     *                         <br/>
     *                         <p>
     *                         Example:
     *                         <p>
     *                         <img src="../../../image/get_action_config_json.png">
     * @throws RemoteException
     * -------------------------------------------------------
     * 获取交易开关
     *
     * @return 交易开关信息，JSON格式，true 代表收单应用支持该交易，false 代表收单应用不支持该交易
    <p>
     *                         字段说明
     *                         <p><table border="1" cellspacing="0" cellpadding="5px">
     *                         <tr><th>字段</th><th>说明</th></tr>
     *                         <tr><td>SALE</td><td>消费</td></tr>
     *                         <tr><td>VOID</td><td>撤销</td></tr>
     *                         <tr><td>SIGNIN</td><td>签到</td></tr>
     *                         <tr><td>SETTLE</td><td>结算</td></tr>
     *                         <tr><td>ORDER_NUMBER_INQUIRY</td><td>流水号查询</td></tr>
     *                         <tr><td>PRINT_TRANSACTION_DETAIL</td><td>打印交易明细</td></tr>
     *                         <tr><td>PRINT_TRANSACTION_SUMMARY</td><td>打印交易汇总</td></tr>
     *                         <tr><td>TERMINAL_KEY_MANAGEMENT</td><td>终端密钥管理</td></tr>
     *                         <tr><td>REFUND</td><td>退货</td></tr>
     *                         <tr><td>PRE_AUTHORIZATION</td><td>预授权</td></tr>
     *                         <tr><td>PRE_AUTH_VOID</td><td>预授权撤销</td></tr>
     *                         <tr><td>OFFLINE_SETTLEMENT</td><td>离线结算</td></tr>
     *                         <tr><td>SETTLEMENT_ADJUSTMENT</td><td>离线结算调整</td></tr>
     *                         <tr><td>DOTASK</td><td>执行计划任务</td></tr>
     *                         <tr><td>ADJUST_TIPS</td><td>小费调整</td></tr>
     *                         <tr><td>OFFLINE</td><td>离线</td></tr>
     *                         <tr><td>SCAN</td><td>扫码</td></tr>
     *                         </table>
     *                         <br/>
     *                         <p>
     *                         返回数据的例子：
     *                         <p>
     *                         <img src="../../../image/get_action_config_json.png">
     * @throws RemoteException
     */
    @Override
    public String getActionConfig() throws RemoteException {
        return null;
    }

    /**
     * Get the AID list
     *
     * @return AIDS list, JSON format, true means the purchase application exactly match, false means the application part of the matching
    <p>
     *                         Example:
     *                         <p>
     *                         <img src="../../../image/get_aids_json.png">
     * @throws RemoteException
     * ---------------------------
     * 获取 AID 列表
     *
     * @return AIDS 列表，JSON格式，true 代表收单应用完全匹配，false 代表收单应用部分匹配
    <p>
     *                         返回例子
     *                         <p>
     *                         <img src="../../../image/get_aids_json.png">
     * @throws RemoteException
     */
    @Override
    public String getAids() throws RemoteException {
        return null;
    }

    /**
     * Reserved transaction extension interface (not used)
     * <p>
     * 预留交易扩展接口(暂不使用)
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void doAction(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Get coupons
     * <p>
     * 获得优惠券
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void getCoupon(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Revoke coupon
     * <p>
     * 撤销优惠券
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void voidCoupon(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Perform scheduled tasks
     * <p>
     * 执行计划任务
     *
     * @param listener    监听器
     * @see IVASListener
     */
    @Override
    public void doTask(IVASListener listener) throws RemoteException {

    }

    /**
     * Get the scheduled task
     * <p>
     * 获取计划任务
     *
     * @return crontab表达式 crontab expression
     */
    @Override
    public String getTaskConfig() throws RemoteException {
        return null;
    }

    /**
     * Tip adjustment
     * <p>
     * 小费调整
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void adjustTips(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * offline
     * <p>
     * 离线
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void offline(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Scan code
     *
     * 扫码
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    @Override
    public void scanCode(VASPayload requestData, IVASListener listener) throws RemoteException {

    }
}
