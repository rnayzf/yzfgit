package org.yzf.ofs.ofs_v1.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Controller
@RequestMapping("/file")
public class FileController {

    @Value("${uploadPath}")
    private String uploadPath;

    // 跳转至file.jsp页面
    @RequestMapping("/index")
    public String index() {
        return "file";
    }

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFileAction(@RequestParam("uploadFile") MultipartFile uploadFile, Model model) {
        // 文件上传全路径 = 文件上传路径+文件名
        String uploadFilePath = uploadPath+uploadFile.getOriginalFilename();
        System.out.println("文件名【"+uploadFile.getOriginalFilename()+"】");
        InputStream fis = null;
        OutputStream outputStream = null;
        File file = new File(uploadPath);
        if(!file.exists()){
            file.mkdir();
        }
        try {
            fis = uploadFile.getInputStream();
            outputStream = new FileOutputStream(uploadFilePath);
            IOUtils.copy(fis,outputStream);
            System.out.println("文件上传路径【"+uploadFilePath+"】");
            String filename = "/UploadPath/"+uploadFile.getOriginalFilename();
            model.addAttribute("filename",filename);
            return "file";
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "fail";
    }

}
