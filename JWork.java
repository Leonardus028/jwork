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
        
        
        Location location1 = new Location("Jawa Barat", "Sukabumi", "Dingin");
        Recruiter recruiter1 = new Recruiter(1, "Leonardus Kevin", "leonardus.kevin@ui.ac.id", "081384265050", location1);
        Job job1 = new Job (1, "Data Engineer", recruiter1, 20000, JobCategory.BackEnd);
        Jobseeker jobseeker1 = new Jobseeker(1, "Hansaka Wijaya", ".hansaka.wijaya@ui.ac.id", "password", new GregorianCalendar(2021, 4, 8));
        Jobseeker jobseeker2 = new Jobseeker(2, "Hansaka Wijaya", "hansaka.wijaya@ui.ac.id", "Password1", 2021,5,9);
        Jobseeker jobseeker3 = new Jobseeker(3, "Hansaka Wijaya", "hansaka.wijaya@ui.ac.id", "Password1");
        
        
        System.out.println(jobseeker1);
        System.out.println(jobseeker2);
        System.out.println(jobseeker3); 
        
        jobseeker1.setEmail("hansaka.wijaya@email.ui.ac.id");
        jobseeker1.setPassword("Password1");
        System.out.println(jobseeker1);
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
