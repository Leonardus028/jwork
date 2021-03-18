
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class JWork
     */
    public JWork()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        Location location1 = new Location("Jawa Barat", "Sukabumi", "Dingin");
        Recruiter recruiter1 = new Recruiter(1, "Leonardus Kevin", "leonardus.kevin@ui.ac.id", "081384265050", location1);
        Job job1 = new Job(1,"Leonardus Kevin",recruiter1,111,"Engineer");
        Jobseeker jobseeker1 = new Jobseeker(1,"Leonardus Kevin","leonardus.kevin@ui.ac.id","password","18 Maret 2021");
        Invoice invoice1 = new Invoice(1,2,"18 Maret 2021",2,jobseeker1);
        
        
    }
}
