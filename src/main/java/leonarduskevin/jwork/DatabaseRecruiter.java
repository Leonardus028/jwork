package leonarduskevin.jwork;
import java.util.ArrayList;

/**
 * Class untuk menyimpan semua object Recruiter yang ada dalam ArrayList Recruiter
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class DatabaseRecruiter
{
    public static ArrayList<Recruiter> RECRUITER_DATABASE= new ArrayList<Recruiter>();
    public static int lastId = 0;
    private static String[] listRecruiter;

    /**
     * Method untuk mengambil semua Recruiter dari Database
     */
    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }

    /**
     * Method untuk mengambil Recruiter berdasarkan ID terakhir
     */
    public static int getLastId(){
        return lastId;
    }

    /**
     * Method untuk mengambil Bonus berdasarkan ID
     */
    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Recruiter temp = null;
        try{
            for (int i = 0; i < RECRUITER_DATABASE.size(); i++) {
                if (id == RECRUITER_DATABASE.get(i).getId()) {
                    temp = RECRUITER_DATABASE.get(i);
                    return temp;
                }
            }
        } catch (Exception e){
            throw new RecruiterNotFoundException(id);
        }

        throw new RecruiterNotFoundException(id);
    }

    /**
     * Method untuk menambahkan Recruiter ke dalam database
     */
    public static boolean addRecruiter(Recruiter recruiter){
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }

    /**
     * Method untuk menghapus Recruiter dari database
     */
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        boolean temp = true;
        try{
            for (Recruiter recruiter: RECRUITER_DATABASE) {
                if (id == recruiter.getId()){
                    RECRUITER_DATABASE.remove(id);
                    temp = true;
                }
                else{
                    temp = false;
                }
            }
        } catch (Exception e){
            throw new RecruiterNotFoundException(id);
        }
        throw new RecruiterNotFoundException(id);
    }
}
