package ru.temnenkov.jnoderest.server;

import jnode.event.IEvent;
import jnode.module.JnodeModule;
import jnode.module.JnodeModuleException;

/**
 * @author Manjago (kirill@temnenkov.com)
 */
public class MainModule extends JnodeModule {
    public MainModule(String configFile) throws JnodeModuleException {
        super(configFile);
    }

    public int getPort() throws JnodeModuleException {
        try
        {
            return Integer.parseInt(properties.getProperty("port", "4567"));
        }  catch(NumberFormatException e){
            throw new JnodeModuleException("bad port value", e);
        }

    }

    @Override
    public void start() {

    }

    @Override
    public void handle(IEvent iEvent) {

    }
}
