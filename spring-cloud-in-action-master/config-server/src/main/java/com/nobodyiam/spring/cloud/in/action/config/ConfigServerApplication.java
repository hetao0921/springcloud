package com.nobodyiam.spring.cloud.in.action.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Jason on 2/24/16.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(ConfigServerApplication.class)
            .run(args);
  }

}
