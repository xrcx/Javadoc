package com.arke.vas.data;


/**
 * 第三方调用请求数据
 *
 * @author hongqy
 */
public class BodyData {

    /**
     * 操作类型
     */
    private String actionId;

    /**
     * 第三方交易订单号
     */
    private String orderNumber;

    /**
     * 交易金额
     */
    private Double amount;

    /**
     * 当该值为true表示POS不打单，当该值为false或者不存在时表示由POS打
     */
    private Boolean needAppPrinted;

    /**
     * 原交易凭证号
     */
    private String originalVoucherNumber;

    /**
     * 第三方传入的需要打印的备注信息
     */
    private String inputRemarkInfo;

    /**
     * 原交易参考号
     */
    private String originalReferenceNumber;

    /**
     * 卡号
     */
    private String cardNumber;

    /**
     * 有效期D
     */
    private String expiryDate;
    /**
     * 授权方式
     */
    private String authorizationMethod;
    /**
     * 授权码
     */
    private String authorizationCode;

    /**
     * 获取 原交易凭证号
     *
     * @return 原交易凭证号
     */
    public String getOriginalVoucherNumber() {
        return originalVoucherNumber;
    }


    /**
     * 设置 原交易凭证号
     *
     * @param originalVoucherNumber 原交易凭证号
     */
    public void setOriginalVoucherNumber(String originalVoucherNumber) {
        this.originalVoucherNumber = originalVoucherNumber;
    }

    /**
     * 获取 需要打印的备注信息
     *
     * @return 需要打印的备注信息
     */
    public String getInputRemarkInfo() {
        return inputRemarkInfo;
    }

    /**
     * 设置 需要打印的备注信息
     *
     * @param inputRemarkInfo 需要打印的备注信息
     */
    public void setInputRemarkInfo(String inputRemarkInfo) {
        this.inputRemarkInfo = inputRemarkInfo;
    }

    /**
     * 获取 交易金额
     *
     * @return 交易金额
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * 设置 交易金额
     *
     * @param amount 交易金额
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 获取 是否由第三方打印
     *
     * @return 是否由第三方打印
     */
    public Boolean getNeedAppPrinted() {
        return needAppPrinted;
    }

    /**
     * 设置 是否由第三方打印
     *
     * @param needAppPrinted 是否由第三方打印
     */
    public void setNeedAppPrinted(Boolean needAppPrinted) {
        this.needAppPrinted = needAppPrinted;
    }

    /**
     * 获取 第三方交易订单号
     *
     * @return 第三方交易订单号
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置 第三方交易订单号
     *
     * @param orderNumber 第三方交易订单号
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 获取 操作类型
     *
     * @return 操作类型
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * 设置 操作类型
     *
     * @param actionId 操作类型
     */
    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getOriginalReferenceNumber() {
        return originalReferenceNumber;
    }

    public void setOriginalReferenceNumber(String originalReferenceNumber) {
        this.originalReferenceNumber = originalReferenceNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getAuthorizationMethod() {
        return authorizationMethod;
    }

    public void setAuthorizationMethod(String authorizationMethod) {
        this.authorizationMethod = authorizationMethod;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }
}

