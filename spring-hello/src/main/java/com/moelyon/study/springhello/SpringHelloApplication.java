package com.moelyon.study.springhello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @author moelyon
 */
@Slf4j
public class SpringHelloApplication implements ApplicationRunner {

    private String qaq;

    public SpringHelloApplication(String qaq) {
        this.qaq = qaq;
        log.info("initialize bean name"+qaq);
    }

    public SpringHelloApplication() {
        this("default");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("runner");
    }
}
