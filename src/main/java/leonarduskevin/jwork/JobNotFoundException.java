package leonarduskevin.jwork;
/**
 * Class untuk mengatur Error Handling dari Job
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class JobNotFoundException extends Exception{

    public int job_error;
    /**
     * Constructor untuk Error Handling Job
     */
    public JobNotFoundException(int job_input){
        super("Job ID: ");
        job_error = job_input;
    }
    /**
     * Method untuk melakukan print hasil dari Error Handling
     */
    public String getMessage(){
        return super.getMessage() + job_error + " not found";
    }

}
