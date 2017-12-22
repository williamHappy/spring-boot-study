package cn.will.service;

/**
 * Desc:
 * Author: will
 * Date: 17:39 2017/11/8
 */
public class StorageFileNotFoundException extends StorageException {
    public StorageFileNotFoundException(String s) {
        super(s);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
