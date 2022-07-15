package nccu;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class CalculatorEJB implements SessionBean {

    private static final long serialVersionUID = 2196890439324865659L;

    private SessionContext context;

    public void ejbCreate() throws EJBException {

    }

    public int add(int i, int j) {
        //System.out.println(context.getContextData());
        return i + j;
    }

    public void ejbActivate() throws EJBException {

    }

    public void ejbPassivate() throws EJBException {

    }

    public void ejbRemove() throws EJBException {

    }

    public void setSessionContext(SessionContext context) throws EJBException {

        this.context = context;

    }

}
