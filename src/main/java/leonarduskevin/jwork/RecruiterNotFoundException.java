package leonarduskevin.jwork;
/**
 * Class untuk mengatur Error Handling dari Recruiter
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class RecruiterNotFoundException extends Exception{
    public int recruiter_error;
    /**
     * Constructor untuk Error Handling Recruiter
     */
    public RecruiterNotFoundException(int recruiter_input){
        super("Recruiter ID: ");
        recruiter_error = recruiter_input;
    }
    /**
     * Method untuk melakukan print hasil dari Error Handling
     */
    public String getMessage(){
        return super.getMessage() + recruiter_error + " not found";
    }

}
