package com.zl.client;

public class WebServiceTest {
    public static void main(String[] args) {
        SayWebService sb = new SayWebServiceImplService().getSayWebServiceImplPort();
        System.out.println(sb.getHollerSay("你二大爷"));
        User user = new User();
        user.setId(1);
        user.setName("张数");
        user.setSax("男");
        System.out.println(sb.getUserBy(user));
    }
}
