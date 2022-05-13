package com.chuwa.vo;

import org.aspectj.apache.bcel.classfile.Code;

public class CodeMsg {
    private int code;
    private String msg;


    public static CodeMsg SUCCESS = new CodeMsg(0,"success");
    public static CodeMsg SELECT_ERROR = new CodeMsg(1000,"fail");

    public CodeMsg() {
    }

    public CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
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

    public static CodeMsg getSUCCESS() {
        return SUCCESS;
    }

    public static void setSUCCESS(CodeMsg SUCCESS) {
        CodeMsg.SUCCESS = SUCCESS;
    }

    public static CodeMsg getSelectError() {
        return SELECT_ERROR;
    }

    public static void setSelectError(CodeMsg selectError) {
        SELECT_ERROR = selectError;
    }
}
