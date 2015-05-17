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

    @Override
    public void start() {

    }

    @Override
    public void handle(IEvent iEvent) {

    }
}
