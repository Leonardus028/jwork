package leonarduskevin.jwork;
/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan 
 * informasi pekerjaan, seperti id, nama, recruiter, fee yang diberikan dan kategory
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class Job
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private Recruiter recruiter;
    private int fee;
    private JobCategory category;
    

    /**
     * Constructor untuk objects dari class Job
     */
    public Job(int id, String name,Recruiter recruiter, int fee, JobCategory category)
    {
        this.id=id; 
        this.name=name;
        this.recruiter=recruiter;
        this.fee=fee;
        this.category=category;
        
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
    * Method ini digunakan untuk mengembalikan nilai name.
    * @return name
    */
    public String getName()
    {
        return this.name;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai fee.
    * @return fee
    */
    public int getFee()
    {
        return this.fee;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai kategori.
    * @return category
    */
    public JobCategory getCategory()
    {
        return this.category;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai perekru.
    * @return recruiter
    */
    public Recruiter getRecruiter()
    {
        return this.recruiter;
    }
    /**
    * Method ini digunakan untuk memberikan nilai id.
    * @param id
    */
    public void setId(int id)
    {
        this.id=id;
    }
    /**
    * Method ini digunakan untuk memberikan nilai name.
    * @param name
    */
    public void setName(String name)
    {
        this.name=name;
    }
    /**
    * Method ini digunakan untuk memberikan nilai recruiter.
    * @param recruiter
    */
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter=recruiter;
    }
    /**
    * Method ini digunakan untuk memberikan nilai fee/bayaran.
    * @param fee
    */
    public void setFee(int fee)
    {
        this.fee=fee;
    }
    /**
    * Method ini digunakan untuk memberikan nilai category.
    * @param category
    */
    public void setCategory(JobCategory category)
    {
        this.category=category;
    }
    /**
    * Method ini digunakan untuk menampilkan data
    */
    public String toString() 
    {
        return "Id = " + getId() + "\nName = " + getName() + "\nRecruiter = " + getRecruiter() + "\nCity= "
                + getRecruiter().getLocation().getCity() + "\nFee = " + getFee() + "\nCategory = " + getCategory() + "\n";
    }
}
