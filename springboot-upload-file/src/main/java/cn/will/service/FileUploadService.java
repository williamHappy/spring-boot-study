package cn.will.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Desc:
 * Author: will
 * Date: 17:14 2017/11/8
 */
public interface FileUploadService {

    void init();

    void store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String fileName);

    Resource loadAsResource(String fileName);

    void deleteAll();

}
