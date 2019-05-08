package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/**
 * @author suxing.zhang
 * @since 2019/5/8
 */
@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class} )
public class MovieApplication {
  public static void main(String[] args) {
    SpringApplication.run(MovieApplication.class, args);
  }
}
