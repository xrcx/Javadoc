package com.arke.vas.data;


/**
 * 收银台获取的卡信息
 */
public class TellerCardData {

    /**
     * 卡信息，磁卡或者 CPU 卡相关信息。
     */
    private Card card;

    /**
     * 当前交易是 EMV 流程的时候，收银台会传用户选择的 AID 过来。
     */
    private String aid;

    /**
     * 当前交易内核类型是 VISA 的时候，内核会传出 PID。
     */
    private String pid;

    /**
     * 内核类型。
     */
    private byte kernelId;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public byte getKernelId() {
        return kernelId;
    }

    public void setKernelId(byte kernelId) {
        this.kernelId = kernelId;
    }
}
