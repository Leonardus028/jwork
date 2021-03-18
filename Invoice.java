
/**
 * Class Jobseeker berfungsi untuk menangani objek yang berkaitan dengan 
 * informasi nota, seperti id, id pekerjaan, tanggal, total harga dan objek dari
 * job seeker
 * @author Leonardus Kevin
 * @version 18-3-2021
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, int idJob, String date, int totalfee, Jobseeker jobseeker)
    {
       this.id=id;
       this.idJob=idJob;
       this.date=date;
       this.totalFee=totalFee;
       this.jobseeker=jobseeker;
    
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return this.id;
    }
    public int getIdJob()
    {
        return this.idJob;
    }
    public String getDate()
    {
        return this.date;
    }
    public int getTotalFee()
    {
        return this.totalFee;
    }
    public Jobseeker getJobseeker()
    {
        return this.jobseeker;
    }
    public void setId(int id)
    {
         this.id=id;   
    }
    public void setIdJobs(int idJobs)
    {
        this.idJob=idJob;
    }
    public void setDate(String date)
    {
        this.date=date;
    }
    public void setTotalFee(int totalFee)
    {
        this.totalFee=totalFee;
    }
    public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker=jobseeker;
    }
    public void printData()
    {
    }
    
}
