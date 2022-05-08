package com.mvndemo01;

import org.junit.Assert;

public class DemoTest {
    public void testSay(){
        Demo d = new Demo();
        String md =d.say("CHEN");
        Assert.assertEquals("Hello CHEN", md);
    }
}
