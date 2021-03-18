
/**
 * Class Jobseeker berfungsi untuk menangani objek yang berkaitan dengan 
 * informasi pencari kerja, seperti id, nama, email, password dan tanggal masuk
 * @author Leonardus Kevin
 * @version 18-3-2021
 */
public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor for objects of class Jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
        
        
    
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
    public String getEmail()
    {
        return this.email;
    }   
    public String getPassword()
    {
        return this.password;
    }
    public String getJoinDate()
    {
        return this.joinDate;
    }
    public void setId(int id)
    {
        this.id = id;
    }   
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
    public void printData()
    {
        System.out.println(name);
    }
}
