package com.myApp.MyApp;

import org.springframework.stereotype.Component;
//@Primary
@Component
public class Desktop implements Computer{


    @Override
    public void compile() {
        System.out.println(" it much faster  debugger ");
    }
}
