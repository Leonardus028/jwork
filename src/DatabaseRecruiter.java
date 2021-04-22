import java.util.ArrayList;

/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan 
 * database pekerkaan, yang berisi list recruiter
 * @author Leonardus Kevin
 * @version 18-3-2021
 */
public class DatabaseRecruiter
{
    public static ArrayList<Recruiter> RECRUITER_DATABASE= new ArrayList<Recruiter>();
    public static int lastId = 0;
    private static String[] listRecruiter;


    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }
    public static int getLastId(){
        return lastId;
    }

    public static Recruiter getRecruiterById(int id){
        for(int i = 0; i < RECRUITER_DATABASE.size()-1; i++){
            if(RECRUITER_DATABASE.get(i).getId() == id){
                return RECRUITER_DATABASE.get(i);
            }else{
                return null;
            }
        }
        return null;
    }

    public static boolean addRecruiter(Recruiter recruiter){
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }

    public static boolean removeRecruiter(int id){
        for(int i = 0; i < RECRUITER_DATABASE.size(); i++){
            if(RECRUITER_DATABASE.get(i).getId() == id){
                RECRUITER_DATABASE.remove(i);
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
