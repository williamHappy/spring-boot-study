package cn.will.dao.impl;

import cn.will.dao.SubjectDao;
import cn.will.entity.SubjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Desc:
 * Author: will
 * Date: 11:19 2017/9/29
 */
@Repository
public class SubjectDaoImpl implements SubjectDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public SubjectEntity selectSubjectById(int id) {
        List<SubjectEntity> list = jdbcTemplate.query("select * from subject where id = ?", new Object[]{id}, new BeanPropertyRowMapper(SubjectEntity.class));
        if (null != list && list.size() > 0) {
            SubjectEntity subjectEntity = list.get(0);
            return subjectEntity;
        } else {
            return null;
        }

    }

    @Override
    public List<SubjectEntity> selectSubjectList() {
        List<SubjectEntity> list = jdbcTemplate.query("select * from subject", new Object[]{}, new BeanPropertyRowMapper(SubjectEntity.class));
        if (null != list && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
