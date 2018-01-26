import java.util.ArrayList;
/**
 * a CoinPurse holds a collection of Coin objects.
 */
public class CoinPurse
{
    ArrayList<Coin> purse;

    /**
     * Constructor for objects of class CoinPurse
     */
    public CoinPurse()
    {
        purse = new ArrayList<>();
    }

    /**
     *adds Coin c to the CoinPurse 
     */
    public void addCoin(Coin c)
    {
        purse.add(c);
    }
    
    /**
     *removes Coin c from the CoinPurse 
     */
    public void removeCoin(Coin c)
    {
        purse.remove(c);
    }
    
    /**
     *counts the number of coins in the CoinPurse 
     */
    public int count()
    {
        return purse.size();
    }
    
    /**
     *returns the total values of all coins in the CoinPurse
     */
    public double total() 
    {
        double fTotal = 0.0;

        for (int i = 0; i < this.purse.size(); i++)
            fTotal += this.purse.get(i).getValue();

        return fTotal / 100.0;
    }

    /**
     *Prints the vName of each Coin stored in the CoinPurse 
     */
    public String toString()
    {
        //implementation needed
    }
}