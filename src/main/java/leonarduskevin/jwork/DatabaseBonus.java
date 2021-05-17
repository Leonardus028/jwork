package leonarduskevin.jwork;
import java.util.ArrayList;

/**
 * Class Location berfungsi untuk menangani objek yang berkaitan dengan 
 * database pekerkaan, yang berisi list bonus
 *
 * @Leonardus Kevin
 * @4.1.2021
 */
public class DatabaseBonus {
    public static ArrayList<Bonus> BONUS_DATABASE= new ArrayList<Bonus>();
    public static int lastId = 0;
    private static String[] listBonus;

    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException {
        Bonus temp = null;
        try {
            for (Bonus bonus : BONUS_DATABASE) {
                if (id == bonus.getId()) {
                    temp = bonus;
                    return temp;
                }
            }
        }
        catch (Exception e){
            throw new BonusNotFoundException(id);
        }
        throw new BonusNotFoundException(id);
    }

    public static Bonus getBonusByReferralCode(String referralCode){
        for(int i = 0; i < BONUS_DATABASE.size()-1; i++){
            if(BONUS_DATABASE.get(i).getReferralCode() == referralCode){
                return BONUS_DATABASE.get(i);
            }else{
                return null;
            }
        }
        return null;
    }

    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        try {
            for (Bonus b : BONUS_DATABASE) {
                if (bonus.getReferralCode() == b.getReferralCode()) {
                    throw new ReferralCodeAlreadyExistsException(bonus);
                }
            }
            BONUS_DATABASE.add(bonus);
            lastId = bonus.getId();

        } catch (Exception e) {
            throw new ReferralCodeAlreadyExistsException(bonus);
        }

        return true;
    }

    public static boolean activeBonus(int id) {
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                x = true;
            }
        }
        return x;
    }

    public static boolean deactivateBonus(int id){
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                x = true;
            }
        }
        return x;
    }

    public static boolean removeBonus(int id) throws BonusNotFoundException{
        try{
            for (Bonus bonus : BONUS_DATABASE) {
                if (bonus.getId() == id) {
                    BONUS_DATABASE.remove(bonus);
                    return true;
                }
            }
        }
        catch (Exception exception){
            throw new BonusNotFoundException(id);
        }
        throw new BonusNotFoundException(id);
    }
}
