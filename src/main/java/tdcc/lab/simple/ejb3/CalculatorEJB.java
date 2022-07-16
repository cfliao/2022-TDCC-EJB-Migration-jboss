package tdcc.lab.simple.ejb3;

import javax.ejb.Stateless;

@Stateless
public class CalculatorEJB implements Calculator {
    public int add(int i, int j) {
        return i + j;
    }
}
