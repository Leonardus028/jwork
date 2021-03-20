
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
     * Constructor untuk objects dari class Jobseeker
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
    * Method ini digunakan untuk mengembalikan nilai id.
    * @return id
    */
    public int getId()
    {
        return this.id;
    }  
    /**
    * Method ini digunakan untuk mengembalikan nilai nama.
    * @return name
    */
    public String getName()
    {
        return this.name;
    }    
    /**
    * Method ini digunakan untuk mengembalikan nilai email.
    * @return email
    */
    public String getEmail()
    {
        return this.email;
    }  
    /**
    * Method ini digunakan untuk mengembalikan nilai password.
    * @return password
    */
    public String getPassword()
    {
        return this.password;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai tanggal masuk.
    * @return joinDate
    */
    public String getJoinDate()
    {
        return this.joinDate;
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk id
    * @param id
    */
    public void setId(int id)
    {
        this.id = id;
    }   
    /**
    * Method ini digunakan untuk memberikan nilai untuk nama
    * @param name
    */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk email
    * @param email
    */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk password
    * @param password
    */
    public void setPassword(String password)
    {
        this.password = password;
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk tangagl masuk
    * @param joinDate
    */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
    /**
    * Method ini digunakan untuk menampilkan nilai dari nama Jobseeker
    */
    public void printData()
    {
        System.out.println(name);
    }
}
