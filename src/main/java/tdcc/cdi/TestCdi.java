package tdcc.cdi;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class TestCdi {

    public static void main(String[] args) {
        SeContainerInitializer containerInit = SeContainerInitializer.newInstance();
        SeContainer container = containerInit.initialize();
        Application application = container.select(Application.class).get();
        application.run();
        container.close();
    }

}
