package com.arke.vas.data;


/**
 * 响应消息体信息，具体响应数据
 */
public class ResponseBodyData extends BodyData {

    /**
     * 接口Id
     */
    private String interfaceId;

    /**
     * 交易返回码
     */
    private int responseCode = 0;

    /**
     * 交易返回信息
     */
    private String responseMessage;

    /**
     * 交易类型
     */
    private String transactionType;

    /**
     * 包名
     */
    private String packageName;

    /**
     * 39域返回码
     */
    private String responseCodeThirtyNine;

    /**
     * 39域返回信息
     */
    private String responseMessageThirtyNine;

    /**
     * 交易金额
     */
    private Double amount;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 商户编号
     */
    private String merchantNumber;

    /**
     * 终端号
     */
    private String terminalNumber;

    /**
     * 操作员号
     */
    private String operatorNumber;

    /**
     * 卡号
     */
    private String cardNumber;

    /**
     * 卡有效期
     */
    private String expirationDate;

    /**
     * 批次号
     */
    private String batchNumber;
    /**
     * 凭证号
     */
    private String voucherNumber;
    /**
     * 参考号
     */
    private String referenceNumber;
    /**
     * 授权码
     */
    private String authCode;
    /**
     * 交易日期
     */
    private String transactionDate;

    /**
     * 交易时间
     */
    private String transactionTime;

    /**
     * 是否被撤销
     */
    private Boolean voided = null;

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getResponseCodeThirtyNine() {
        return responseCodeThirtyNine;
    }

    public void setResponseCodeThirtyNine(String responseCodeThirtyNine) {
        this.responseCodeThirtyNine = responseCodeThirtyNine;
    }

    public String getResponseMessageThirtyNine() {
        return responseMessageThirtyNine;
    }

    public void setResponseMessageThirtyNine(String responseMessageThirtyNine) {
        this.responseMessageThirtyNine = responseMessageThirtyNine;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantNumber() {
        return merchantNumber;
    }

    public void setMerchantNumber(String merchantNumber) {
        this.merchantNumber = merchantNumber;
    }

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public String getOperatorNumber() {
        return operatorNumber;
    }

    public void setOperatorNumber(String operatorNumber) {
        this.operatorNumber = operatorNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Boolean getVoided() {
        return voided;
    }

    public void setVoided(Boolean voided) {
        this.voided = voided;
    }
}
