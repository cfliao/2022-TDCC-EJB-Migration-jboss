package tdcc.lab.category;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class CategorySessionBean implements SessionBean {

    private SessionContext context;

    public List<Category> all() {
        List<Category> list = new ArrayList<>();
        Category c = new Category();
        c.setCategoryId("FISH");
        c.setName("Fish");
        c.setDescription("<image src=\"../images/fish_icon.gif\"><font size=\"5\" color=\"blue\"> Fish</font>");
        list.add(c);
        return list;
    }

    @Override
    public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {
        this.context = context;
    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException {

    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException {

    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException {

    }
}
