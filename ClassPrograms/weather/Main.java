package weather;

public class Main
{
    public static void main (String args[])
    {
        weatherForecast Friday = new weatherForecast("sunny", 105);
        weatherForecast Saturday = new weatherForecast("cloudy", 73);
        weatherForecast Sunday = new weatherForecast("snowy", 28);
        weatherForecast Monday = new weatherForecast("rainy", 64);
        System.out.println("For Friday, "+Friday.toString());
        System.out.println("For Saturday "+Saturday.toString());
        System.out.println("For Sunday "+Sunday.toString());
        System.out.println("For Monday "+Monday.toString());
    }
}
