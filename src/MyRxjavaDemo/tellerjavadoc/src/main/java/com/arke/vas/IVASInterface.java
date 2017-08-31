package com.arke.vas;

import android.os.RemoteException;

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
     * @param requestData 消费请求数据，JSON格式
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
     *                    <img src="../../../image/consume_request_emv_json.png">
     * @throws RemoteException
     * @see IVASListener
     * @see VASPayload
     */
    void consume(VASPayload requestData, IVASListener listener);

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
     * @throws RemoteException
     * @see IVASListener
     * @see VASPayload
     */
    void voided(VASPayload requestData, IVASListener listener);

    /**
     * 退货
     *
     * @param requestData 退货请求数据，JSON格式
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
     * @see IVASListener
     * @see VASPayload
     */
    void refund(VASPayload requestData, IVASListener listener);

    /**
     * 预授权
     *
     * @param requestData 请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>交易金额</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方交易订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方传入的需要打印的备注信息</td></tr>
     *                    </table>
     * @param listener    监听器
     *                    <p>
     *                    预授权请求数据例子：
     *                    <br/>
     * @throws RemoteException
     * @see IVASListener
     * @see VASPayload
     */
    void authorization(VASPayload requestData, IVASListener listener);


    /**
     * 离线结算
     *
     * @param requestData 请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>cardNumber</td><td>Double</td><td>卡号</td></tr>
     *                    <tr><td>expiryDate</td><td>String</td><td>有效期</td></tr>
     *                    <tr><td>authorizationMethod</td><td>Boolean</td><td>授权方式</td></tr>
     *                    <tr><td>authorizationCode</td><td>String</td><td>授权码</td></tr>
     *                    </table>
     * @param listener    监听器
     *                    <p>
     *                    离线结算请求数据例子：
     *                    <br/>
     * @throws RemoteException
     * @see IVASListener
     * @see VASPayload
     */
    void offlineSettlement(VASPayload requestData, IVASListener listener);


    /**
     * 离线结算调整
     *
     * @param requestData 请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>原交易凭证号</td></tr>
     *                    </table>
     * @param listener    监听器
     *                    <p>
     *                    离线结算调整请求数据例子：
     *                    <br/>
     * @throws RemoteException
     * @see IVASListener
     * @see VASPayload
     */
    void settlementAdjustment(VASPayload requestData, IVASListener listener);


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
     * @param orderNumber 第三方交易流水
     * @param listener    监听器
     * @throws RemoteException
     * @see IVASListener
     */
    void orderNumberQuery(String orderNumber, IVASListener listener);

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

    /**
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
     *                         </table>
     *                         <br/>
     *                         <p>
     *                         例子：
     *                         <br/>
     *                         <img src="get_action_config_json.png">
     */
    String getActionConfig();


    /**
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
     * 预留交易扩展接口(暂不使用)
     *
     * @param requestData 交易请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see IVASListener
     */
    void doAction(VASPayload requestData, IVASListener listener);

    /**
     * 获得优惠券
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see IVASListener
     */
    void getCoupon(VASPayload requestData, IVASListener listener);

    /**
     * 撤销优惠券
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see IVASListener
     */
    void voidCoupon(VASPayload requestData, IVASListener listener);

    /**
     * 执行计划任务
     *
     * @param listener 监听器
     * @see IVASListener
     */
    void doTask(IVASListener listener);

    /**
     * 获取计划任务
     *
     * @return crontab表达式
     */
    String getTaskConfig();

    /**
     * 小费调整
     *
     * @return crontab表达式
     */
    void adjustTips(VASPayload requestData, IVASListener listener);

    /**
     * 离线
     *
     * @return crontab表达式
     */
    void offline(VASPayload requestData, IVASListener listener);


    /**
     * 预授权撤销
     *
     * @return crontab表达式
     */
    void preAuthorizationVoid(VASPayload requestData, IVASListener listener);

    /**
     * 扫码
     * param requestData 请求数据
     *
     * @see IVASListener
     */
    void scanCode(VASPayload requestData, IVASListener listener);

}