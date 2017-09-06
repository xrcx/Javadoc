package com.arke.vas.data;

/**
 * @auth hongqy
 */

public class HeadData {
    private String version = "V3.0";

    @Override
    public String toString() {
        return "{\"version\": \"" + this.version + "\"}";
    }
}
