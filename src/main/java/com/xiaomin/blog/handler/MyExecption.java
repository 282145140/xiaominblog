package com.xiaomin.blog.handler;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author: xiaomin
 * @Description:
 * @Date Created in 0:24 2019/10/31
 * @Modified By:
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyExecption extends RuntimeException {

    public MyExecption() {
    }

    public MyExecption(String message) {
        super(message);
    }

    public MyExecption(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExecption(Throwable cause) {
        super(cause);
    }

    public MyExecption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
