package com.app.use.webApi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ExceptionController {

    @ExceptionHandler(NullPointerException.class)
    public String NullPointerException() {
        System.out.println("NullPointerExceptionが発生しました。");
        return "error";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String IllegalArgumentExceptionHandler() {
        System.out.println("IllegalArgumentExceptionが発生しました。");
        return "error";
    }

    @ExceptionHandler(Throwable.class)
    public String ThrowableHandler() {
        System.out.println("その他例外が発生しました。");
        return "error";
    }

    @ExceptionHandler(Exception.class)
    public String ExceptionHandler() {
        System.out.println("その他例外が発生しました。");
        return "error";
    }
}
