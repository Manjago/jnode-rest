package ru.temnenkov.jnoderest.dto;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

public class MessageTest {
    @Test
    public void testToJson() throws Exception {
        Message msg = new Message();
        msg.setEchoArea("828.local");
        msg.setBody("test");
        msg.setSubject("ggg");

        Assert.assertEquals("{\"echoArea\":\"828.local\",\"subject\":\"ggg\",\"body\":\"test\"}",
                new Gson().toJson(msg));
    }

    @Test
    public void testFromJson() throws Exception {

        Message msg = new Message();
        msg.setEchoArea("828.local");
        msg.setBody("test");
        msg.setSubject("ggg");

        Assert.assertEquals(msg, new Gson().fromJson(
                "{\"echoArea\":\"828.local\",\"subject\":\"ggg\",\"body\":\"test\"}", Message.class));


    }
}