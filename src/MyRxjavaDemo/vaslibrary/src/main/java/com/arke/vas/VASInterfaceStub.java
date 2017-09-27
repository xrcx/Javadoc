package com.arke.vas;

import android.os.RemoteException;

import com.arke.vas.data.VASPayload;


/**
 * Value added service interface  binder
 * <p>
 * 增值业务接口 Binder
 */
public class VASInterfaceStub extends IVASInterface.Stub {

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
    @Override
    public void sale(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

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
    @Override
    public void voided(VASPayload requestData, IVASListener listener) throws RemoteException {

    }

    /**
     * Settlement
     * <p>
     * 结算
     *
     * @param listener
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void settle(IVASListener listener) throws RemoteException {

    }

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

}
