package cn.will.controller;

import cn.will.entity.SubjectEntity;
import cn.will.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Desc:
 * Author: will
 * Date: 11:34 2017/9/29
 */
@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public SubjectEntity getSubjectById(@PathVariable("id") int id) {
        return subjectService.findSubjectById(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<SubjectEntity> getSubjectList() {
        return subjectService.findSubject();
    }
}
