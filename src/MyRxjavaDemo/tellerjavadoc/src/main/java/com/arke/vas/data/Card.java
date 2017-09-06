package com.arke.vas.data;

/**
 * 卡基础信息
 */
public class Card {

    /**
     * 接触式卡.
     */
    public static final int CARD_TYPE_IC = CardType.IC;

    /**
     * 非接卡类型.
     */
    public static final int CARD_TYPE_CONTACTLESS = CardType.RF;

    /**
     * 磁卡类型.
     */
    public static final int CARD_TYPE_MAG = 3;

    /**
     * 手动输入卡类型.
     */
    public static final int CARD_TYPE_MANUALLY_INPUT = 4;

    /**
     * 卡类型.
     */
    private int type;

    /**
     * 主帐号.
     */
    private String pan;

    /**
     * 卡有效期.
     */
    private String expiredDate;

    /**
     * 卡序列号.
     */
    private String panSequenceNumber;


    public Card() {
    }

    public Card(int type) {
        this.type = type;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getPanSequenceNumber() {
        return panSequenceNumber;
    }

    public void setPanSequenceNumber(String panSequenceNumber) {
        this.panSequenceNumber = panSequenceNumber;
    }
}
