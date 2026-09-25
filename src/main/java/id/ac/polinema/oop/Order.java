package id.ac.polinema.oop;

public class Order {
    private Customer customer;
    private OrderItem[] items;
    private int itemsCount;

    public Order (Customer customer) {
        this.customer=customer;
        items = new OrderItem[10];
        itemsCount=0;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void addItem (MenuItem item, int quantity){
        if (itemsCount < 10) {
            items[itemsCount] = new OrderItem(item, quantity);
            itemsCount++;
        }
    }

    public int getItemCount(){
        return itemsCount;
    }

    public double getTotal(){
        double harga = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i] != null){
                harga += items[i].getSubtotal();
            }
        }
        return harga;
    }

    public double getFinalTotal(){
        double harga = getTotal();
        if (harga>=100000) {
            double hargaTotal = harga * 0.9;
            return hargaTotal;
        }
        return harga;
    }
}
