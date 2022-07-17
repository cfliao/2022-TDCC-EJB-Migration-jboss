package tdcc.lab.category;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

public interface CategoryServiceHome extends EJBHome {
    public CategoryServiceRemote create() throws RemoteException, CreateException;
}

