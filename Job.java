
/**
 * Write a description of class Job here.
 * Menangani object mengenai pekerjaan
 * @author Leonardus Kevin
 * @version 18-3-2021
 */
public class Job
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private Recruiter recruiter;
    private int fee;
    private String category;
    

    /**
     * Constructor for objects of class Job
     */
    public Job(int id, String name,Recruiter recruiter, int fee, String category)
    {
        this.id=id; 
        this.name=name;
        this.recruiter=recruiter;
        this.fee=fee;
        this.category=category;
        
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
    public String getName()
    {
        return this.name;
    }
    public int getFee()
    {
        return this.fee;
    }
    public String getCategory()
    {
        return this.category;
    }
    public Recruiter recruiter()
    {
        return this.recruiter;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter=recruiter;
    }
    public void setFee(int fee)
    {
        this.fee=fee;
    }
    public void setCategory(String category)
    {
        this.category=category;
    }
    public void printData() 
    {
    }
}
