package ru.temnenkov.jnoderest.server;

import jnode.module.JnodeModuleException;
import org.junit.Assert;
import org.junit.Test;

public class MainModuleTest {


    @Test
    public void testPort() throws Exception {
        MainModule mainModule = new MainModule(getClass().getResource("config.properties").getPath());
        Assert.assertEquals(7888, mainModule.getPort());

    }

    @Test
    public void testStart() throws Exception {
        MainModule mainModule = new MainModule(getClass().getResource("config.properties").getPath());
        mainModule.start();

    }
}