package com.senati.senati_web_casafranca.model;

public class Response {
    private int code;
    private String status;
    private String message;

    public Response(){
        this.code = 200;
        this.status = "success";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
