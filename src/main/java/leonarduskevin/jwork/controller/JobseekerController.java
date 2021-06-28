package leonarduskevin.jwork.controller;

import leonarduskevin.jwork.*;
import leonarduskevin.jwork.postgre.DatabaseJobseekerPostgre;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class untuk mengatur Request Method Jobseeker
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
@RequestMapping("/jobseeker")
@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController
public class JobseekerController {

    /**
     * Method untuk mengambil semua Jobseeker pada database Postgre
     */
    @RequestMapping("")
    public ArrayList<Jobseeker> getAllJobseeker() {
        return DatabaseJobseekerPostgre.getJobseekerDatabase();
    }

    /**
     * Method untuk mengambil Jobseeker berdasarkan ID
     */
    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        return DatabaseJobseekerPostgre.getJobseekerById(id);
    }

    /**
     * Method untuk menambahkan Jobseeker ke dalam
     * database
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value = "name") String name,
                                       @RequestParam(value = "email") String email,
                                       @RequestParam(value = "password") String password) {
        String regexEmail = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(email);

        String regexPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern patternPassword = Pattern.compile(regexPassword);
        Matcher matcherPassword = patternPassword.matcher(password);

        if (matcherEmail.matches() && matcherPassword.matches()) {
            Jobseeker jobseeker = new Jobseeker(DatabaseJobseekerPostgre.getLastId() + 1, name, email, password);
            return DatabaseJobseekerPostgre.insertJobseeker(jobseeker);
        }
        return null;
    }

    /**
     * Method untuk login sebagai Jobseeker
     * database
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value = "email") String email,
                                    @RequestParam(value = "password") String password) {
        return (DatabaseJobseekerPostgre.getJobseekerLogin(email, password));
    }
}

