package util;

import entity.Customer;
import entity.Invoice;
import entity.Order;
import entity.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public final class LoadMockData {

    private static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    private static final List<Invoice> INVOICE_LIST = new ArrayList<>();

    static {
        loadMockData();
    }

    private LoadMockData() {
    }
    public static List<Customer> getCustomerList() {
        return CUSTOMER_LIST;
    }
    public static List<Invoice> getInvoiceList() {
        return INVOICE_LIST;
    }

    private static void loadMockData() {
        Customer ali = new Customer("Ali", "Can", "ali@mail.com", "12345678910", "IT", new ArrayList<>(), LocalDate.of(2024, 6, 12));
        Customer veli = new Customer("Veli", "Yılmaz", "veli@mail.com", "10987654321", "Logistics", new ArrayList<>(), LocalDate.now());
        Customer ayse = new Customer("Ayşe", "Kara", "ayse@mail.com", "98765432101", "Food", new ArrayList<>(), LocalDate.now());

        Product shoes = new Product("Shoes", 120.0);
        Product shirt = new Product("Shirt", 50.0);
        Product jeans = new Product("Jeans", 80.0);
        Product hat = new Product("Hat", 25.0);
        Product socks = new Product("Socks", 10.0);

        Order aliOrder = new Order(ali, List.of(shoes, shirt));
        Order veliOrder = new Order(veli, List.of(jeans, hat, socks));
        Order ayseOrder = new Order(ayse, List.of(shirt, hat));

        ali.getOrders().add(aliOrder);
        veli.getOrders().add(veliOrder);
        ayse.getOrders().add(ayseOrder);

        Invoice aliInvoice = new Invoice(LocalDateTime.now(), aliOrder);
        Invoice veliInvoice = new Invoice(LocalDateTime.now(), veliOrder);
        Invoice ayseInvoice = new Invoice(LocalDateTime.now(), ayseOrder);

        CUSTOMER_LIST.add(ali);
        CUSTOMER_LIST.add(veli);
        CUSTOMER_LIST.add(ayse);

        INVOICE_LIST.add(aliInvoice);
        INVOICE_LIST.add(veliInvoice);
        INVOICE_LIST.add(ayseInvoice);

    }


}

