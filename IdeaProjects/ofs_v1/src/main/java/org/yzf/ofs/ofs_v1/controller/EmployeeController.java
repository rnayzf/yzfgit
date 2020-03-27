package org.yzf.ofs.ofs_v1.controller;

import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.yzf.ofs.ofs_v1.entity.Employee;
import org.yzf.ofs.ofs_v1.service.EmployeeService;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("index")
    public String index() {
        return "employee";
    }

    @RequestMapping(value = "uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile(@RequestParam("uploadFile") MultipartFile uploadFile, HttpServletRequest req) {
        if (uploadFile.isEmpty()) {
            return "文件不存在";
        }
        File files = null;
        try {
            byte[] bytes = uploadFile.getBytes();
            //创建文件存放位置的路径，路径可以自定义
            String path = req.getServletContext().getRealPath("/file");
            //根据创建的路径，生成存放的文件。
            File filePath = new File(path);
            //此文件夹会生成与src/main/webapp中。
            filePath.mkdirs();
            //生成存放的文件夹之后，再创建上传的文件的名字。名字可以自定义。getOriginalFilename()得到文
            // 件上传的原始名字。UUID.randomUUID()生成一个随机的ID。
            String filena = uploadFile.getOriginalFilename();
            String filename = UUID.randomUUID().toString() + filena;
            //生成最后一级的文件
            files = new File(filePath + "/" + filename);
            //写入指定文件夹
            OutputStream out = new FileOutputStream(files);
            out.write(bytes);
            logger.debug("文件上传成功，路径："+files.getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // service处理文件解析和导入数据库工作
        long l = System.currentTimeMillis();
        employeeService.batchAddEmployee(files.getAbsolutePath());
        logger.info("单线程处理耗费时间："+(System.currentTimeMillis()-l)+"毫秒");
        return "success";
    }

    @RequestMapping(value = "getEmployee")
    public ModelAndView getEmployee(@RequestParam(value = "pageNum" ,defaultValue = "1") int pageNum){
        ModelAndView mav = new ModelAndView("employee");
        PageInfo<Employee> employeesInfo = employeeService.getEmployeesInfo(pageNum, 5);
        mav.addObject("PageInfo",employeesInfo);
        return mav;
    }


}
