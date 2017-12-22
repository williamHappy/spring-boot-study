package cn.will.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Desc:
 * Author: will
 * Date: 17:58 2017/12/18
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String name;
    private String blog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", blog='" + blog + '\'' +
                '}';
    }
}
