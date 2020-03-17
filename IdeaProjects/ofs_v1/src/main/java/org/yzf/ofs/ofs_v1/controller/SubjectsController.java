package org.yzf.ofs.ofs_v1.controller;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.yzf.ofs.ofs_v1.entity.Subjects;
import org.yzf.ofs.ofs_v1.resultUtil.Result;
import org.yzf.ofs.ofs_v1.resultUtil.ResultEnum;
import org.yzf.ofs.ofs_v1.resultUtil.ResultUtil;
import org.yzf.ofs.ofs_v1.service.SubjectsService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/subjects")
public class SubjectsController {

    @Autowired
    private SubjectsService subjectsService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Subjects> getAllSubjects() {
        List<Subjects> retList = subjectsService.getAllSubjects();
        return retList;
    }

    @RequestMapping(value = "/addByJson", method = RequestMethod.POST)
    public int updateSubjectsByJson(@RequestBody Subjects subjects) {
        int ret = subjectsService.addSubjectsOne(subjects);
        return ret;
    }

    @RequestMapping(value = "/updByJson", method = RequestMethod.POST)
    public int updSubjectsByJson(@RequestBody Subjects subjects) {
        int ret = subjectsService.updateById(subjects);
        return ret;
    }

    @RequestMapping(value = "/deleteSubjects", method = RequestMethod.POST)
    public int deleteSubjects(Integer subjectsId) {
        int ret = subjectsService.deleteById(subjectsId);
        return ret;
    }

    @RequestMapping(value = "/updateSubjects", method = RequestMethod.POST)
    public int updateSubjects(Subjects subjects) {
        int ret = subjectsService.updateById(subjects);
        return ret;
    }

    @RequestMapping(value = "/addSubjectsOne", method = RequestMethod.POST)
    public int addSubjectsOne(@RequestBody Subjects subjects) {
        return subjectsService.addSubjectsOne(subjects);
    }

    @RequestMapping(value = "/addSubjectsSelective", method = RequestMethod.POST)
    public int addSubjectsSelective(@RequestBody Subjects subjects) {
        return subjectsService.addSubjectsSelective(subjects);
    }

    @RequestMapping(value = "/addSubject", method = RequestMethod.GET)
    public String addSubject(@RequestParam("subjectsId") Integer subjectsId,
                             @RequestParam("subjectsName") String subjectsName,
                             @RequestParam("subjectsRem") String subjectsRem) {
        Subjects subject = new Subjects();
        subject.setSubjectsId(subjectsId);
        subject.setSubjectsName(subjectsName);
        subject.setSubjectsRem(subjectsRem);
        subjectsService.addSubject(subject);
        return "insert success: " + "[ subjectsId:" + subjectsId + " subjectsName:" + subjectsName + " subjectsRem:" + subjectsRem + "]";
    }

    @RequestMapping(value = "/addSubjects", method = RequestMethod.POST)
    @ResponseBody
    public Result addSubjects(@RequestBody List<Subjects> subjects) {
        int a = subjectsService.addSubjects(subjects);
        System.out.println("a:" + a);

        return (a > 0 ? ResultUtil.success(subjects) : ResultUtil.error(2, "SUBJECT_IS_EXISTS"));
    }

    @RequestMapping("updateSub")
    public String updateStu(Subjects subjects,Model model,
                            @RequestParam(value = "subjectId", required = true) Integer subjectId){
        Subjects sub=subjectsService.selectByID(subjectId);

        model.addAttribute("subjects", sub);

        return "updateSubView";
    }

    @RequestMapping("doupdateSub")
    public String doupdate(Subjects subjects){
        subjectsService.updateById(subjects);
        return "success";
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public Result selectAll() {
        List<Subjects> retList = subjectsService.selectAll();
        return ResultUtil.success(retList);
    }

}
