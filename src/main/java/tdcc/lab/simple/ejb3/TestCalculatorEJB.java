package tdcc.lab.simple.ejb3;

import javax.ejb.CreateException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Properties;

public class TestCalculatorEJB {

    public static void main(String[] args) throws RemoteException, CreateException, NamingException {
        Properties properties = new Properties();

        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
        properties.put(Context.PROVIDER_URL, "remote+http://localhost:8080");
        InitialContext ic;
        ic = new InitialContext(properties);
        Calculator calculator = (Calculator) ic.lookup("ejb20-jboss-1.0-SNAPSHOT/CalculatorEJB3!tdcc.lab.simple.ejb3.Calculator");
        System.out.println(calculator.add(2, 2));
    }
}
