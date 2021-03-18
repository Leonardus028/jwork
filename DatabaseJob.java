
/**
 * Write a description of class DatabaseJob here.
 *
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
    public boolean remove(Job job){
        return false;
    }
    public Job getJob(){
        return null;
    }
    public String[] getListJob(){
        return listJob;
    }
}
