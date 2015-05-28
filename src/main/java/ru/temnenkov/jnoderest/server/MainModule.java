package ru.temnenkov.jnoderest.server;

import com.google.gson.Gson;
import jnode.event.IEvent;
import jnode.module.JnodeModule;
import jnode.module.JnodeModuleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.temnenkov.jnoderest.dto.Message;
import spark.Spark;

/**
 * @author Manjago (kirill@temnenkov.com)
 */
public class MainModule extends JnodeModule {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainModule.class);


    public static void main(String[] args) throws JnodeModuleException {
        MainModule mainModule = new MainModule(MainModule.class.getResource("config2.properties").getPath());
        mainModule.start();
    }

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
        try {
            startInternal();
        } catch (Exception e) {
            LOGGER.error("fail", e);
        }
    }

    private void startInternal() throws JnodeModuleException {
        Spark.port(getPort());
        Spark.get("/users/:id", (request, response) -> {
            response.type("application/json");

            String id = request.params("id");

            Message m = new Message();
            m.setSubject(id);
            return new Gson().toJson(m);
        });

    }

    @Override
    public void handle(IEvent iEvent) {

    }
}
