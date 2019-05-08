package com.java.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuweizhi
 * @since 2019/05/08 10:47
 */
@SpringBootApplication
@RestController
public class DockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

    @RequestMapping("/index")
    public String index() {
        return "Hello Docker !";
    }
}
