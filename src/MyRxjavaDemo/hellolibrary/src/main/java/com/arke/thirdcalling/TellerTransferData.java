package com.arke.thirdcalling;

/**
 * Created by Annie on 2017/7/4.
 */
public class TellerTransferData {
    /**
     *
     */
    private String card;

    /**
     *
     */
    private String aid;

    /**
     *
     */
    private String pid;

    /**
     *
     */
    private byte kernelId;

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
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
