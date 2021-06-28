package leonarduskevin.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

/**Class yang berisi fungsi Main dari project ini
 * @Leonardus Kevin
 * @version 27.06.2021
 */

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {

        Location location1 = new Location("Jawa Barat", "Sukabumi", "Tempat Lahir");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Leonardus",
                "leonardus.kevin@ui.ac.id", "081384265050", location1));

        try {
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Frontend Engineer", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.FrontEnd));

        }

        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }



        SpringApplication.run(JWork.class, args);
    }

}
