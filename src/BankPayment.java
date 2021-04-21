import java.text.SimpleDateFormat;

/**
 * Merupakan SubClass dari Class Invoice, yang akan berfungsi untuk menampilkan
 * Output ketia pembayaran menggunakan Bank Payment
 *
 * @Leonardus Kevin
 * @5.1.2021
 */
public class BankPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
    }
    
    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus,  int adminFee)
    {
        super(id, job, jobseeker, invoiceStatus);
        this.adminFee = adminFee;
    }

    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public int getAdminFee()
    {
        return adminFee;
    }
    
    public void setAdminFee(int adminFee)
    {
        this.adminFee=adminFee;
    }
    
    @Override
    public void setTotalFee()
    {
        if (adminFee !=0) {
           super.totalFee = getJob().getFee() - adminFee;
        } else {
            super.totalFee = getJob().getFee();
        }
    }
    
    public String toString()
    {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        System.out.println("===================== BANK PAYMENT =====================");
        System.out.println("ID: " + getId());
        System.out.println("Job: " + getJob().getName());
        System.out.println("Date: " + date);
        System.out.println("Job Seeker: " + getJobseeker().getName());
        
        setTotalFee();
        System.out.println("Admin Fee: " + adminFee);
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + PAYMENT_TYPE);
        return "";
    }
}
