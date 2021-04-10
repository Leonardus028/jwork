
/**
 * Class Jobseeker berfungsi untuk menangani objek yang berkaitan dengan 
 * informasi pencari kerja, seperti id, nama, email, password dan tanggal masuk
 * @author Leonardus Kevin
 * @version 18-3-2021
 */

import java.util.regex.*;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

    /**
     * Constructor untuk objects dari class Jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
        
    }
    
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
        
        
    }
    public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        
        
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
    public Calendar getJoinDate()
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
        String regex = "^[^.][a-zA-Z0-9&*_~.{1}]+@[^-][a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            this.email = email;
        }
        else{
            this.email = "";
        }
    }
    
    /**
    * Method ini digunakan untuk memberikan nilai untuk password
    * @param password
    */
    public void setPassword(String password)
    {
        String regexPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regexPassword);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }
    /**
    * Method ini digunakan untuk memberikan nilai untuk tangagl masuk
    * @param joinDate
    */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year, (month-1), dayOfMonth);
    }
    /**
    * Method ini digunakan untuk menampilkan nilai dari nama Jobseeker
    */
    public String toString()
    {
         if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword() + "\nJoin Date = " + date + "\n";
        }
    }
}
