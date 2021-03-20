
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
     * Constructor untuk objects dari class Invoice
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
    * Method ini digunakan untuk mengembalikan nilai id.
    * @return id
    */
    public int getId()
    {
        return this.id;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai id job.
    * @return idJob
    */
    public int getIdJob()
    {
        return this.idJob;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai tanggal.
    * @return date
    */
    public String getDate()
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
    * Method ini digunakan untuk memberikan nilai untuk id
    * @param id
    */
    public void setId(int id)
    {
         this.id=id;   
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk job id.
    * @param idJob
    */
    public void setIdJobs(int idJob)
    {
        this.idJob=idJob;
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk tanggal.
    * @param date
    */
    public void setDate(String date)
    {
        this.date=date;
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk fee/bayaran.
    * @param fee
    */
    public void setTotalFee(int totalFee)
    {
        this.totalFee=totalFee;
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk class jobseeker.
    * @param jobseeker
    */
    public void setJobseeker(Jobseeker jobseeker)
    {
        this.jobseeker=jobseeker;
    }
    /**
    * Method ini digunakan untuk menampilkan data, tetapi method ini 
    * belum dilengkapi
    */
    public void printData()
    {
        System.out.println(totalFee);
    }
    
}
