package com.arke.vas;

import android.os.RemoteException;

import com.arke.vas.data.VASPayload;

/**
 * Value added service interface
 * <p>
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
     *  transactions
     *
     * @param requestData Consumption body request data, JSON format
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
     *                    <br/>
     *                    <img src="../../../image/consume_payload.png">
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     * <p>
     * ---------------------------
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
     * Sale void transactions
     *
     * @param requestData Sale void body request data, JSON format
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
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>原交易凭证号</td></tr>
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
    void voided(VASPayload requestData, IVASListener listener);


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
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>Parameter</th><th>Type</th><th>Description</th></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>Value added service order number</td></tr>
     *                    </table>
     * @param listener
     * @see VASPayload
     * @see IVASListener
     * ----------------------------------------
     * 根据增值应用流水获取交易记录
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
    /**
     * Refund transaction
     *
     * @param requestData Refund the body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
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
     * @param requestData 退货 body 请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
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
    void refund(VASPayload requestData, IVASListener listener);

    /**
     * Authorization transaction
     *
     * @param requestData Refund the body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
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
     * @param requestData body 请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
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
    void authorization(VASPayload requestData, IVASListener listener);

    /**
     * Preauthorization void
     *
     * 预授权撤销
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    void preAuthorizationVoid(VASPayload requestData, IVASListener listener);

    /**
     * Offline settlement transaction
     *
     * @param requestData The body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
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
     * @param requestData body 请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
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
    void offlineSettlement(VASPayload requestData, IVASListener listener);


    /**
     * Offline settlement adjustment
     *
     * @param requestData Body request data, JSON format
     *                    <table border="1" cellspacing="0" cellpadding="5px">
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
     * @param requestData body 请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>原交易凭证号</td></tr>
     *                    </table>
     * @param listener    监听器
     *                    <p>
     *                    离线结算调整请求数据例子：
     *                    <br/>
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void settlementAdjustment(VASPayload requestData, IVASListener listener);

    /**
     * Get the transaction switch
     *
     * @return Transaction switch information, JSON format, true means the acquisition application support the transaction, false means the application does not support
     * @throws RemoteException <p>
     *                         <br/>
     *                         Field description
     *                         <br/>
     *                         <table border="1" cellspacing="0" cellpadding="5px">
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
     *                         <br/>
     *                         <img src="get_action_config_json.png">
     * -------------------------------------------------------
     * 获取交易开关
     *
     * @return 交易开关信息，JSON格式，true 代表收单应用支持该交易，false 代表收单应用不支持该交易
     * @throws RemoteException <p>
     *                         <br/>
     *                         字段说明
     *                         <br/>
     *                         <table border="1" cellspacing="0" cellpadding="5px">
     *                         <tr><th>字段</th><th>说明</th></tr>
     *                         <tr><td>CONSUME</td><td>消费</td></tr>
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
     *                         例子：
     *                         <br/>
     *                         <img src="get_action_config_json.png">
     */
    String getActionConfig();


    /**
     * Get the AID list
     *
     * @return AIDS list, JSON format, true means the purchase application exactly match, false means the application part of the matching
     * @throws RemoteException <br/>
     *                         Example:
     *                         <p>
     *                         <br/>
     *                         <img src="get_aids_json.png">
     * ---------------------------
     * 获取 AID 列表
     *
     * @return AIDS 列表，JSON格式，true 代表收单应用完全匹配，false 代表收单应用部分匹配
     * @throws RemoteException <br/>
     *                         返回例子
     *                         <p>
     *                         <br/>
     *                         <img src="get_aids_json.png">
     */
    String getAids();

    /**
     * Reserved transaction extension interface (not used)
     *
     * 预留交易扩展接口(暂不使用)
     *
     * @param requestData
     * @param listener
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void doAction(VASPayload requestData, IVASListener listener);

    /**
     * Get coupons
     *
     * 获得优惠券
     *
     * @param requestData
     * @param listener
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void getCoupon(VASPayload requestData, IVASListener listener);

    /**
     * Revoke coupon
     *
     * 撤销优惠券
     *
     * @param requestData
     * @param listener
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void voidCoupon(VASPayload requestData, IVASListener listener);

    /**
     * Perform scheduled tasks
     *
     * 执行计划任务
     *
     * @param listener
     * @see IVASListener
     */
    void doTask(IVASListener listener);

    /**
     * Get the scheduled task
     *
     * 获取计划任务
     *
     * @return crontab表达式 crontab expression
     */
    String getTaskConfig();

    /**
     * Tip adjustment
     *
     * 小费调整
     *
     * @param requestData
     * @param listener
     * @see VASPayload
     * @see IVASListener
     */
    void adjustTips(VASPayload requestData, IVASListener listener);

    /**
     * offline
     *
     * 离线
     *
     * @param requestData
     * @param listener
     * @see VASPayload
     * @see IVASListener
     */
    void offline(VASPayload requestData, IVASListener listener);


    /**
     * Scan code
     *
     * 扫码
     *
     * @param requestData
     * @param listener
     * @see VASPayload
     * @see IVASListener
     */
    void scanCode(VASPayload requestData, IVASListener listener);

}