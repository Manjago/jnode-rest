package ru.temnenkov.jnoderest.server;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainModuleTest {

    @Test
    public void testPort() throws Exception {
        MainModule mainModule = new MainModule(getClass().getResource("config.properties").getPath());
        Assert.assertEquals(7888, mainModule.getPort());

    }
}