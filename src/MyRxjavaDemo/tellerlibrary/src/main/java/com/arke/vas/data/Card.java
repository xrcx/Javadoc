package com.arke.vas.data;

/**
 * 卡基础信息
 */
public class Card {

    /**
     * 接触式卡.
     */
    public static final int CARD_TYPE_IC = 1;

    /**
     * 非接卡类型.
     */
    public static final int CARD_TYPE_CONTACTLESS = 2;

    /**
     * 磁卡类型.
     */
    public static final int CARD_TYPE_MAG = 3;

    /**
     * 手动输入卡类型.
     */
    public static final int CARD_TYPE_MANUALLY_INPUT = 4;

    private String track1;
    private String track2;
    private String track3;
    private String serviceCode;


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

    public String getTrack1() {
        return track1;
    }

    public void setTrack1(String track1) {
        this.track1 = track1;
    }

    public String getTrack2() {
        return track2;
    }

    public void setTrack2(String track2) {
        this.track2 = track2;
    }

    public String getTrack3() {
        return track3;
    }

    public void setTrack3(String track3) {
        this.track3 = track3;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
}
