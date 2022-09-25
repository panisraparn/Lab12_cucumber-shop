package ku.shop;

import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;
    private LocalDateTime date;

    public Order() {
        this.items = new ArrayList<>(); //list ของ
        this.date = LocalDateTime.now();
    }

    //เวลา add item ที่ order stock ของสินค้านั้นจะลดลง
    public void addItem(Product prod, int quantity ) {
        items.add(new OrderItem(prod, quantity));
        prod.cutStock(quantity);

//        int stock = 0;
//        stock = prod.getStock();
    }


    public double getTotal() {
        double total = 0;
        for (OrderItem item : items)
            total += item.getSubtotal();
        return total;
    }



}
