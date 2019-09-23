package com.leee.miaosha.result;

import com.sun.org.apache.bcel.internal.classfile.Code;

public class Result<T> {

    private int code;
    private String msg;
    private T data;


    //成功时调用
    public static <T> Result<T> success(T data){
        return new Result<T>(0,"success",data);
    }

    //失败时调用
    public static <T> Result<T> error(CodeMsg codeMsg){
        return new Result<T>(codeMsg);
    }

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private Result(CodeMsg codeMsg){
        if (codeMsg==null){
            return;
        }
        else {
            this.code=codeMsg.getCode();
            this.msg=codeMsg.getMsg();
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
