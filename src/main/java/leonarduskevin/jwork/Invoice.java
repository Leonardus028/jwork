package leonarduskevin.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Class Jobseeker berfungsi untuk menangani objek yang berkaitan dengan 
 * informasi nota, seperti id, id pekerjaan, tanggal, total harga dan objek dari
 * job seeker
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    public int id;
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus = InvoiceStatus.OnGoing;
    

    /**
     * Constructor untuk objects dari class Invoice
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
       this.id=id;
       this.jobs=jobs;
       this.date = Calendar.getInstance();
       this.jobseeker=jobseeker;
    
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai id.
    * @return id
    */
    public int getId()
    {
        return this.id;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai job.
    * @return idJob
    */
    public ArrayList<Job> getJobs()
    {
        return this.jobs;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai tanggal.
    * @return date
    */
    public Calendar getDate()
    {
        return this.date;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai fee/bayaran.
    * @return fee
    */
    public int getTotalFee()
    {
        return this.totalFee;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai jobseeker 
    * yang dibuat di class Jobseeker.
    * @return Jobseeker
    */
    public Jobseeker getJobseeker()
    {
        return this.jobseeker;
    }
    /**
     * Method ini digunakan untuk mengembalikan nilai Payment Type
     */
    public abstract PaymentType getPaymentType();

    /**
     * Method ini digunakan untuk mengembalikan nilai Status Invoice
     * @return invoiceStatus
     */
    public InvoiceStatus getInvoiceStatus()
    {

        return this.invoiceStatus;
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk id
    * @param id
    */
   
    public void setId(int id)
    {
         this.id=id;   
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk job id.
    * @param id
    */
    public void setJobs(ArrayList<Job>  jobs)
    {

        this.jobs=jobs;
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk tanggal.
    * @param date
    */
    public void setDate(Calendar date)
    {

        this.date=date;
    }
    /**
     * Method ini digunakan untuk memberikan nilai untuk tanggal.
     */
    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar(year, (month-1), dayOfMonth);
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk fee/bayaran.

    */
    public abstract void setTotalFee();
    
    /**
    * Method ini digunakan untuk memberikan nilai untuk jobseeker.
    * @param jobseeker
    */
    public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker=jobseeker;
    }

    /**
     * Method ini digunakan untuk memberikan nilai untuk Invoice Status
     * @param invoiceStatus
     */
    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
    /**
    * Method ini digunakan untuk menampilkan data
     * */
    public abstract String toString();
}
