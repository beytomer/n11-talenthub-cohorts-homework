package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    private LocalDateTime invoiceDateTime;
    private Double totalPrice;
    private Order order;

    public Invoice(LocalDateTime invoiceDateTime, Order order) {
        this.invoiceDateTime = invoiceDateTime;
        this.order = order;
        setTotalPrice();
    }

    public void setTotalPrice(){
        Double total = 0.0;

        for (Product p : order.getProducts()){
            total+=p.getPrice();
        }
        this.totalPrice = total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceDateTime=" + invoiceDateTime +
                ", totalPrice=" + totalPrice +
                ", order=" + order +
                '}';
    }
}
