package com.arke.vas.data;

/**
 * 消息载体
 */
public class VASPayload {
    /**
     * 消息头信息，Json 格式
     *
     * @see HeadData
     */
    private String head;


    /**
     * 消息体信息，Json 格式
     *
     * @see BodyData
     */
    private String body;

    /**
     * 消息头信息，Json 格式
     * <p>
     * 例子：
     * <p>
     * <img src="../../../image/head_json.png">
     *
     * @see HeadData
     */
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    /**
     * 消息体信息，Json 格式
     * <p>
     * 消费请求数据例子：
     * <p>
     * <img src="../../../image/consume_request_emv_json.png">
     *
     * @see BodyData
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
