package leonarduskevin.jwork;
/**
 * Class yang digunakan untuk menghitung Invoice ID
 * @Leonardus Kevin
 * @27.06.2021
 */
public class FeeCalculator implements Runnable{
    private Invoice invoice;

    public FeeCalculator (Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void run(){
        System.out.println("calculating invoice id: " + invoice.getId());
        invoice.setTotalFee();
        System.out.println("finished calculating invoice id: " + invoice.getId());
    }
}