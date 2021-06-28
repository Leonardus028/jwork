package leonarduskevin.jwork;
/**
 * Merupakan Enum Class yang berfungsi untuk membatasi kategori 
 * status invoice yang ada
 * @Leonardus Kevin
 * @27.06.2021
 */
public enum InvoiceStatus
{
    OnGoing, Finished, Cancelled;
    public String toString() {
        switch(this) {
            case OnGoing:
                return "Ongoing";
            case Finished:
                return "Finished";
            case Cancelled:
                return "Cancelled";
            default:
                return null;
            }
        }
}
