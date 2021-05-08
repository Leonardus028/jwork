import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Write a description of class JWork here.
 *
 * @Leonardus Kevin
 * @version 25.03.2021
 */
public class JWork
{
    public static void main(String[] args) throws EmailAlreadyExistsException, ReferralCodeAlreadyExistsException, JobSeekerNotFoundException, JobNotFoundException,  RecruiterNotFoundException, BonusNotFoundException
    {

        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Leonardus",
                    "leonardus@ui.ac.id", "Password123", 2021, 04, 22));
        }catch (EmailAlreadyExistsException exception){
            System.out.println(exception.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Kevin",
                    "leonardus@ui.ac.id", "Password123", 2021, 04, 23));
        }catch (EmailAlreadyExistsException exception){
            System.out.println(exception.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Hansaka",
                    "hansaka@ui.ac.id", "Wijaya123", 2021, 03, 6));
        }catch (EmailAlreadyExistsException exception){
            System.out.println(exception.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Wijaya",
                    "wijaya@ui.ac.id", "Wijaya123", 2021, 03, 7));
        }catch (EmailAlreadyExistsException exception){
            System.out.println(exception.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1,"Bonus1",1000,5000,true));
        }catch (ReferralCodeAlreadyExistsException exception){
            System.out.println(exception.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1,"Bonus1",1000,5000,true));
        }catch (ReferralCodeAlreadyExistsException exception){
            System.out.println(exception.getMessage());
        }
        try {
            DatabaseJobseeker.getJobseekerById(4);
        }catch (JobSeekerNotFoundException exception){
            System.out.println(exception.getMessage());
        }
        try {
            DatabaseRecruiter.getRecruiterById(3);
        }catch (RecruiterNotFoundException exception){
            System.out.println(exception.getMessage());
        }
        try {
            DatabaseJob.getJobById(3);
        }catch (JobNotFoundException exception){
            System.out.println(exception.getMessage());
        }
        try {
            DatabaseBonus.getBonusById(3);
        }catch (BonusNotFoundException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("\n===== Database Bonus =====");
        System.out.println(DatabaseBonus.getBonusDatabase());
        System.out.println("\n===== Database Jobseeker =====");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());



        Location location1 = new Location("Jawa Barat", "Sukabumi", "Tempat Lahir");
        DatabaseRecruiter.addRecruiter(new Recruiter(1, "Leonardus",
                "leonardus.kevin@gmail.com", "081384265050", location1));
        ArrayList<Job> myJob = new ArrayList<Job>();
        ArrayList<Job> myJob1 = new ArrayList<Job>();

        try {
            myJob.add(new Job(1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        try {
            myJob1.add(new Job(2, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }


        /**
         * Pengujian Invoice Post Test (Melanjutkan Case Study)
         */
        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(1, myJob, DatabaseJobseeker.getJobseekerById(1)));
        } catch (OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(2, myJob, DatabaseJobseeker.getJobseekerById(2)));
        } catch (OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(3, myJob1, DatabaseJobseeker.getJobseekerById(3)));
        } catch (OngoingInvoiceAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseInvoice.getInvoiceById(3);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n===== Database Invoice =====");
        System.out.println(DatabaseInvoice.getInvoiceDatabase());

        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            new Thread(new FeeCalculator(invoice)).start();
        }







        
        
        
    }
}
