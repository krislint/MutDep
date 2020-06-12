package com.moelyon.study.springhelloautoconfig;


import com.moelyon.study.springhello.SpringHelloApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author moelyon
 */
@Configuration
@ConditionalOnClass(SpringHelloApplication.class)
public class CoffeeAutoConfigration {

    @Bean
    @ConditionalOnMissingBean(SpringHelloApplication.class)
    @ConditionalOnProperty(name = "spring-hello.enabled",havingValue = "true",matchIfMissing = true)
    public SpringHelloApplication springHelloApplication(){
        SpringHelloApplication app =  new SpringHelloApplication("lalala");
        return app;
    }
}
