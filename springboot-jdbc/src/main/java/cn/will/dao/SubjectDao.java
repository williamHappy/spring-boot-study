package cn.will.dao;

import cn.will.entity.SubjectEntity;

import java.util.List;

/**
 * Desc:
 * Author: will
 * Date: 11:15 2017/9/29
 */
public interface SubjectDao {

    SubjectEntity selectSubjectById(int id);

    List<SubjectEntity> selectSubjectList();
}
