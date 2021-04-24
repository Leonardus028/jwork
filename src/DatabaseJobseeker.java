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

    public static Jobseeker getJobseekerById(int id){
        Jobseeker dummy = null;
        for(int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if(JOBSEEKER_DATABASE.get(i).getId() == id) {
                dummy = JOBSEEKER_DATABASE.get(i);
            }
        }
        return dummy;

    }

    public static boolean addJobseeker(Jobseeker jobseeker){
        for(int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if(JOBSEEKER_DATABASE.get(i).getEmail() == jobseeker.getEmail()) {
                return false;
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }
    public static boolean removeJobseeker(int id){
        for(int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if(JOBSEEKER_DATABASE.get(i).getId() == id) {
                JOBSEEKER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }


}

