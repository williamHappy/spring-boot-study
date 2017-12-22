package cn.will.service;

import org.springframework.stereotype.Component;

/**
 * Desc:
 * Author: will
 * Date: 19:37 2017/12/12
 */
@Component
public class Service {
    private final String message;

    public Service(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
