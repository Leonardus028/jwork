package leonarduskevin.jwork;
/**
 * Class untuk mengatur Error Handling dari Invoice
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class InvoiceNotFoundException extends Exception{
    public int invoice_error;
    /**
     * Constructor untuk Error Handling Invoice
     */
    public InvoiceNotFoundException(int invoice_input){
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }
    /**
     * Method untuk melakukan print hasil dari Error Handling
     */
    public String getMessage(){
        return super.getMessage() + invoice_error + " not found";
    }
}
