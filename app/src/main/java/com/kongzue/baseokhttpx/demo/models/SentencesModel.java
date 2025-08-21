package com.kongzue.baseokhttpx.demo.models;

import com.kongzue.baseokhttp.util.interfaces.JsonValue;

public class SentencesModel{

    @JsonValue("code")
    private int code;

    @JsonValue("message")
    private String message;

    @JsonValue("result")
    private ResultModel result;

    @Override
    public String toString() {
        return "SentencesModel{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
