package AirportAuto;

public class Airport
{
    private String airportCode;
    private int gates;
    private static int countAirports;
    public Airport()
    {
        airportCode = "";
        countAirports++;
    }
    public Airport (String startAirportCode, int startGates)
    {
        airportCode = startAirportCode;
        setGates(startGates);
        countAirports++;
    }
    public String getAirportCode()
    {
        return airportCode;
    }
    public int getGates()
    {
        return gates;
    }
    public int getCountAirports ()
    {
        return countAirports;
    }
    public void setAirportCode (String newAirportCode)
    {
        airportCode = newAirportCode;
    }
    public void setGates (int newGates)
    {
        if (newGates >= 0)
        {
            gates = newGates;
        }
        else
        {
            System.err.println("Gates must be at least 0.");
            System.err.println("Value of Gates Unchanged.");
        }
    }
    public String toString ()
    {
        return "The airport code is "+airportCode+". There are "+gates+" gates.";
    }
    public boolean equals (Object object1)
    {
        if (object1 instanceof Airport)
        {
            Airport airport2 = (Airport) object1;
            return (toString().equals(airport2.toString()));
        }
        else
        {
            System.err.println("Object must be of Airport type.\n");
            return false;
        }
    }
}