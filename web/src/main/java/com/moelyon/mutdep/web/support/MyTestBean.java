package com.moelyon.mutdep.web.support;

import com.moelyon.common.model.Coffee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author moelyon
 */
@Component
@Slf4j
public class MyTestBean {



    @PostConstruct
    public void init() {
        log.info("qaq init la1a");
//        log.info(coffee.toString());
    }

    @PreDestroy
    public void destroy(){
        log.info("qaq I will been destroy");
//        log.info(coffee.toString());
    }
}
