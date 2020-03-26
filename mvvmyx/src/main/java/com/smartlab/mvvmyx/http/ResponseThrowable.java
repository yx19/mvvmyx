package com.smartlab.mvvmyx.http;

/**
 * Created by yx on 2020.3.26.
 */

public class ResponseThrowable extends Exception {
    public int code;
    public String message;

    public ResponseThrowable(Throwable throwable, int code) {
        super(throwable);
        this.code = code;
    }
}
