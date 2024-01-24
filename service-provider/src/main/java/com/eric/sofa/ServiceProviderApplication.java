package com.eric.sofa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@ImportResource({"classpath*:service-provider-spring.xml"})
@SpringBootApplication
public class ServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ServiceProviderApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);

        HelloService helloSyncServiceReference = applicationContext.getBean(HelloService.class);
        System.out.println(helloSyncServiceReference.saySync("sync"));
    }
}
