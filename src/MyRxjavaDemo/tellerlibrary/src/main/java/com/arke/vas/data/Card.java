package com.arke.vas.data;

/**
 * Card basic information
 * <p>
 * 卡基础信息
 */
public class Card {

    /**
     * IC card type.
     * <p>
     * 接触式卡类型.
     */
    public static final int CARD_TYPE_IC = 1;

    /**
     * Contactless card type.
     * <p>
     * 非接卡类型.
     */
    public static final int CARD_TYPE_CONTACTLESS = 2;

    /**
     * Magnetic card type.
     * <p>
     * 磁卡类型类型.
     */
    public static final int CARD_TYPE_MAG = 3;

    /**
     * Manually input card type.
     * <p>
     * 手动输入卡类型.
     */
    public static final int CARD_TYPE_MANUALLY_INPUT = 4;

    /**
     * Magnetic card information, the 1st magnetic track.
     * <p>
     * 磁卡信息，磁道一数据
     */
    private String track1;

    /**
     * Magnetic card information, the 2nd magnetic track.
     * <p>
     * 磁卡信息，磁道二数据
     */
    private String track2;

    /**
     * Magnetic card information, the 3rd magnetic track.
     * <p>
     * 磁卡信息，磁道三数据
     */
    private String track3;

    /**
     * Magnetic card information, The service code, indicates the useful service type of the bank card.
     * <p>
     * 磁卡信息，服务代码表示银行卡有用的服务类型。
     */
    private String serviceCode;


    /**
     * Card type.
     * <p>
     * 卡类型.
     */
    private int type;

    /**
     * Primary amount number.
     * <p>
     * 主帐号.
     */
    private String pan;

    /**
     * The expired date.
     * <p>
     * 卡有效期
     */
    private String expiredDate;

    /**
     * Pan serial number.
     * <p>
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
