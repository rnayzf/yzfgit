package org.yzf.ofs.ofs_v1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;
import org.yzf.ofs.ofs_v1.entity.Subjects;
import org.yzf.ofs.ofs_v1.resultUtil.Result;
import org.yzf.ofs.ofs_v1.resultUtil.ResultEnum;
import org.yzf.ofs.ofs_v1.resultUtil.ResultUtil;
import org.yzf.ofs.ofs_v1.service.SubjectsService;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/subjects")
public class SubjectsController {

    private Logger logger = LoggerFactory.getLogger(SpringBootLong4jApplicationTests.class);

    @Autowired
    private SubjectsService subjectsService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Subjects> getAllSubjects() {
        List<Subjects> retList = subjectsService.getAllSubjects();
        return retList;
    }

    @RequestMapping(value = "/addSubject" , method = RequestMethod.GET)
    public String addSubject(@RequestParam("subjectsId") Integer subjectsId,
                        @RequestParam("subjectsName") String subjectsName,
                        @RequestParam("subjectsRem") String subjectsRem)
    {
        Subjects subject = new Subjects();
        subject.setSubjectsId(subjectsId);
        subject.setSubjectsName(subjectsName);
        subject.setSubjectsRem(subjectsRem);
        subjectsService.addSubject(subject);
        return  "insert success: "+"[ subjectsId:"+subjectsId + " subjectsName:" + subjectsName + " subjectsRem:" + subjectsRem +"]";
    }

    @RequestMapping(value = "/addSubjects" , method = RequestMethod.POST)
    @ResponseBody
    public Result addSubjects(@RequestBody List<Subjects> subjects)
    {
        int a = subjectsService.addSubjects(subjects);
        System.out.println("a:"+a);

        return (a > 0 ? ResultUtil.success(subjects): ResultUtil.error(2,"SUBJECT_IS_EXISTS"));
    }

    @RequestMapping("/selectAll")
    @ResponseBody
    public Result selectAll() {
        List<Map<Object,Object>> retList = subjectsService.selectAll();
//        System.out.println("result:"+retList);
        return ResultUtil.success(retList);
    }

    @RequestMapping("/selectOne")
    @ResponseBody
    public Result selectOne(@RequestBody Subjects subjects) {
        Map<Object,Object> result = subjectsService.selectOne(subjects);
        return ResultUtil.success(result);
    }

    @RequestMapping("/insSubjects")
    @ResponseBody
    public Result insert(@RequestBody Subjects subjects) throws DataAccessException {
        int a=0;
        try {
             a= subjectsService.insSubjects(subjects);
        } catch (DataAccessException e)
        {
             a= -1 ;
        }
        System.out.println("a:"+a);

        return (a > 0 ? ResultUtil.success(subjects): ResultUtil.error(ResultEnum.SUBJECT_IS_EXISTS.getCode(),ResultEnum.SUBJECT_IS_EXISTS.getMsg()));
    }

    @RequestMapping("/updSubjects")
    @ResponseBody
    public Result update(@RequestBody Subjects subjects) throws DataAccessException {

        int a=0;
        try {
            a= subjectsService.updSubjects(subjects);
        } catch (DataAccessException e)
        {
            a= -1 ;
        }
        System.out.println("a:"+a);

        return (a > 0 ? ResultUtil.success(subjects): ResultUtil.error(ResultEnum.SUBJECT_NOT_EXIST.getCode(),ResultEnum.SUBJECT_NOT_EXIST.getMsg()));
    }

    @RequestMapping("/delSubjects")
    @ResponseBody
    public Result delete(@RequestBody Subjects subjects) throws DataAccessException {
        int a=0;
        try {
            a= subjectsService.delSubjects(subjects);
        } catch (DataAccessException e)
        {
            a= -1 ;
        }
        System.out.println("a:"+a);

        return (a > 0 ? ResultUtil.success(subjects): ResultUtil.error(ResultEnum.SUBJECT_NOT_EXIST.getCode(),ResultEnum.SUBJECT_NOT_EXIST.getMsg()));
    }


    @RequestMapping("/selectOne1")
    @ResponseBody
    public Result  selectOne1(@RequestBody Subjects subjects) {
        List<Map<Object,Object>>  result = subjectsService.selectOne1(subjects);
//        System.out.println("result:"+result);
        return ResultUtil.success(result);
    }

    @RequestMapping("/insSubjects1")
    @ResponseBody
    public Result insert1(@RequestBody Subjects subjects) throws DataAccessException {
        int a=0;
        try {
            a= subjectsService.insSubjects(subjects);
        } catch (DataAccessException e)
        {
            e.printStackTrace();
        }
        System.out.println("a:"+a);

        return (a > 0 ? ResultUtil.success(subjects): ResultUtil.error(ResultEnum.SUBJECT_IS_EXISTS.getCode(),ResultEnum.SUBJECT_IS_EXISTS.getMsg()));
    }
}
