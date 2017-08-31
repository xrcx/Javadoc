package com.landi.apiservice;
import com.landi.apiservice.ThirdPartyCallListener;
interface ThirdPartyCallService {
     /**
      * 签到
      *
      * @param listener 监听器
      * @see ThirdPartyCallListener
      */
     void signIn(ThirdPartyCallListener listener) ;

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
       * @see ThirdPartyCallListener
       * @see TellerRequestData
       */
     void consume(String requestData, ThirdPartyCallListener listener) ;

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
      * @see ThirdPartyCallListener
      * @see TellerRequestData
      */
     void voided(String requestData, ThirdPartyCallListener listener) ;

     /**
      * 结算
      *
      * @param listener 监听器
      * @throws RemoteException
      * @see ThirdPartyCallListener
      */
     void settle(ThirdPartyCallListener listener) ;

     /**
      * 根据第三方交易流水获取交易记录
      * @param orderNumber 第三方交易流水
      * @param listener 监听器
      * @throws RemoteException
      * @see ThirdPartyCallListener
      */
     void orderNumberInquiry(String orderNumber,ThirdPartyCallListener listener) ;

     /**
      * 打印交易汇总
      *
      * @param listener 监听器
      * @throws RemoteException
      * @see ThirdPartyCallListener
      */
     void printTransactionSummary(ThirdPartyCallListener listener) ;

     /**
      * 打印交易明细
      *
      * @param listener 监听器
      * @throws RemoteException
      * @see ThirdPartyCallListener
      */
     void printTransactionDetail(ThirdPartyCallListener listener) ;

     /**
      * 终端密钥管理
      *
      * @param listener 监听器
      * @throws RemoteException
      * @see ThirdPartyCallListener
      */
     void terminalKeyManagement(ThirdPartyCallListener listener) ;

    /**
     * 获取交易开关
     *
     * @return 交易开关信息，JSON格式，true 代表收单应用支持该交易，false 代表收单应用不支持该交易
     * @throws RemoteException
     * <p>
     * <br/>
     * 字段说明
     * <br/>
     * <table border="1" cellspacing="0" cellpadding="5px">
     *     <tr><th>字段</th><th>说明</th></tr>
     *     <tr><td>CONSUME</td><td>消费</td></tr>
     *     <tr><td>VOID</td><td>撤销</td></tr>
     *     <tr><td>SIGNIN</td><td>签到</td></tr>
     *     <tr><td>SETTLE</td><td>结算</td></tr>
     *     <tr><td>ORDER_NUMBER_INQUIRY</td><td>流水号查询</td></tr>
     *     <tr><td>PRINT_TRANSACTION_DETAIL</td><td>打印交易明细</td></tr>
     *     <tr><td>PRINT_TRANSACTION_SUMMARY</td><td>打印交易汇总</td></tr>
     *     <tr><td>TERMINAL_KEY_MANAGEMENT</td><td>终端密钥管理</td></tr>
     * </table>
     * <br/>
     * <p>
     * 例子：
     * <br/>
     * <img src="get_action_config_json.png">
     */
     String getActionConfig() ;


    /**
     * 获取 AID 列表
     *
     * @return AIDS 列表，JSON格式，true 代表收单应用完全匹配，false 代表收单应用部分匹配
     * @throws RemoteException
     * <br/>
     * 返回例子
     * <p>
     * <br/>
     * <img src="get_aids_json.png">
     */
     String getAids() ;

     /**
      * 预留交易扩展接口(暂不使用)
      *
      * @param requestData 交易请求数据
      * @param listener    监听器
      * @throws RemoteException
      * @see ThirdPartyCallListener
      */
     void doAction(String requestData, ThirdPartyCallListener listener);

      /**
        * 获得优惠券
        *
        * @param requestData 请求数据
        * @param listener    监听器
        * @throws RemoteException
        * @see ThirdPartyCallListener
        */
      void getCoupon(String requestData, ThirdPartyCallListener listener);

      /**
        * 撤销优惠券
        *
        * @param requestData 请求数据
        * @param listener    监听器
        * @throws RemoteException
        * @see ThirdPartyCallListener
        */
      void voidCoupon(String requestData, ThirdPartyCallListener listener);
}
