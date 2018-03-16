package com.zl.server;

import com.zl.client.User;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Component
public class SayWebServiceImpl implements sayWebService {
    @WebMethod
    @Override
    public void getSay() {
        System.out.println("你好。。。走一个");
    }

    @WebMethod
    @Override
    public String getHollerSay(String name) {
        System.out.println("name=:"+name);
        return name;
    }

    @WebMethod
    @Override
    public User getUserBy(User user) {
        System.out.println(user);
        return user;
    }
}
