package ru.temnenkov.jnoderest.server;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainModuleTest {

    private static MainModule mainModule;

    @BeforeClass
    public static void setUpTotal() throws Exception {
        mainModule = new MainModule(MainModule.class.getResource("config.properties").getPath());
        mainModule.start();
    }

    @Test
    public void testPort() throws Exception {
        Assert.assertEquals(7888, mainModule.getPort());
    }

    @Test
    public void testStart() throws Exception {
        Thread.sleep(1000);
    }

    @Test
    public void testStart2() throws Exception {
        Thread.sleep(1000);
    }
}