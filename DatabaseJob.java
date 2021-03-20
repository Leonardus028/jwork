
/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan 
 * database pekerkaan, yang berisi list job
 * @author Leonardus Kevin
 * @version 18-3-2021
 */
public class DatabaseJob
{
    private String[] listJob;
    public DatabaseJob(){
       listJob = new String[100];
    }
    public DatabaseJob(String[] listJob){
        this.listJob = listJob;
    }
    public boolean addJob(Job job){
        return false;
    }
    public boolean removeJob(Job job){
        return false;
    }
    public Job getJob(){
        return null;
    }
    public String[] getListJob(){
        return listJob;
    }
}
