package leonarduskevin.jwork;
/**
 * Class untuk mengatur Error Handling dari Email
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class EmailAlreadyExistsException extends Exception {
    public Jobseeker jobseeker_error;
    /**
     * Constructor untuk Error Handling Email
     */
    public EmailAlreadyExistsException(Jobseeker jobseeker_input) {
        super("Jobseeker Email: ");
        jobseeker_error = jobseeker_input;
    }
    /**
     * Method untuk melakukan print hasil dari Error Handling
     */
    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + " already exists,";
    }
}

