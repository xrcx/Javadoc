package com.arke.vas;

import android.os.RemoteException;

/**
 * @auth hongqy
 */

public class TellerBinder  extends IVASInterface.Stub {
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
    @Override
    public void consume(VASPayload requestData, IVASListener listener) throws RemoteException {

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
     * @throws RemoteException
     * @see IVASListener
     * @see VASPayload
     */
    @Override
    public void voided(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

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
    @Override
    public void refund(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

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
    @Override
    public void authorization(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

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
    @Override
    public void offlineSettlement(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

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
    @Override
    public void settlementAdjustment(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
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
     * 根据第三方交易流水获取交易记录
     *
     * @param orderNumber 第三方交易流水
     * @param listener    监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void orderNumberQuery(String orderNumber, IVASListener listener) throws RemoteException {

    }

    /**
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
    @Override
    public String getActionConfig() throws RemoteException {
        return null;
    }

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
    @Override
    public String getAids() throws RemoteException {
        return null;
    }

    /**
     * 预留交易扩展接口(暂不使用)
     *
     * @param requestData 交易请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void doAction(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * 获得优惠券
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void getCoupon(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * 撤销优惠券
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void voidCoupon(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * 执行计划任务
     *
     * @param listener 监听器
     * @see IVASListener
     */
    @Override
    public void doTask(IVASListener listener) throws RemoteException {

    }

    /**
     * 获取计划任务
     *
     * @return crontab表达式
     */
    @Override
    public String getTaskConfig() throws RemoteException {
        return null;
    }

    /**
     * 小费调整
     *
     * @param requestData
     * @param listener
     * @return crontab表达式
     */
    @Override
    public void adjustTips(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * 离线
     *
     * @param requestData
     * @param listener
     * @return crontab表达式
     */
    @Override
    public void offline(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * 预授权撤销
     *
     * @param requestData
     * @param listener
     * @return crontab表达式
     */
    @Override
    public void preAuthorizationVoid(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * 扫码
     * param requestData 请求数据
     *
     * @param requestData
     * @param listener
     * @see IVASListener
     */
    @Override
    public void scanCode(VASPayload requestData, IVASListener listener) throws RemoteException {

    }
}
