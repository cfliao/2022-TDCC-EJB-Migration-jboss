package tdcc.lab.ejb2;

import tdcc.lab.domain.Category;

import javax.ejb.CreateException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Properties;

public class TestCategoryService {
    public static void main(String[] args) throws RemoteException, CreateException {
        Properties properties = new Properties();

        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
        properties.put(Context.PROVIDER_URL, "remote+http://localhost:8080");
        InitialContext ic;
        CategoryServiceRemote categoryService = null;
        try
        {
            ic = new InitialContext(properties);
            Object ref = ic.lookup("ejb20-jboss-1.0-SNAPSHOT/CategorySessionBean!tdcc.lab.ejb2.CategoryServiceHome");
            CategoryServiceHome categoryServiceHome = (CategoryServiceHome) PortableRemoteObject
                    .narrow(ref, CategoryServiceHome.class);
            categoryService = categoryServiceHome.create();

        }
        catch (NamingException e)
        {
            e.printStackTrace();
        }

        List<Category> list = categoryService.all();
        System.out.println(list);
    }

}
