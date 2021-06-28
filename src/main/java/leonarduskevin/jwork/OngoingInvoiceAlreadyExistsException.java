package leonarduskevin.jwork;
/**
 * Class untuk mengatur Error Handling dari Ongoing Invoice
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class OngoingInvoiceAlreadyExistsException extends Exception{
    public Invoice invoice_error;
    /**
     * Constructor untuk Error Handling Ongoing Invoice
     */
    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input){
        super("Ongoing Invoice: ");
        invoice_error = invoice_input;
    }
    /**
     * Method untuk melakukan print hasil dari Error Handling
     */
    public String getMessage() {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists.";
    }
}
