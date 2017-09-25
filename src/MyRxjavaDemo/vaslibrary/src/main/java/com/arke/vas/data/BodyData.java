package com.arke.vas.data;


/**
 * Message body information, specific business data
 * <p>
 * 消息体信息，具体业务数据
 */
public class BodyData {

    /**
     * Value added service order number
     * <p>
     * 增值应用流水
     */
    private String orderNumber;


    /**
     * Get value added service order number
     * <p>
     * 获取 增值应用流水
     *
     * @return Value added service order number
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Set value added service order number
     * <p>
     * 设置 增值应用流水
     *
     * @param orderNumber Value added service order number
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

}

