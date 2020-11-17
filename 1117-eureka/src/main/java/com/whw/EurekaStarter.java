package com.whw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:MR.W on 2020/11/17 14:17
 */



@SpringBootApplication
@EnableDiscoveryClient
public class EurekaStarter {
      public static void main(String[] args) {
              SpringApplication.run(EurekaStarter.class,args);
          }

}
