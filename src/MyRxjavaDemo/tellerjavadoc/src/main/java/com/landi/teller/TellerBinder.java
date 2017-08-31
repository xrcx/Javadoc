package com.landi.teller;

import android.os.RemoteException;

import com.landi.apiservice.IThirdPartyCallListener;
import com.landi.apiservice.ThirdPartyCallListener;
import com.landi.apiservice.ThirdPartyCallService;

/**
 * @auth hongqy
 */


public class TellerBinder extends ThirdPartyCallService.Stub {


    @Override
    /**
     * 签到
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener

     */
    public void signIn(ThirdPartyCallListener listener) throws RemoteException {

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
     * @see IThirdPartyCallListener
     * @see TellerRequestData
     */
    @Override
    public void consume(String requestData, ThirdPartyCallListener listener) throws RemoteException {

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
     * @see IThirdPartyCallListener
     * @see TellerRequestData
     */
    @Override
    public void voided(String requestData, ThirdPartyCallListener listener) throws RemoteException {

    }

    /**
     * 结算
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IThirdPartyCallListener
     */
    @Override
    public void settle(ThirdPartyCallListener listener) throws RemoteException {

    }

    /**
     * 根据第三方交易流水获取交易记录
     *
     * @param orderNumber 第三方交易流水
     * @param listener    监听器
     * @throws RemoteException
     * @see IThirdPartyCallListener
     */
    @Override
    public void orderNumberInquiry(String orderNumber, ThirdPartyCallListener listener) throws RemoteException {

    }

    /**
     * 打印交易汇总
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IThirdPartyCallListener
     */
    @Override
    public void printTransactionSummary(ThirdPartyCallListener listener) throws RemoteException {

    }

    /**
     * 打印交易明细
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IThirdPartyCallListener
     */
    @Override
    public void printTransactionDetail(ThirdPartyCallListener listener) throws RemoteException {

    }

    /**
     * 终端密钥管理
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IThirdPartyCallListener
     */
    @Override
    public void terminalKeyManagement(ThirdPartyCallListener listener) throws RemoteException {

    }

    /**
     * 获取交易开关
     *
     * @return 交易开关信息，JSON格式，true 代表收单应用支持该交易，false 代表收单应用不支持该交易
     * <p>
     * <br/>
     * 字段说明
     * <br/>
     * <table border="1" cellspacing="0" cellpadding="5px">
     * <tr><th>字段</th><th>说明</th></tr>
     * <tr><td>CONSUME</td><td>消费</td></tr>
     * <tr><td>VOID</td><td>撤销</td></tr>
     * <tr><td>SIGNIN</td><td>签到</td></tr>
     * <tr><td>SETTLE</td><td>结算</td></tr>
     * <tr><td>ORDER_NUMBER_INQUIRY</td><td>流水号查询</td></tr>
     * <tr><td>PRINT_TRANSACTION_DETAIL</td><td>打印交易明细</td></tr>
     * <tr><td>PRINT_TRANSACTION_SUMMARY</td><td>打印交易汇总</td></tr>
     * <tr><td>TERMINAL_KEY_MANAGEMENT</td><td>终端密钥管理</td></tr>
     * </table>
     * <br/>
     * <p>
     * 例子：
     * <br/>
     * <img src="../../../image/get_action_config_json.png">
     * @throws RemoteException <p>
     */
    @Override
    public String getActionConfig() throws RemoteException {
        return null;
    }

    /**
     * 获取 AID 列表
     *
     * @return AIDS 列表，JSON格式，true 代表收单应用完全匹配，false 代表收单应用部分匹配
     * <br/>
     * 返回例子
     * <p>
     * <br/>
     * <img src="../../../image/get_aids_json.png">
     * @throws RemoteException
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
     * @see IThirdPartyCallListener
     */
    @Override
    public void doAction(String requestData, ThirdPartyCallListener listener) throws RemoteException {

    }

    /**
     * 获得优惠券
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see IThirdPartyCallListener
     */
    @Override
    public void getCoupon(String requestData, ThirdPartyCallListener listener) throws RemoteException {

    }

    /**
     * 撤销优惠券
     *
     * @param requestData 请求数据
     * @param listener    监听器
     * @throws RemoteException
     * @see IThirdPartyCallListener
     */
    @Override
    public void voidCoupon(String requestData, ThirdPartyCallListener listener) throws RemoteException {

    }
}
