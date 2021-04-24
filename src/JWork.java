import java.util.GregorianCalendar;

/**
 * Write a description of class JWork here.
 *
 * @Leonardus Kevin
 * @version 25.03.2021
 */
public class JWork
{


    /**
     * Constructor untuk objects dari class JWork
     */
    public JWork()
    {
        // initialise instance variables
        
    }

    public static void main(String[] args)
    {


        Location location1 = new Location("Jawa Barat", "Sukabumi", "Tempat Lahir");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Leonardus",
                "leonardus.kevin@gmail.com", "081384265050", location1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Leonardus",
                "leonardus@ui.ac.id", "Password123", 2021, 04, 22));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Leonardus",
                "leonardus@ui.ac.id", "Password123", 2021, 04, 23));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Hansaka",
                "hansaka@ui.ac.id", "Wijaya123", 2021, 03, 6));

        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
        DatabaseJob.addJob(new Job(1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1),
                10000, JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(2, "Data Analyst", DatabaseRecruiter.getRecruiterById(1), 20000,
                JobCategory.DataAnalyst));
        DatabaseJob.addJob(new Job(3, "Data Scientist", DatabaseRecruiter.getRecruiterById(1), 10000,
                JobCategory.DataAnalyst));

        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.BackEnd));
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));

        DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1,"Bonus1",10000,5000,false));
        DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1,"Bonus1",10000,5000,false));
        System.out.println(DatabaseBonus.getBonusDatabase());
        




        /**
        Recruiter recruiter1 = new Recruiter(1, "Leonardus Kevin", "leonardus.kevin@ui.ac.id", "081384265050", location1);
        Job job1 = new Job (1, "Data Engineer", recruiter1, 20000, JobCategory.BackEnd);
        Jobseeker jobseeker1 = new Jobseeker(1, "Hansaka Wijaya", ".hansaka.wijaya@ui.ac.id", "password", new GregorianCalendar(2021, 4, 8));
        Jobseeker jobseeker2 = new Jobseeker(2, "Hansaka Wijaya", "hansaka.wijaya@ui.ac.id", "Password1", 2021,5,9);
        Jobseeker jobseeker3 = new Jobseeker(3, "Hansaka Wijaya", "hansaka.wijaya@ui.ac.id", "Password1");
        Bonus bonus1 = new Bonus (10, "CODE01", 20000, 20001, true);
        EwalletPayment invoice1 = new EwalletPayment(1, job1, jobseeker2,InvoiceStatus.OnGoing);
        BankPayment invoice2 = new BankPayment (4, job1, jobseeker2, InvoiceStatus.Finished);
        
        invoice1.setTotalFee();
        invoice2.setTotalFee();
        
        System.out.println(invoice1);
        System.out.println(invoice2);
    
        /**
        Bonus bonus1 = new Bonus (10, "CODE01", 20000, 20001, true);
        Bonus bonus2 = new Bonus (20, "CODE02", 20000, 18000, true);
        EwalletPayment invoice1 = new EwalletPayment(1, job1, "4 April 2021", jobseeker1,InvoiceStatus.OnGoing);
        EwalletPayment invoice2 = new EwalletPayment(2, job1, "5 April 2021", jobseeker1,InvoiceStatus.OnGoing, bonus1);
        EwalletPayment invoice3 = new EwalletPayment(3, job1, "6 April 2021", jobseeker1,InvoiceStatus.OnGoing, bonus2);
        BankPayment invoice4 = new BankPayment (4, job1, "7 April 2021", jobseeker1, InvoiceStatus.Finished);
        BankPayment invoice5 = new BankPayment (5, job1, "8 April 2021", jobseeker1, InvoiceStatus.Finished, 2000);
        
        invoice4.setTotalFee();
        invoice5.setTotalFee();
        
        invoice4.printData();
        invoice5.printData();

        
        
        for (JobCategory jobCategory : JobCategory.values()) {
            System.out.println(jobCategory);
        }
        
        for (PaymentType paymentType : PaymentType.values()) {
            System.out.println(paymentType);
        }
        
        for (InvoiceStatus invoiceStatus : InvoiceStatus.values()) {
            System.out.println(invoiceStatus);}
        */
       
        
        
        
    }
}
