package leonarduskevin.jwork;
public class BonusNotFoundException extends Exception{
    public int bonus_error;

    public BonusNotFoundException(int bonus_input){
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }

    public String getMessage(){
        return super.getMessage() + bonus_error + " not found";
    }

}