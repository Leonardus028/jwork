package leonarduskevin.jwork;

/**
 * Class untuk mengatur Error Handling dari bonus
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class BonusNotFoundException extends Exception{
    public int bonus_error;

    /**
     * Constructor untuk Error Handling Bonus
     */
    public BonusNotFoundException(int bonus_input){
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }
    /**
     * Method untuk melakukan print hasil dari Error Handling
     */
    public String getMessage(){
        return super.getMessage() + bonus_error + " not found";
    }

}
