package com.bohaisoft.dal.test;

/**
 * Created by liuhb on 2017/8/26.
 */
public class Dervied extends Base {

    private String name = "Dervied";

    public Dervied() {
        tellName();
        printName();
    }

    public void tellName() {
        System.out.println("Dervied tell me is : " + name);
    }

    public void printName() {
        System.out.println("Dervied print me is : " + name);
    }

    public static void main(String[] args) {
        new Dervied();
    }
}
