package leonarduskevin.jwork;
import java.util.ArrayList;

/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan 
 * database pekerkaan, yang berisi list jobseeker
 * @author Leonardus Kevin
 * @version 25.3.2021
 */
public class DatabaseJobseeker
{
    public static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();;
    public static int lastId = 0;
    private static String[] listJobseeker;

    public static ArrayList<Jobseeker> getDatabaseJobseeker(){
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException{
        Jobseeker temp = null;
        try{
            for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
                if (id == jobseeker.getId()) {
                    temp = jobseeker;
                    return temp;
                }
            }
        }
        catch (Exception e){
            throw new JobSeekerNotFoundException(id);
        }
        throw new JobSeekerNotFoundException(id);
    }

    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException{
        try{
            for(int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
                if(JOBSEEKER_DATABASE.get(i).getEmail() == jobseeker.getEmail()) {
                    throw new EmailAlreadyExistsException(jobseeker);
                }
            }
        }catch (Exception exception){
            throw new EmailAlreadyExistsException(jobseeker);
        }

        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }
    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException{
        try{
            for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
                if (jobseeker.getId() == jobseeker.getId()) {
                    JOBSEEKER_DATABASE.remove(jobseeker);
                    return true;

                }
            }
        }
        catch (Exception exception){
            throw new JobSeekerNotFoundException(id);
        }
        throw new JobSeekerNotFoundException(id);
    }


}

