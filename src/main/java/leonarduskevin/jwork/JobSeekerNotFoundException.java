package leonarduskevin.jwork;
/**
 * Class untuk mengatur Error Handling dari Jobseeker
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class JobSeekerNotFoundException extends Exception {
    public int jobseeker_error;
    /**
     * Constructor untuk Error Handling Jobseeker
     */
    public JobSeekerNotFoundException(int jobseeker_input){
        super("Jobseeker ID: ");
        jobseeker_error = jobseeker_input;
    }
    /**
     * Method untuk melakukan print hasil dari Error Handling
     */
    public String getMessage(){
        return super.getMessage() + jobseeker_error + " not found";
    }

}
