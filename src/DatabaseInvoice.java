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

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        Invoice temp = null;
        try {

            for (Invoice invoice : INVOICE_DATABASE) {
                if (id == invoice.getId()) {
                    temp = invoice;
                } else {
                    return temp;
                }
            }
        }
        catch (Exception e){
            throw new InvoiceNotFoundException(id);
        }
            throw new InvoiceNotFoundException(id);
    }

    public static ArrayList<Invoice> getInvoiceByJobSeeker(int jobseekerId){
        ArrayList<Invoice> temp = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (jobseekerId == invoice.getJobseeker().getId()) {
                if (temp == null) {
                    temp = new ArrayList<Invoice>();
                }
                temp.add(invoice);
            }
        }
        return temp;
    }


    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice invoicee : INVOICE_DATABASE) {
            if (invoicee.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
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


    public boolean removeInvoice(Invoice invoice, int id) throws InvoiceNotFoundException {
        try {
            for (Invoice invoice_1 : INVOICE_DATABASE) {
                if (invoice.getId() == invoice_1.getId()) {
                    INVOICE_DATABASE.remove(invoice);
                    return true;
                }
            }
        }
        catch (Exception exception){
            throw new InvoiceNotFoundException(id);
        }
        throw new InvoiceNotFoundException(id);
    }
}

