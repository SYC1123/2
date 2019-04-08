package com.example;

public class Robot {

    /**
     * code : 200000
     * text : 亲，已帮你找到航班信息
     * url : http://touch.qunar.com/h5/flight/flightlist...
     */

    private int code;
    private String text;
    private String url;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
