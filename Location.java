
/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan 
 * informasi lokasi, seperti nama provinsi, kota dan deskripsi
 * @author Leonardus Kevin
 * @version 18-3-2021
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String city;
    private String description;
    

    /**
     * Constructor for objects of class Location
     */
    public Location(String province, String city, String description)
    {
        // initialise instance variables
        this.province=province;
        this.city=city;
        this.description=description;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getProvince()
    {
        
        return this.province;
    }
    public String getCity()
    {
        
        return this.city;
    }
    public String getDescription()
    {
        
        return this.description;
    }
    public void setProvince(String province)
    {
        this.province = province;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void printData()
    {
        System.out.println(province);
    }
}
