package nccu;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface CalculatorRemote extends EJBObject {

    public int add(int i,int j) throws RemoteException;

}

