
/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan 
 * informasi lokasi, seperti nama provinsi, kota dan deskripsi
 * @author Leonardus Kevin
 * @version 18-3-2021
 */
public class Recruiter
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    

    /**
     * Constructor for objects of class Recruiter
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        // initialise instance variables
      this.id = id;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.location = location; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        // put your code here
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
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public Location getLocation()
    {
        return this.location;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void setLocation(Location location)
    {
        this.location = location;
    }
    public void printData() 
    {
        System.out.println(name);
    }
    
    
}
