package tdcc.lab.simple;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

public interface CalculatorHome extends EJBHome {

    public CalculatorRemote create() throws RemoteException, CreateException;
}


