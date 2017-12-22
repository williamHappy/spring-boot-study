package cn.will.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Desc:
 * Author: will
 * Date: 19:27 2017/12/12
 */
@ConfigurationProperties("service")
public class ServiceProperties {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
