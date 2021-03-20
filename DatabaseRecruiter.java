
/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan 
 * database pekerkaan, yang berisi list job
 * @author Leonardus Kevin
 * @version 18-3-2021
 */
public class DatabaseRecruiter
{
    private String[] listRecruiter;
    public DatabaseRecruiter(){
       listRecruiter = new String[100];
    }
    public DatabaseRecruiter(String[] listRecruiter){
        this.listRecruiter = listRecruiter;
    }
    public boolean addRecruiter(Recruiter recruiter){
        return false;
    }
    public boolean removeRecruiter(Recruiter recruiter){
        return false;
    }
    public Recruiter getRecruiter(){
        return null;
    }
    public String[] getListRecruiter(){
        return listRecruiter;
    }
}
