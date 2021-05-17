package leonarduskevin.jwork;
import java.util.ArrayList;

/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan 
 * database pekerkaan, yang berisi list job
 * @author Leonardus Kevin
 * @version 25.3.2021
 */
public class DatabaseJob {
    public static ArrayList<Job> JOB_DATABASE= new ArrayList<Job>();
    public static int lastId = 0;
    private static String[] listJob;

    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }
    public static int getLastId(){
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job temp = null;
        try{
            for (int i = 0; i < JOB_DATABASE.size(); i++) {
                if (id == JOB_DATABASE.get(i).getId()) {
                    temp = JOB_DATABASE.get(i);
                    return temp;
                }
            }
        }
        catch (Exception exception){
            throw new JobNotFoundException(id);
        }
        throw new JobNotFoundException(id);
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> dummy = new ArrayList<Job>();
        for(int i = 0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getRecruiter().getId() == recruiterId) {
                dummy.add(JOB_DATABASE.get(i));
            }
        }
        return dummy;

    }

    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> dummy = new ArrayList<Job>();
        for(int i = 0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getCategory() == category) {
                dummy.add(JOB_DATABASE.get(i));
            }
        }
        return dummy;
    }



    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    public static boolean removeJob(int id) throws JobNotFoundException {
        try{
            for (int i=0; i< JOB_DATABASE.size(); i++) {
                if (JOB_DATABASE.get(i).getId() == id) {
                    JOB_DATABASE.remove(i);
                    return true;
                }
            }
        }
        catch (Exception exception){
            throw new JobNotFoundException(id);
        }
        throw new JobNotFoundException(id);
    }
}
