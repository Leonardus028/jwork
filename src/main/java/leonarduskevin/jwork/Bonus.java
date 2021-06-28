package leonarduskevin.jwork;
/**
 * Class yang digunakan untuk menyimpan semua infromasi terkait object Bonus
 * @author Leonardus Kevin
 * @version 27.06.2021
*/
public class Bonus {
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;
    /**
     * Constructor untuk object dalam class Bonus
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active) {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }
    /**
     * Method untuk mengambil ID dari Bonus
     */
    public int getId() {
        return id;
    }
    /**
     * Method untuk mengambil referral code dari bonus
     */
    public String getReferralCode() {
        return referralCode;
    }
    /**
     * Method untuk mengambil Extra Fee
     */
    public int getExtraFee() {
        return extraFee;
    }
    /**
     * Method untuk mengambil Fee minimum dari sebuah job
     */
    public int getMinTotalFee() {
        return minTotalFee;
    }
    /**
     * Method untuk mengambil informasi mengenai status Bonus
     */
    public boolean getActive() {
        return active;
    }
    /**
     * Method untuk memberi nilai ID Bonus
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Method untuk memberi nilai Referral Code Bonus
     */
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }
    /**
     * Method untuk memberi nilai Extra Fee
     */
    public void setExtraFee(int extraFee) {
        this.extraFee = extraFee;
    }
    /**
     * Method untuk memberi nilai minimum fee untuk menggunakan Bonus
     */
    public void setMinTotalFee(int minTotalFee) {
        this.minTotalFee = minTotalFee;
    }
    /**
     * Method untuk memberi nilai untuk status Bonus
     */
    public void setActive(boolean active) {
        this.active = active;
    }
    /**
     * Method untuk melakukan print semua informasi terkait Bonus
     */
    @Override
    public String toString() {
        return "Id = " + getId() + "\nReferral Code = " + getReferralCode() + "\nExtra Fee = " + getExtraFee()
                + "\nMin Total Fee= " + getMinTotalFee() + "\nActive Status =  " + getActive();
    }

}

