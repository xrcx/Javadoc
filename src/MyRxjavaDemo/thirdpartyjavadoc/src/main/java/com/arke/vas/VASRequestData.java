package com.arke.vas;


/**
 * Value added service request data
 *
 * @author hongqy
 */
public class VASRequestData {

    /**
     * 操作类型
     */
    String actionId;
    /**
     * 第三方交易订单号
     */
    String orderNumber;

    /**
     * 交易金额
     */
    Double amount;

    /**
     * 当该值为true表示POS不打单，当该值为false或者不存在时表示由POS打
     */
    Boolean needAppPrinted;

    /**
     * 原交易凭证号
     */
    String originalVoucherNumber;

    /**
     * 第三方传入的需要打印的备注信息
     */
    String inputRemarkInfo;

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


    public String getOriginalVoucherNumber() {
        return originalVoucherNumber;
    }

    public void setOriginalVoucherNumber(String originalVoucherNumber) {
        this.originalVoucherNumber = originalVoucherNumber;
    }

    public String getInputRemarkInfo() {
        return inputRemarkInfo;
    }

    public void setInputRemarkInfo(String inputRemarkInfo) {
        this.inputRemarkInfo = inputRemarkInfo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getNeedAppPrinted() {
        return needAppPrinted;
    }

    public void setNeedAppPrinted(Boolean needAppPrinted) {
        this.needAppPrinted = needAppPrinted;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getActionId() {
        return actionId;
    }

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
}

