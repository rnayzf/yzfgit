package org.yzf.ofs.ofs_v1.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.yzf.ofs.ofs_v1.entity.Subjects;
import org.yzf.ofs.ofs_v1.service.SubjectsService;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/subjectsWeb")
public class SubjectWebController {
    @Autowired
    private SubjectsService subjectsService;

    @RequestMapping("/welcome")
    public String welcome(Model model) {
        List<Subjects> subjects = subjectsService.getAllSubjects();
        model.addAttribute("subjects", subjects);
        System.out.println("subjects:" + subjects.toString());
        return "welcome";
    }

    @RequestMapping(value="/selectSubjects",method=RequestMethod.GET)
    public String selectSubjects(Model model) {
        return "selectSubView";
    }

    @RequestMapping(value = "/doSelSubjects", method = RequestMethod.GET)
    public String doSelectSub(Subjects subjects,Model model){
        List<Subjects> list=subjectsService.selectSub(subjects);
        model.addAttribute("list", list);
        return "selectStuResult";
    }

    @RequestMapping(value = "/selSubjects", method = RequestMethod.GET)
    public String selSubjects(@RequestParam String name, Model model) {
        List<Subjects> sub = subjectsService.selectByName(name);
        model.addAttribute("subjects", sub);
        return "selectSubResult";
    }


    @RequestMapping(value="/insertSubjects",method=RequestMethod.GET)
    public String insertSubjects(Model model) {
        model.addAttribute("subjects", new Subjects());
        return "insertSubView";
    }

    @RequestMapping(value="/updateSubjects/{subjectsId}",method=RequestMethod.GET)
    public String updateById(@PathVariable Integer subjectsId, Model model) {
        Subjects sub = subjectsService.selectByID(subjectsId);
        model.addAttribute("subjects", sub);
        return "updateSubView";
    }

}
