package leonarduskevin.jwork.controller;

import leonarduskevin.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static leonarduskevin.jwork.DatabaseJobseeker.jobseekerLogin;

@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Jobseeker> getAllJob(){
        return DatabaseJobseeker.getDatabaseJobseeker();}

    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseeker.getJobseekerById(id);
        } catch (JobSeekerNotFoundException e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password)
    {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseeker.getLastId()+1, name, email, password);
        try {
            DatabaseJobseeker.addJobseeker(jobseeker);
        } catch (EmailAlreadyExistsException e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password){
        return(DatabaseJobseeker.jobseekerLogin(email, password));
    }


}
