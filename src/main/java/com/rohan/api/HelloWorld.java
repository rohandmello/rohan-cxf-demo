package com.rohan.api;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

