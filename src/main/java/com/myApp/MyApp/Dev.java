package com.myApp.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("desktop")
 private   Computer laptop;


//  public  void setLaptop(Laptop laptop){
//       this.laptop= laptop;
//  }

    public void build(){
        laptop.compile();
        System.out.println("working on Awesome Project");
    }
}
