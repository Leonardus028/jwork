package leonarduskevin.jwork;
import java.util.ArrayList;

/**
 * Class untuk menyimpan semua object Job yang ada dalam ArrayList Job
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class DatabaseJob {
    public static ArrayList<Job> JOB_DATABASE= new ArrayList<Job>();
    public static int lastId = 0;
    private static String[] listJob;
    /**
     * Method untuk mengambil semua Jobdari Database
     */
    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }
    /**
     * Method untuk mengambil Job berdasarkan ID terakhir
     */
    public static int getLastId(){
        return lastId;
    }
    /**
     * Method untuk mengambil Job berdasarkan ID
     */
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
    /**
     * Method untuk mengambil Job berdasarkan Recruiter
     */
    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> dummy = new ArrayList<Job>();
        for(int i = 0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getRecruiter().getId() == recruiterId) {
                dummy.add(JOB_DATABASE.get(i));
            }
        }
        return dummy;

    }
    /**
     * Method untuk mengambil Job berdasarkan Category
     */
    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> dummy = new ArrayList<Job>();
        for(int i = 0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getCategory() == category) {
                dummy.add(JOB_DATABASE.get(i));
            }
        }
        return dummy;
    }


    /**
     * Method untuk menanmbahkan Job ke dalam database
     */
    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }
    /**
     * Method untuk menghapus Job dari database
     */
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
