//Bradley Bolton, 3-21-2019
//This class describes the weather forecast for a given day

package weather;

public class weatherForecast
{
    private String conditions;
    private int temperature;
    public weatherForecast(String cond, int temp)
    {
        if (checkTemperature(temp) && checkCondition(cond))
        {
            conditions = cond;
            temperature = temp;
        }
        else
        {
            conditions = "sunny";
            temperature = 70;
            System.err.println("Error- Invalid arguments passed to constructor. Object created with default field values.");
        }
    }
    public weatherForecast()
    {
        conditions = "sunny";
        temperature = 70;
    }
    public String getConditions()
    {
        return conditions;
    }
    public int getTemperature()
    {
        return temperature;
    }
    private boolean checkCondition(String cond)
    {
        if ((temperature > 100 || cond.equals("sunny")) || (temperature < 33 || cond.equals("snowy")))
        {
            return false;
        }
        return cond.equals("sunny") || cond.equals("cloudy") || cond.equals("snowy") || cond.equals("rainy");
    }
    private boolean checkTemperature(int temp)
    {
        if ((!(conditions.equals("sunny")) && temp > 100) || (!(conditions.equals("snowy")) && temp < 33))
        {
            return false;
        }
        else
        {
            return (temp > -51 && temp < 151);
        }
    }
    public void setCondition(String cond)
    {
        if(checkCondition(cond))
        {
            conditions = cond;
        }
        else
        {
            System.err.println("Invalid conditions submitted, conditions unchanged. It is currently "+conditions+".");
        }
    }
    public void setTemperature(int temp)
    {
        if (checkTemperature(temp))
        {
            temperature = temp;
        }
        else
        {
            System.err.println("Invalid temperature submitted, temperature unchanged. It is currently "+temperature+" degrees fahrenheit.");
        }
    }
    public String toString()
    {
        return "The conditions are "+conditions+". The temperature is "+temperature+" degrees fahrenheit.";
    }
    public boolean equals(Object object)
    {
        if (object instanceof weatherForecast)
        {
            weatherForecast forecast2 = (weatherForecast) object;
            return (toString().equals(forecast2.toString()));
        }
        else
        {
            System.err.println("Object must be of weatherForecast class.\n");
            return false;
        }
    }
    public double toCelsius(double tempF)
    {
        double tempC = (tempF - 32) * 5 / 9;
        return (double)Math.round(tempC * 100) / 100;
    }
}
