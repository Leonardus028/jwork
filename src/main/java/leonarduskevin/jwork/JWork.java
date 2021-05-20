package leonarduskevin.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

/**
 * Write a description of class JWork here.
 *
 * @Leonardus Kevin
 * @version 25.03.2021
 */

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {

        Location location1 = new Location("Jawa Barat", "Sukabumi", "Tempat Lahir");
        Location location2 = new Location("Jawa Timur", "Yogyakarta", "Daerah Istimewa");
        Location location3 = new Location("Jawa Barat", "Depok", "Kampus Tercinta");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Leonardus",
                "leonardus.kevin@ui.ac.id", "081384265050", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Hansaka",
                "hansaka.wijaya@ui.ac.id", "08801010101", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Kevin",
                "kevin.leonardus@ui.ac.id", "083818002946", location3));
        try {
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Frontend Engineer", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "UI Engineer Tokopedia", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.UI));
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "UI Engineer Shoope", DatabaseRecruiter.getRecruiterById(3), 10000, JobCategory.UI));
        }
        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }
        SpringApplication.run(JWork.class, args);
    }

}
