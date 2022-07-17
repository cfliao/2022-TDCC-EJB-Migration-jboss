package tdcc.lab.category.ejb3;
import tdcc.lab.category.Category;

import javax.ejb.Remote;
import java.rmi.RemoteException;
import java.util.List;

@Remote
public interface CategoryService {
    public List<Category> all() throws RemoteException;
}
