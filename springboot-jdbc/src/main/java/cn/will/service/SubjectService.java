package cn.will.service;

import cn.will.entity.SubjectEntity;

import java.util.List;

/**
 * Desc:
 * Author: will
 * Date: 11:29 2017/9/29
 */
public interface SubjectService {

    SubjectEntity findSubjectById(int id);

    List<SubjectEntity> findSubject();
}
