package service;

public interface InvoiceService {

    // Calculate the total invoice amount of customers registered in June.
    void totalInvoiceAmountOfCustomersCreatedInJune();

    // List all invoices in the system.
    void findAll();

    // Filter invoices by total amount exceeding 1500TL.
    void filterInvoicesByTotalAmount();

    // Calculate the average of invoices exceeding 1500TL.
    void averageOfInvoicesOverAmount();

    // List names of customers with invoices below 500TL.
    void listOfCustomersHasBelowAmount();

    // Identify sectors of companies whose average June invoices were below 750TL.
    void listOfSectorNamesInvoiceAmountBelow();
}
