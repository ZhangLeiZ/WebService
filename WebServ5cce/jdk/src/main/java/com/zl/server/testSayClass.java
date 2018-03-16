package com.zl.server;

import javax.xml.ws.Endpoint;


/*
         发布WebService

         请求 soap xml文档 wsdl: http://127.0.0.1/WebServ5cce/jdk?wsdl

         生成client代码
       wsimport -s F:\IdeaProjects\WebServ5cce\jdk\src\main\java
       -p com.zl.client -keep http://127.0.0.1/WebServ5cce/jdk?wsdl
       -encoding utf-8*/

public class testSayClass {
    public static void main(String[] args) {
        sayServiceImpl sy = new sayServiceImpl();
        Endpoint endpoint = Endpoint.publish("http://127.0.0.1/WebServ5cce/jdk",sy);
    }
}
