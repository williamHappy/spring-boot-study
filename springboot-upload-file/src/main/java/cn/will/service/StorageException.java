package cn.will.service;

import java.io.IOException;

/**
 * Desc:
 * Author: will
 * Date: 17:23 2017/11/8
 */
public class StorageException extends RuntimeException {
    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageException(String message) {
        super(message);
    }
}
