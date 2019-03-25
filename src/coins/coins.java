//Bradley Bolton, 3-21-2019
//This class describes a collection of coins

package coins;

public class coins
{
    private int quarters;
    private int dimes;
    private int nickles;
    private int pennies;
    public coins(int quar, int dim, int nick, int pen)
    {
        quarters = quar;
        dimes = dim;
        nickles = nick;
        pennies = pen;
    }
    public coins()
    {
        quarters = 0;
        dimes = 0;
        nickles = 0;
        pennies = 0;
    }
    public int getQuarters()
    {
        return quarters;
    }
    public int getDimes()
    {
        return dimes;
    }
    public int getNickles()
    {
        return nickles;
    }
    public int getPennies()
    {
        return pennies;
    }
    public void setQuarters(int quar)
    {
        quarters = quar;
    }
    public void setDimes(int dim)
    {
        dimes = dim;
    }
    public void setNickles(int nick)
    {
        nickles = nick;
    }
    public void setPennies(int pen)
    {
        pennies = pen;
    }
    public String toString()
    {
        return "There are "+quarters+" quarters, "+dimes+" dimes, "+nickles+" nickles, and "+pennies+" pennies.";
    }
    public boolean equals(Object object)
    {
        if (object instanceof coins)
        {
            coins coins2 = (coins) object;
            return (toString().equals(coins2.toString()));
        }
        else
        {
            System.err.println("Object must be of coins class.\n");
            return false;
        }
    }
    public double getTotal()
    {
        double quartersF = (double) quarters;
        double dimesF = (double) dimes;
        double nicklesF = (double) nickles;
        double penniesF = (double) pennies;
        double total = (quartersF*.25)+(dimesF*.1)+(nicklesF*.05)+(penniesF*.01);
        return (double)Math.round(total * 100) / 100;
    }
    public String getSums()
    {
        double quartersF = (double) quarters;
        double dimesF = (double) dimes;
        double nicklesF = (double) nickles;
        double penniesF = (double) pennies;
        return "The value of the quarters is "+quartersF*.25+". The value of the dimes is "+dimesF*.10+". The value of the nickles is "+(Math.round(nicklesF*.05*100)/100)+". The value of the pennies is "+penniesF*.01+".";
    }
}
