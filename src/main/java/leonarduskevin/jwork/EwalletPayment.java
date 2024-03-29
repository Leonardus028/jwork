package leonarduskevin.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Merupakan SubClass dari Class Invoice, yang akan berfungsi untuk menampilkan
 * Output ketia pembayaran menggunakan Ewallet Payment
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class EwalletPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor untuk object E-wallet Payment
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id, jobs, jobseeker);
    }
    /**
     * Constructor untuk object E-wallet Payment menggunakan bonus
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker,  Bonus bonus)
    {
        super(id, jobs, jobseeker);
        this.bonus = bonus;
    }
    /**
     * Method untuk mengambil jenis Payment yang digunakan
     */
    @Override
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }
    /**
     * Method untuk mengambil Bonus yang digunakan
     */
    public Bonus getBonus() {
        return bonus;
    }
    /**
     * Method untuk memberi nilai Bonus yang digunakan
     */
    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }
    /**
     * Method untuk memberi nilai total fee sebuah job
     */
    @Override
    public void setTotalFee() {
        ArrayList<Job> jobs = getJobs();
        for(Job job: jobs){
            int fee = job.getFee();
            if (bonus != null && (bonus.getActive() == true) && fee > bonus.getMinTotalFee()) {
                super.totalFee = fee + bonus.getExtraFee();
            } else {
                super.totalFee = fee;
            }
        }
    }
    /**
     * Method untuk melakukan print semua infromasi terkait E-wallet Payment
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

        String date = dateFormat.format(getDate().getTime());

        for(int i = 0; i < getJobs().size(); ++i) {
            if ((bonus != null) && bonus.getActive() && totalFee > bonus.getMinTotalFee()) {
                setTotalFee();
                return "ID\t\t= " + getId() +
                        "\nJob\t\t= " + getJobs().get(i).getName() +
                        "\nDate\t\t= " + date +
                        "\nJobseeker\t= " + getJobseeker().getName() +
                        "\nReferral Code\t= " + bonus.getReferralCode() +
                        "\nTotal Fee\t= " + super.totalFee +
                        "\nStatus\t\t= " + getInvoiceStatus() +
                        "\nPayment Type\t= " + PAYMENT_TYPE + "\n";
            } else {
                return "ID\t\t= " + getId() +
                        "\nJob\t\t= " + getJobs().get(i).getName() +
                        "\nDate\t\t= " + date +
                        "\nJobseeker\t= " + getJobseeker().getName() +
                        "\nTotal Fee\t= " + super.totalFee +
                        "\nStatus\t\t= " + getInvoiceStatus() +
                        "\nPayment Type\t= " + PAYMENT_TYPE + "\n";
            }
        }
        return null;
    }
}
