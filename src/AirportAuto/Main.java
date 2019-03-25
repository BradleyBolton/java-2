package AirportAuto;

public class Main
{
    //Main for Auto
    public static void main(String args[])
    {
        auto car1 = new auto("Ford", 9, 7.8);
        auto car2 = new auto ("Chevy", this.miles, this.gallons);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }

    //Main for Airport
    /*public static void main(String args[])
    {
        Airport airport1 = new Airport("DFW", 8);
        auto car1 = new auto("Ford", 11, 6);
        System.out.println(airport1.toString());
        Airport airport2 = new Airport("DFW", 8);
        System.out.println(airport2.toString());
        if (airport1.equals(car1))
        {
            System.out.println ("Airports and cars are the same.");
        }
        else
        {
            System.out.println ("Airports and cars are different.");
        }
    }*/
}
