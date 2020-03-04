package com.yeaile.appservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yeaile.**.mapper")
public class AppserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(AppserviceApplication.class, args);
  }

}
