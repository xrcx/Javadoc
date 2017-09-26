package com.arke.vas.data;

/**
 * 消息头信息
 */
public class HeadData {
    /**
     * 版本号
     */
    private String version = "V1.2.0";

    @Override
    public String toString() {
        return "{\"version\": \"" + this.version + "\"}";
    }
}
