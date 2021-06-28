package leonarduskevin.jwork;
import java.util.ArrayList;

/**
 * Class untuk menyimpan semua object Bonus yang ada dalam ArrayList Bonus
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class DatabaseBonus {
    public static ArrayList<Bonus> BONUS_DATABASE= new ArrayList<Bonus>();
    public static int lastId = 0;
    private static String[] listBonus;
    /**
     * Method untuk mengambil semua Bonus dari Database
     */
    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }
    /**
     * Method untuk mengambil Bonus berdasarkan ID terakhir
     */
    public static int getLastId(){
        return lastId;
    }
    /**
     * Method untuk mengambil Bonus berdasarkan ID
     */
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
    /**
     * Method untuk mengambil Bonus berdasarkan Referral Code
     */
    public static Bonus getBonusByReferralCode(String referralCode){
       Bonus bonus = null;
       for(int i = 0; i < BONUS_DATABASE.size(); i++){
           if (referralCode.equals(BONUS_DATABASE.get(i).getReferralCode())){
               bonus = BONUS_DATABASE.get(i);
           }
       }
       return bonus;
    }
    /**
     * Method untuk menambahkan Bonus ke dalam Database
     */
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
    /**
     * Method untuk menghapus Bonus dari database
     */
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
