package leonarduskevin.jwork;
public class RecruiterNotFoundException extends Exception{
    public int recruiter_error;

    public RecruiterNotFoundException(int recruiter_input){
        super("Recruiter ID: ");
        recruiter_error = recruiter_input;
    }

    public String getMessage(){
        return super.getMessage() + recruiter_error + " not found";
    }

}
