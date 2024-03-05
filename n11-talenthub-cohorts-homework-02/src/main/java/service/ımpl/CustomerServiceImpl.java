package service.ımpl;

import entity.Customer;
import service.CustomerService;
import util.LoadMockData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Mehmet Akif Tanisik
 */
public class CustomerServiceImpl implements CustomerService {

    private final List<Customer> customerList = LoadMockData.getCustomerList();

    @Override
    public void findAll() {
        customerList.forEach(System.out::println);
    }
    @Override
    public void save(Scanner scanner) {

        System.out.println("Please enter a name: ");
        String name = scanner.next();
        System.out.println("Please enter a surname: ");
        String surname = scanner.next();
        System.out.println("Please enter a email: ");
        String email = scanner.next();
        System.out.println("Please enter a phoneNumber: ");
        String phoneNumber = scanner.next();
        System.out.println("Please enter a sector: ");
        String sector = scanner.next();

        Customer customer = new Customer(name, surname, email,phoneNumber, sector,new ArrayList<>(), LocalDate.now());
        customerList.add(customer);
    }
    @Override
    public void filterIfNameIncludesC() {
        List<Customer> list = customerList.stream().filter(customer -> customer.getName().contains("C") ||customer.getName().contains("c"))
                .toList();
        list.forEach(System.out::println);
    }
}
