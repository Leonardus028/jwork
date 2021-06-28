package leonarduskevin.jwork;
import java.util.ArrayList;

/**
 * Class untuk menyimpan semua object Jobseeker yang ada dalam ArrayList Jobseeker
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class DatabaseJobseeker
{
    public static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();;
    public static int lastId = 0;
    private static String[] listJobseeker;
    /**
     * Method untuk mengambil semua Jobseeker dari Database
     */
    public static ArrayList<Jobseeker> getDatabaseJobseeker(){
        return JOBSEEKER_DATABASE;
    }
    /**
     * Method untuk mengambil Jobseeker berdasarkan ID terakhir
     */
    public static int getLastId(){
        return lastId;
    }
    /**
     * Method untuk mengambil Jobseeker berdasarkan ID
     */
    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        Jobseeker temp = null;
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()) {
                temp = jobseeker;
                return temp;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }
    /**
     * Method untuk menambahkan Jobseeker ke dalam database
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker jobseeker1 : JOBSEEKER_DATABASE) {
            if (jobseeker1.getEmail().equals(jobseeker.getEmail())) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }
    /**
     * Method untuk menghapus Jobseeker dari database
     */
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

    public static Jobseeker jobseekerLogin(String email, String password){
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                return jobseeker;
            }
        }
        return null;
    }

}

