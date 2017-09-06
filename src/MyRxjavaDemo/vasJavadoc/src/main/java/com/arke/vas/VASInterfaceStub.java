package com.arke.vas;

import android.os.RemoteException;

import com.arke.vas.data.VASPayload;


/**
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
     * 消费
     *
     * @param requestData 消费请求数据，JSON格式
     *                    <table border="1" cellspacing="0" cellpadding="5px">
     *                    <tr><th>参数</th><th>类型</th><th>说明</th></tr>
     *                    <tr><td>amount</td><td>Double</td><td>交易金额</td></tr>
     *                    <tr><td>orderNumber</td><td>String</td><td>第三方交易订单号</td></tr>
     *                    <tr><td>needAppPrinted</td><td>Boolean</td><td>是否需要第三方打单</td></tr>
     *                    <tr><td>inputRemarkInfo</td><td>String</td><td>第三方传入的需要打印的备注信息</td></tr>
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
    public void sale(VASPayload requestData, IVASListener listener) throws RemoteException {

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
     * 结算
     *
     * @param listener 监听器
     * @throws RemoteException
     * @see IVASListener
     */
    @Override
    public void settle(IVASListener listener) throws RemoteException {

    }


    @Override
    public void orderNumberQuery(VASPayload requestData, IVASListener listener) throws RemoteException {

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

}
