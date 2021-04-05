package com.demo.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@Slf4j
public class HelloApplicationRunner implements ApplicationRunner {

    public HelloApplicationRunner() {
        log.info("Initializing HelloApplicationRunner.");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Hello World! ");
    }
}
