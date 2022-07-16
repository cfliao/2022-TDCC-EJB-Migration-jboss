package tdcc.lab.simple;

import javax.ejb.CreateException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
import java.rmi.RemoteException;
import java.util.Properties;

public class TestCalculatorEJB {

    public static void main(String[] args) throws RemoteException, CreateException {
        Properties properties = new Properties();

        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
        properties.put(Context.PROVIDER_URL, "remote+http://localhost:8080");
        InitialContext ic;
        CalculatorRemote calculator = null;
        try
        {
            ic = new InitialContext(properties);
            Object ref = ic.lookup("ejb20-jboss-1.0-SNAPSHOT/CalculatorEJB!tdcc.lab.simple.CalculatorHome");
            CalculatorHome calculatorHome = (CalculatorHome) PortableRemoteObject
                    .narrow(ref, CalculatorHome.class);
            calculator = calculatorHome.create();

        }
        catch (NamingException e)
        {
            e.printStackTrace();
        }

        int result = calculator.add(2, 4);
        System.out.println(result);
    }
}
