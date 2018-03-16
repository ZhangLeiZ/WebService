package com.zl.server;

import com.zl.client.User;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlType;

@WebService
public interface sayWebService {
    void getSay();
    String getHollerSay(String name);
    User getUserBy(@WebParam(name="user") User user);
}
