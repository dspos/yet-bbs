package com.yet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yet.mapper")
public class YetForumApplication {

  public static void main(String[] args) {
    SpringApplication.run(YetForumApplication.class, args);
  }
}
