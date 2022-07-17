package tdcc.cdi;

import tdcc.lab.category.ejb3.CategoryService;

import jakarta.inject.Inject;
import java.rmi.RemoteException;

public class Application {

    @Inject
    private CategoryService service;

    public void run() {
        try {
            System.out.println(service.all());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
