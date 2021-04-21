import java.text.SimpleDateFormat;

/**
 * Merupakan SubClass dari Class Invoice, yang akan berfungsi untuk menampilkan
 * Output ketia pembayaran menggunakan Ewallet Payment
 *
 * @Leonardus Kevin
 * @4.1.2021
 */
public class EwalletPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
    }
    
    public EwalletPayment(int id, Job job, Jobseeker jobseeker,  Bonus bonus, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
        this.bonus = bonus;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public Bonus getBonus()
    {
        return bonus;
    }
    
    public void setBonus(Bonus bonus)
    {
        this.bonus=bonus;
    }
    
    @Override
    public void setTotalFee()
    {
        if (bonus != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()) {
            super.totalFee = getJob().getFee() + bonus.getExtraFee();
        } else {
            super.totalFee = getJob().getFee();

        }
    }
    
    public String toString()
    {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        System.out.println("===================== E-WALLET PAYMENT =====================");
        System.out.println("ID: " + getId());
        System.out.println("Job: " + getJob().getName());
        System.out.println("Date: " + date);
        System.out.println("Job Seeker: " + getJobseeker().getName());
        
        if (bonus != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()){
            System.out.println("Referral Code: " + bonus.getReferralCode());
        }
        
        setTotalFee();
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + PAYMENT_TYPE);
        return "";
    }
}
