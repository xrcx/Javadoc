package com.arke.vas.data;

/**
 * 消息头信息
 */

public class HeadData {
    private String version = "V3.0";

    @Override
    public String toString() {
        return "{\"version\": \"" + this.version + "\"}";
    }
}
