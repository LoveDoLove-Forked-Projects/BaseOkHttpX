package com.kongzue.baseokhttpx.demo.models;

import com.kongzue.baseokhttp.util.interfaces.JsonValue;

public class ResultModel {

    @JsonValue("name")
    private String name;

    @JsonValue("from")
    private String from;

    @Override
    public String toString() {
        return "ResultModel{" +
                "name='" + name + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}
