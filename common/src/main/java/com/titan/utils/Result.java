package com.titan.utils;


import com.titan.xss.Code;
import com.titan.xss.ResultCode;

/**
 * @author yigeoooo
 */
public class Result<T> {


    private int code;

    private String resultMessage;

    private String messageCode;

    private String[] messageParams;

    private T body = null;

    private String link = "";

    public Result() {
        this.code = ResultCode.SUCCESS.getCode();
        this.resultMessage = ResultCode.SUCCESS.getMessage();
        this.messageCode = ResultCode.SUCCESS.getName();
    }

    private Result(int code, String messageCode, String resultMessage, T body, String link, String ... params) {
        this.code = code;
        this.resultMessage = resultMessage;
        this.messageCode = messageCode;
        this.body = body;
        this.link = link;
        this.messageParams = params;
    }

    public static <T> Result<T> build() {
        return new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getName(),ResultCode.SUCCESS.getMessage(), (Object)null,"",null);
    }

    public boolean isSuccess() {
        return ResultCode.SUCCESS.getCode().equals(this.code);
    }

    public static <T> T ofNullable(Result<T> result) {
        return result != null && result.isSuccess() ? result.getBody() : null;
    }

    public static <T> T ofNullable(Result<T> result, T value) {
        return result != null && result.isSuccess() ? result.getBody() : value;
    }

    public static <T> Result<T> build(Code code) {
        return new Result(code.getCode(), code.getName(), code.getMessage() ,(Object)null,"",null);
    }

    public static <T> Result<T> link(String link) {
        return new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getName(),ResultCode.SUCCESS.getMessage(), (Object)null,link,null);
    }

    public static <T> Result<T> build(int resultCode, String messageCode, String message, T body, String ... params) {
        return new Result(resultCode, messageCode, message ,(Object)body,"",params);
    }

    public static <T> Result<T> build(T body) {
        return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getName(), ResultCode.SUCCESS.getMessage() , body,"",null);
    }

    public T getBody() {
        return this.body;
    }

    public Result<T> setBody(T body) {
        this.body = body;
        return this;
    }

    public int getResultCode() {
        return code;
    }

    public void setResultCode(int resultCode) {
        this.code = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String[] getMessageParams() {
        return messageParams;
    }

    public void setMessageParams(String[] messageParams) {
        this.messageParams = messageParams;
    }

}
