package com.arke.vas.data;

/**
 * @auth hongqy
 */

public class RequestBodyData extends BodyData {

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
     * 有效期
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
     * 收银台收集的卡信息
     *
     * @see TellerCardData
     */
    public TellerCardData tellerCardData;

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
     * 获取 收银台交易数据
     *
     * @return 收银台交易数据
     * @see TellerCardData
     */
    public TellerCardData getTellerCardData() {
        return tellerCardData;
    }

    /**
     * 设置 收银台交易数据
     *
     * @param tellerCardData 收银台交易数据
     * @see TellerCardData
     */
    public void setTellerCardData(TellerCardData tellerCardData) {
        this.tellerCardData = tellerCardData;
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
