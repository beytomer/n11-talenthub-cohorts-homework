package util;

import service.ımpl.CustomerServiceImpl;
import service.ımpl.InvoiceServiceImpl;

import java.util.Scanner;


public final class AppFunction {

    private AppFunction() {
    }

    public static void run(){
        Scanner scan = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        InvoiceServiceImpl invoiceService = new InvoiceServiceImpl();
        boolean var = true;

        while (var) {
            printMenu();
            int number = scan.nextInt();
            switch (number) {
                case 1 -> customerService.save(scan);
                case 2 -> customerService.findAll();
                case 3 -> customerService.filterIfNameIncludesC();
                case 4 -> invoiceService.totalInvoiceAmountOfCustomersCreatedInJune();
                case 5 -> invoiceService.findAll();
                case 6 -> invoiceService.filterInvoicesByTotalAmount();
                case 7 -> invoiceService.averageOfInvoicesOverAmount();
                case 8 -> invoiceService.listOfCustomersHasBelowAmount();
                case 9 -> invoiceService.listOfSectorNamesInvoiceAmountBelow();
                case 0 -> var = false;
                default -> System.out.println("Invalid menu operation!");
            }
        }
    }
    private static void printMenu(){
        System.out.printf("1, Add new customer into system");
        System.out.printf("2, List all customers in the system");
        System.out.printf("3, List all customers which has letter 'c' in their name");
        System.out.printf("4, List the total amount of invoices of customers who registered in June");
        System.out.printf("5, List all invoices in the system");
        System.out.printf("6, List invoices over 1500TL in the system");
        System.out.printf("7, Calculate the average of invoices over 1500TL in the system");
        System.out.printf("8, List the names of customers with invoices under 500TL in the system");
        System.out.printf("9, Sectors of companies whose average invoices in June were below 750");
        System.out.printf("0, EXIT");
        System.out.print("Please enter operation number: ");
    }

}
