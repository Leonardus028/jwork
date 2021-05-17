package leonarduskevin.jwork;
public class JobNotFoundException extends Exception{

    public int job_error;

    public JobNotFoundException(int job_input){
        super("Job ID: ");
        job_error = job_input;
    }

    public String getMessage(){
        return super.getMessage() + job_error + " not found";
    }

}
