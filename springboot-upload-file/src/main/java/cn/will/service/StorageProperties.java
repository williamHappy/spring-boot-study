package cn.will.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Desc:
 * Author: will
 * Date: 13:46 2017/11/10
 */
@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}