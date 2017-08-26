package com.bohaisoft.dal.test;

/**
 * Created by liuhb on 2017/8/26.
 */
public class Base {
    private String name = "base";
    public Base() {
        tellName();
        printName();
    }

    public void tellName() {
        System.out.println("Base tell me is : " + name);
    }

    public void printName() {
        System.out.println("Base print me is : " + name);
    }
}
