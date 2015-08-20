package com.liu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hz-kf-003 on 2015/7/14.
 */
public class HelloWorldTest
{
    @Test
    public void testSayHello()
    {
        HelloWorld helloWorld = new HelloWorld();

        String result = helloWorld.sayHello();

        assertEquals("Hello Maven", result);

    }
}
