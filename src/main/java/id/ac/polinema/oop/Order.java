package id.ac.polinema.oop;

public class Order {
    private Customer customer;
    private OrderItem[] items;
    private int itemsCount;

    public Order (Customer customer) {
        this.customer=customer;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void addItem (MenuItem item, int quantity){

    }

    public int getItemCount(){
        return itemsCount;
    }

    public double getTotal(){
        double harga=0;
        for (int i = 0; i < items.length; i++) {
            harga+=items[i].getMenuItem().getPrice();
        }
        return harga;
    }

    public double getFinalTotal(){
        double harga = getTotal();
        if (harga>100000) {
            double hargaTotal = harga * 0.9;
            return hargaTotal;
        }
        return harga;
    }
}
