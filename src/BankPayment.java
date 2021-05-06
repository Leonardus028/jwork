import java.text.SimpleDateFormat;
import java.util.ArrayList;

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
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }
    
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker,  int adminFee)
    {
        super(id, jobs, jobseeker);
        this.adminFee = adminFee;
    }

    @Override
    public void setTotalFee() {
        for(Job job : getJobs()) {
            if(adminFee != 0) {
                totalFee = job.getFee() - getAdminFee();
            }
            else {
                totalFee = job.getFee();
            }
        }
    }

    @Override
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }
    public int getAdminFee() {
        return adminFee;
    }
    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());

        for(int i =0; i<getJobs().size(); i++){
            if (adminFee !=0){
                return "ID\t\t" + getId() +
                        "\nJob\t\t" + getJobs().get(i).getName() +
                        "\nDate\t\t" + date +
                        "\nJobseeker\t" + getJobseeker().getName() +
                        "\nAdmin Fee\t" + adminFee +
                        "\nTotal Fee\t" + super.totalFee +
                        "\nStatus\t\t" + getInvoiceStatus() +
                        "\nPayment Type\t" + PAYMENT_TYPE + "\n";
            }else{
                return "ID\t\t" + getId() +
                        "\nJob\t\t" + getJobs().get(i).getName() +
                        "\nDate\t\t" + date +
                        "\nJobseeker\t" + getJobseeker().getName() +
                        "\nTotal Fee\t" + super.totalFee +
                        "\nStatus\t\t" + getInvoiceStatus() +
                        "\nPayment Type\t" + PAYMENT_TYPE + "\n";
            }
        }
        return null;
    }
}
