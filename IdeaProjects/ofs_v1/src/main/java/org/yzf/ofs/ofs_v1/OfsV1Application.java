package org.yzf.ofs.ofs_v1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("org.yzf.ofs.ofs_v1.mapper")
@SpringBootApplication(scanBasePackages={
        "org.yzf.ofs.ofs_v1"})
public class OfsV1Application {

    public static void main(String[] args) {
        SpringApplication.run(OfsV1Application.class, args);
    }

}
