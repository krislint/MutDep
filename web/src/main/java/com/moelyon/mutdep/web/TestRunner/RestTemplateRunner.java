package com.moelyon.mutdep.web.TestRunner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
@Slf4j
public class RestTemplateRunner implements ApplicationRunner {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
      log.info("qaq restTemplate !");
    }
}
