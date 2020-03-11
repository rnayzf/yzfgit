package org.yzf.ofs.ofs_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yzf.ofs.ofs_v1.entity.Subjects;
import org.yzf.ofs.ofs_v1.service.SubjectsService;

import java.util.List;

@Controller
@RequestMapping("/subjectsWeb")
public class SubjectWebController {
    @Autowired
    private SubjectsService subjectsService;

    @RequestMapping("/welcome")
    public String welcome(Model model){
        List<Subjects> subjects = subjectsService.getAllSubjects();
        model.addAttribute("subjects", subjects);
        System.out.println("subjects:"+subjects.toString());
        return "welcome";

    }
}
