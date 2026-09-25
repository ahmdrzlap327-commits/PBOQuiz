package id.ac.polinema.oop;

public class Cashier {
    public double calculateChange (Order order, double cash){
        if (cash < order.getFinalTotal()) {
            return cash-order.getFinalTotal();
        }
        return cash;
    }
}
