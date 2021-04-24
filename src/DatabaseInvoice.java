import java.util.ArrayList;

/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan
 * database invoice, yang berisi list invoice
 * @author Leonardus Kevin
 * @version 24-4-2021
 */
public class DatabaseInvoice {
    // instance variable dari DatabaseInvoice
    private static final ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;


    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Invoice getInvoiceById(int id){
        Invoice temp = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                temp = invoice;
            }
        }
        return temp;
    }

    public static ArrayList<Invoice> getInvoiceByJobSeeker(int jobseekerId){
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (Invoice invoice : INVOICE_DATABASE) {
            if (jobseekerId == invoice.getJobseeker().getId()) {
                temp.add(invoice);
            } else {
                return null;
            }
        }
        return temp;
    }


    public static boolean addInvoice(Invoice invoice){
        for(int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getInvoiceStatus() == InvoiceStatus.OnGoing) {
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for(int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if(id == INVOICE_DATABASE.get(i).getId() && INVOICE_DATABASE.get(i).getInvoiceStatus() == InvoiceStatus.OnGoing) {
                INVOICE_DATABASE.get(i).setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }


    public boolean removeInvoice(Invoice invoice, int id){
        for (Invoice invoice_1 : INVOICE_DATABASE) {
            if (invoice.getId() == invoice_1.getId()) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        return false;
    }
}
