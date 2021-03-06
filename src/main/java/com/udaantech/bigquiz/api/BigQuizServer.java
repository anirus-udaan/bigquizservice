package com.udaantech.bigquiz.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.udaantech.bigquiz")
@EnableMongoRepositories(basePackages = "com.udaantech.bigquiz")
public class BigQuizServer {

  public static void main(String[] args) {
    SpringApplication.run(BigQuizServer.class, args);
  }
}
