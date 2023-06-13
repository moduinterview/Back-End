package com.example.moduinterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//TODO: SecurityAutoConfiguration을 제외한 상태로 SpringBootApplication을 실행하도록 설정하시오.
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ModuInterviewApplication {

  public static void main(String[] args) {
    SpringApplication.run(ModuInterviewApplication.class, args);

  }

}
