package com.eric.sofa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@ImportResource({"classpath*:service-consumer.xml"})
@SpringBootApplication
public class ServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ServiceConsumerApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);

        HelloService helloSyncServiceReference = applicationContext.getBean(HelloService.class);

        System.out.println(helloSyncServiceReference.saySync("consumer"));
    }
}
