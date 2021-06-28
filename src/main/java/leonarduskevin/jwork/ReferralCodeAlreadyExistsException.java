package leonarduskevin.jwork;
/**
 * Class untuk mengatur Error Handling dari Referral Code
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class ReferralCodeAlreadyExistsException extends Exception {
    public Bonus referral_error;
    /**
     * Constructor untuk Error Handling Referral Code
     */
    public ReferralCodeAlreadyExistsException(Bonus referral_input) {
        super("Referral Code: ");
        referral_error = referral_input;
    }
    /**
     * Method untuk melakukan print hasil dari Error Handling
     */
    public String getMessage() {
        return super.getMessage() + referral_error.getReferralCode()+ " already exists.";
    }

}