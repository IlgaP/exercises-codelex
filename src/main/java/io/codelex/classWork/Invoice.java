package io.codelex.classWork;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Invoice extends Oder {

    private final String invoiceNumber;
    List<Item> orderList = new ArrayList<>();
    Oder oder;
    DecimalFormat df = new DecimalFormat("#.##");

    private InvoiceStatus invoiceStatus;

    public Invoice(Oder oder, String invoiceNumber) {
        this.oder = oder;
        this.orderList = itemList;
        this.invoiceNumber = invoiceNumber;
        invoiceStatus = InvoiceStatus.APPROVED;
    }

    void send() {
        invoiceStatus = InvoiceStatus.SENT;
    }


    public String showInvoice() {
        return "=================================================="
                + "\nINVOICE NUMBER: " + invoiceNumber
                + "\nSTATUS: " + invoiceStatus
                + "\n" + Oder.showOrder()
                + "\nSUM: " + df.format(oder.getSum()) + " EUR"
                + "\nVAT (21%): " + df.format(oder.getVAT()) + " EUR"
                + "\nTOTAL: " + df.format(oder.getTotal()) + " EUR"
                + "\n==================================================";
    }
}
