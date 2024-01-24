package com.eric.sofa.consumer.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.eric.sofa.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @SofaReference(interfaceType = HelloService.class, jvmFirst = false, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private HelloService helloService;

    @RequestMapping(path = "/hello/{msg}")
    public String sayHello(@PathVariable String msg) {
        return helloService.saySync(msg);
    }
}
