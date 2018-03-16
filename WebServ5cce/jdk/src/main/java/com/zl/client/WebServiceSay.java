package com.zl.client;

public class WebServiceSay {
    public static void main(String[] args) {
        SayServiceImpl say = new SayServiceImplService().getSayServiceImplPort();
        System.out.println(say.getHollerSay("你大爷"));
    }
}
