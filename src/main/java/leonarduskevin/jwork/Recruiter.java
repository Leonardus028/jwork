package leonarduskevin.jwork;
/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan 
 * informasi lokasi, seperti nama provinsi, kota dan deskripsi
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class Recruiter
{

    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    

    /**
     * Constructor untuk objects dari class Recruiter
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
    * Method ini digunakan untuk mengembalikan nilai id.
    * @return id
    */
    public int getId()
    {

        return this.id;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai id.
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
    * Method ini digunakan untuk mengembalikan nilai nomor telepon.
    * @return phoneNumber
    */
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai lokasi.
    * @return location
    */
    public Location getLocation()
    {
        return this.location;
    }
    /**
    * Method ini digunakan untuk memberikan nilai id.
    * @param id
    */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
    * Method ini digunakan untuk memberikan nilai email.
    * @param email
    */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
    * Method ini digunakan untuk memberikan nilai nama.
    * @param name
    */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
    * Method ini digunakan untuk memberikan nilai nomor telepon.
    * @param phoneNumber
    */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    /**
    * Method ini digunakan untuk memberikan nilai category.
    * @param location
    */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    /**
    * Method ini digunakan untuk menampilkan nilai dari perekrut
    */
    public String toString() 
    {
        
        return "Id = " + getId() + "\nNama = " + getName() + "\nPhone Number = "
                + getPhoneNumber() + "\nLocation = " + getLocation();
    }
    
    
}
