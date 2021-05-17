package leonarduskevin.jwork;
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
     * Constructor untuk objects dari class Location
     */
    public Location(String province, String city, String description)
    {
        // initialise instance variables
        this.province=province;
        this.city=city;
        this.description=description;
    }

    /**
    * Method ini digunakan untuk mengembalikan nilai provinsi.
    * @return province
    */
    public String getProvince()
    {
        
        return this.province;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai kota.
    * @return city
    */
    public String getCity()
    {
        
        return this.city;
    }
    /**
    * Method ini digunakan untuk mengembalikan nilai deskripsi.
    * @return deskripsi
    */
    public String getDescription()
    {
        
        return this.description;
    }
    /**
    * Method ini digunakan untuk memberikan nilai provinsi.
    * @param province
    */
    public void setProvince(String province)
    {
        this.province = province;
    }
    /**
    * Method ini digunakan untuk memberikan nilai kota.
    * @param description
    */
    public void setCity(String city)
    {
        this.city = city;
    }
    /**
    * Method ini digunakan untuk memberikan nilai deskripsi.
    * @param description
    */
    public void setDescription(String description)
    {
        this.description = description;
    }
    /**
    * Method ini digunakan untuk menampilkan nilai dari provinsi
    */
    public String toString() {
        return "Province = " + getProvince() + "\nCity = " + getCity() + "\nDescription = " + getDescription();
    }
}
