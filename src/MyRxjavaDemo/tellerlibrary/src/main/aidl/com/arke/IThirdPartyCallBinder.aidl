package com.arke;
import com.arke.IThirdPartyCallListener;
interface IThirdPartyCallBinder {
    /**
     * 签到
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    void signIn(IThirdPartyCallListener listener);

    /**
     * 消费
     *
     * @param requestData 消费请求数据，JSON格式
     * @param listener    监听器
     * @see IThirdPartyCallListener
     */
    void consume(String requestData, IThirdPartyCallListener listener);

    /**
     * 消费撤销
     *
     * @param requestData 消费请求数据，JSON格式
     * @param listener    监听器
     * @see IThirdPartyCallListener
     */
    void voided(String requestData, IThirdPartyCallListener listener);

    /**
     * 结算
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    void settle(IThirdPartyCallListener listener);

    /**
     * 打印交易汇总
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    void printTransactionSummary(IThirdPartyCallListener listener);

    /**
     * 打印交易明细
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    void printTransactionDetail(IThirdPartyCallListener listener);

    /**
     * 终端密钥管理
     *
     * @param listener 监听器
     * @see IThirdPartyCallListener
     */
    void terminalKeyManagement(IThirdPartyCallListener listener);

    /**
     * 获取交易开关
     *
     * @return 交易开关信息
     */
    String getActionConfig() ;

    /**
     * 获取 AID 列表
     *
     * @return
     */
    String getAids() ;

    /**
     * 预留交易扩展接口(暂不使用)
     *
     * @param requestData 交易请求数据
     * @param listener    监听器
     */
    void doAction(String requestData, IThirdPartyCallListener listener) ;
}
