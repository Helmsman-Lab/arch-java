package com.arch.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;


@ImportResource({"classpath*:META-INF/config/*.xml"})
@SpringBootApplication(scanBasePackages = {"com.arch"},exclude = {DataSourceAutoConfiguration.class})
@Slf4j
public class Bootstrap {
    public static void main(String[] args) {
        log.info("**** *********** Starting application .... ******************");
        try {
            SpringApplication.run(Bootstrap.class, args);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        log.info("*************** Started application .... ********************");
    }
}
