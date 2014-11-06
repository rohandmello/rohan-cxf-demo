
package com.rohan.api;

import javax.jws.WebService;

@WebService(endpointInterface = "com.rohan.api.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

