package com.zl.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class sayServiceImpl implements sayService {
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
}
