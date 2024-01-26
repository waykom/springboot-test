package org.example.lang.bean;

public class Response {
    private int code;
    private String message;
    private Object data;

    Response(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Response ok(String message, Object data) {
        return new Response(200, message, data);
    }

    public static Response ok(String message) {
        return new Response(200, message, null);
    }

    public static Response error(String message, Object data) {
        return new Response(500, message, data);
    }

    public static Response error(String message) {
        return new Response(500, message, null);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
