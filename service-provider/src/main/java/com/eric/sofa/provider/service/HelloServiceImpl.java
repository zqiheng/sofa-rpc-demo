package com.eric.sofa.provider.service;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.eric.sofa.HelloService;
import org.springframework.stereotype.Service;

@Service
@SofaService(interfaceType = HelloService.class, bindings = {@SofaServiceBinding(bindingType = "bolt")})
public class HelloServiceImpl implements HelloService {

    @Override
    public String saySync(String string) {
        return "你好！" + string;
    }
}
