import nccu.CalculatorHome;
import nccu.CalculatorRemote;

import javax.ejb.CreateException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
import java.rmi.RemoteException;
import java.util.Properties;

public class JBossTestCalculatorClient {

    public static void main(String[] args) throws RemoteException, CreateException {
        Properties properties = new Properties();

        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
        //properties.put(Context.PROVIDER_URL, "http://localhost:8080/wildfly-services");
        properties.put(Context.PROVIDER_URL, "remote+http://localhost:8080");
        properties.put(Context.SECURITY_PRINCIPAL, "admin");
        properties.put(Context.SECURITY_CREDENTIALS, "nccutest");
        InitialContext ic;
        CalculatorRemote calculator = null;
        try
        {
            ic = new InitialContext(properties);
            Object ref = ic.lookup("demoEJB-1.0-SNAPSHOT/CalculatorEJB!nccu.CalculatorHome");
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
