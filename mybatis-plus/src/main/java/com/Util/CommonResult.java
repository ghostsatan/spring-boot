package com.Util;

public class CommonResult<T> {

    private T data;
    private String msg;
    private Integer code;

    public CommonResult() {

    }

    public CommonResult(T data) {
        this.data = data;
        this.msg = "success";
        this.code = 200;
    }

    public CommonResult(T data, String msg, Integer code) {
        this.data = data;
        this.msg = msg;
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
