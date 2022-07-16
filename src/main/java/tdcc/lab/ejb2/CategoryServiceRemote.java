package tdcc.lab.ejb2;

import tdcc.lab.domain.Category;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;
import java.util.List;

public interface CategoryServiceRemote extends EJBObject {
    public List<Category> all() throws RemoteException;
}
