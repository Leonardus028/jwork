package leonarduskevin.jwork.controller;


import leonarduskevin.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
/**
 * Class untuk mengatur Request Method Job
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
@RequestMapping("/job")
@RestController
public class JobController {

    /**
     * Method untuk mengambil semua Job dalam database
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Job> getAllJob(){
        return DatabaseJob.getJobDatabase();
    }
    /**
     * Method untuk mengambil Job berdasarkan ID
     */
    @RequestMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        Job job = null;
        try {
            job = DatabaseJob.getJobById(id);
        } catch (JobNotFoundException e) {
            e.getMessage();
            return null;
        }
        return job;
    }
    /**
     * Method untuk  mengambil Job berdasarkan Recruiter
     */
    @RequestMapping("/recruiter/{recruiterId}")
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByRecruiter(recruiterId);

        return job;
    }
    /**
     * Method untuk mengambil Job berdasarkan Category
     */
    @RequestMapping("/category/{category}")
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByCategory(category);
        return job;
    }
    /**
     * Method untuk menambahkan Job ke dalam database
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value="name") String name,
                      @RequestParam(value="fee") int fee,
                      @RequestParam(value="category") String category,
                      @RequestParam(value="recruiterId") int recruiterId)
    {
        Job job = null;
        try {
            job = new Job(DatabaseJob.getLastId()+1, name, DatabaseRecruiter.getRecruiterById(recruiterId), fee, JobCategory.valueOf(category));
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
        }
        boolean status = DatabaseJob.addJob(job);
        if(status == true){
            return job  ;
        } else {
            return null;
        }
    }

}
