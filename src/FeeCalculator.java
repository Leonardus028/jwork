import java.util.ArrayList;

public class FeeCalculator implements Runnable
{
    public void run() {
        ArrayList<Invoice> list = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice invoice : list)
        {
            System.out.println("calculating invoice id: " + invoice.getId());
            invoice.setTotalFee();
            System.out.println("finish calculating invoice id: " + invoice.getId());
        }
    }
}