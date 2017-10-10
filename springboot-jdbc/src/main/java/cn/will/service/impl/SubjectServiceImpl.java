package cn.will.service.impl;

import cn.will.dao.SubjectDao;
import cn.will.entity.SubjectEntity;
import cn.will.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc:
 * Author: will
 * Date: 11:31 2017/9/29
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectDao subjectDao;

    @Override
    public SubjectEntity findSubjectById(int id) {
        return subjectDao.selectSubjectById(id);
    }

    @Override
    public List<SubjectEntity> findSubject() {
        return subjectDao.selectSubjectList();
    }
}
