package leonarduskevin.jwork.controller;

import leonarduskevin.jwork.DatabaseRecruiter;
import leonarduskevin.jwork.Location;
import leonarduskevin.jwork.Recruiter;
import leonarduskevin.jwork.RecruiterNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static leonarduskevin.jwork.DatabaseRecruiter.getRecruiterDatabase;
/**
 * Class untuk mengatur Request Method Recruiter
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
@RequestMapping("/recruiter")
@RestController
public class RecruiterController {
    /**
     * Method untuk mengambil semua Recruiter dalam database
     */
    @RequestMapping("")
    public ArrayList<Recruiter> getAllRecruiter() {
        return getRecruiterDatabase();
    }
    /**
     * Method untuk mengambil Recrutier berdasarkan ID
     */
    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }

        return recruiter;
    }
    /**
     * Method untuk menambahkan Recruiter ke dalam
     * database
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="phoneNumber") String phoneNumber,
                                  @RequestParam(value="province") String province,
                                  @RequestParam(value="description") String description,
                                  @RequestParam(value="city") String city)
    {
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, new Location(province, city, description));

        try{
            DatabaseRecruiter.addRecruiter(recruiter);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return recruiter;
    }
}