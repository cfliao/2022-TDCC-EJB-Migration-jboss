package tdcc.lab.simple.ejb3;

import javax.ejb.Remote;

@Remote
public interface Calculator {
    public int add(int i,int j);
}
