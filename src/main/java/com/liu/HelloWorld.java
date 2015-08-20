package com.liu;

/**
 * Created by hz-kf-003 on 2015/7/14.
 */
public class HelloWorld
{

    public String sayHello()
    {
        return "Hello Maven";
    }

    public static void main(String[] args)
    {
        System.out.println( new HelloWorld().sayHello());
    }
}
