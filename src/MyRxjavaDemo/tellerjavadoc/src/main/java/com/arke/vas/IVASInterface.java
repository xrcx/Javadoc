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

    /**
     * 退货
     *
     * @param requestData 退货交易，请求参数
     *                    <p>
     *                    消息体(body)请求参数如下，JSON格式，可选
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>交易金额</td></tr>
     *                    <tr><td>originalReferenceNumber</td><td>String</td><td>原交易参考号</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方增值服务订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方增值服务打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>增值服务传入的需要打印的备注信息</td></tr>
     *                    </table>
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void refund(VASPayload requestData, IVASListener listener);

    /**
     * 预授权
     *
     * @param requestData 预授权交易，请求参数
     *                    <p>
     *                    <li>消息体(body)请求参数如下，JSON格式，可选<li/>
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>交易金额</td></tr>
     *                    <tr><td>cardNumber</td><td>Double</td><td>卡号</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方增值服务订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方增值服务打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>增值服务传入的需要打印的备注信息</td></tr>
     *                    </table>
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void authorization(VASPayload requestData, IVASListener listener);

    /**
     * 预授权撤销
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    void preAuthorizationVoid(VASPayload requestData, IVASListener listener);

    /**
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
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void offlineSettlement(VASPayload requestData, IVASListener listener);


    /**
     * 离线结算调整
     *
     * @param requestData 离线结算调整，请求参数
     *                    <p>消息体(body)请求参数如下，JSON格式，可选
     *                    <p><table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>originalVoucherNumber</td><td>String</td><td>原交易凭证号</td></tr>
     *                    </table>
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void settlementAdjustment(VASPayload requestData, IVASListener listener);

    /**
     * 获取交易开关
     *
     * @return 交易开关信息，JSON格式，true 代表收单应用支持该交易，false 代表收单应用不支持该交易
     * <p>
     * 字段说明
     * <p><table border="1" cellspacing="0" cellpadding="5px">
     * <tr><th>字段</th><th>说明</th></tr>
     * <tr><td>SALE</td><td>消费</td></tr>
     * <tr><td>VOID</td><td>撤销</td></tr>
     * <tr><td>SIGNIN</td><td>签到</td></tr>
     * <tr><td>SETTLE</td><td>结算</td></tr>
     * <tr><td>ORDER_NUMBER_INQUIRY</td><td>流水号查询</td></tr>
     * <tr><td>PRINT_TRANSACTION_DETAIL</td><td>打印交易明细</td></tr>
     * <tr><td>PRINT_TRANSACTION_SUMMARY</td><td>打印交易汇总</td></tr>
     * <tr><td>TERMINAL_KEY_MANAGEMENT</td><td>终端密钥管理</td></tr>
     * <tr><td>REFUND</td><td>退货</td></tr>
     * <tr><td>PRE_AUTHORIZATION</td><td>预授权</td></tr>
     * <tr><td>PRE_AUTH_VOID</td><td>预授权撤销</td></tr>
     * <tr><td>OFFLINE_SETTLEMENT</td><td>离线结算</td></tr>
     * <tr><td>SETTLEMENT_ADJUSTMENT</td><td>离线结算调整</td></tr>
     * <tr><td>DOTASK</td><td>执行计划任务</td></tr>
     * <tr><td>ADJUST_TIPS</td><td>小费调整</td></tr>
     * <tr><td>OFFLINE</td><td>离线</td></tr>
     * <tr><td>SCAN</td><td>扫码</td></tr>
     * </table>
     * <br/>
     * <p>
     * 返回数据的例子：
     * <p>
     * <img src="../../../image/get_action_config_json.png">
     * @throws RemoteException
     */
    String getActionConfig();


    /**
     * 获取 AID 列表
     *
     * @return AIDS 列表，JSON格式，true 代表收单应用完全匹配，false 代表收单应用部分匹配
     * <p>
     * 返回例子
     * <p>
     * <img src="../../../image/get_aids_json.png">
     * @throws RemoteException
     */
    String getAids();

    /**
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
     * 获得优惠券
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
     * @see IVASListener
     */
    void getCoupon(VASPayload requestData, IVASListener listener);

    /**
     * 撤销优惠券
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see VASPayload
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
     * @param requestData 请求数据
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    void adjustTips(VASPayload requestData, IVASListener listener);

    /**
     * 离线
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    void offline(VASPayload requestData, IVASListener listener);


    /**
     * 扫码
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @see VASPayload
     * @see IVASListener
     */
    void scanCode(VASPayload requestData, IVASListener listener);

}