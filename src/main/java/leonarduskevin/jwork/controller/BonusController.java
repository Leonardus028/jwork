package leonarduskevin.jwork.controller;

import leonarduskevin.jwork.Bonus;
import leonarduskevin.jwork.DatabaseBonus;
import leonarduskevin.jwork.ReferralCodeAlreadyExistsException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Class untuk mengatur Request Method bonus
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
@RequestMapping("/bonus")
@RestController
public class BonusController {
    /**
     * Method untuk mengambil semua bonus dari database
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Bonus> getAllBonus() {
        return (DatabaseBonus.getBonusDatabase());
    }
    /**
     * Method untuk mengambil bonus menggunakan referral code
     */
    @RequestMapping(value = "/{referralCode}", method = RequestMethod.GET)
    public Bonus getBonusByReferralCode(@PathVariable String referralCode){
        return DatabaseBonus.getBonusByReferralCode(referralCode);
    }
    /**
     * Method untuk menambahkan invoice baru menggunakan E-wallet payment
     * ke dalam database
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(
            @RequestParam(value="referralCode") String referralCode,
            @RequestParam(value="extraFee") int extraFee,
            @RequestParam(value="minTotalFee") int minTotalFee,
            @RequestParam(value="active") boolean active

    ) throws ReferralCodeAlreadyExistsException {
        Bonus bonus = new Bonus(DatabaseBonus.getLastId() + 1, referralCode, extraFee, minTotalFee, active);
        try{
            DatabaseBonus.addBonus(bonus);
        }
        catch(ReferralCodeAlreadyExistsException e){
            e.getMessage();
            return null;
        }
        return bonus;
    }
}
