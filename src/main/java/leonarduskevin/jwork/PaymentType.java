package leonarduskevin.jwork;
/**
 * Merupakan Enum Class yang berfungsi untuk membatasi kategori 
 * pembayaran yang ada
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public enum PaymentType
{
    BankPayment, EwalletPayment;
    public String toString() {
        switch(this) {
            case BankPayment:
                return "Bank Payment";
            case EwalletPayment:
                return "E-Wallet payment";
            default:
                return null;
            }
        }
}
