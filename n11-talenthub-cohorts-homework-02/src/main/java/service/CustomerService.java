package service;

import java.util.Scanner;

public interface CustomerService {

    // List all existing customers.
    void findAll();

    // Add new customers to the system.
    void save(Scanner scanner);

    // Filter customers by name containing the letter "C".
    void filterIfNameIncludesC();
}
