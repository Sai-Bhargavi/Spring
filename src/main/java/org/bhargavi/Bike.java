package org.bhargavi;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    public void drive(){
        System.out.println("this is bike..");
    }
}