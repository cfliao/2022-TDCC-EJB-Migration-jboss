package tdcc.lab.category;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;
import java.util.List;

public interface CategoryServiceRemote extends EJBObject {
    public List<Category> all() throws RemoteException;
}
