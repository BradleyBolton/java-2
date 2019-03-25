package AirportAuto;

public class auto
{
    private String model;
    private int milesDriven;
    private double gallonsOfGas;
    public auto()
    {
        model = "unknown";
    }
    public auto(String name, double gallons)
    {
        model = name;
        SetGallons(gallons);
    }
    public auto(String name, int miles, double gallons)
    {
        model = name;
        SetMiles(miles);
        SetGallons(gallons);
    }
    public auto SetGallons(double gallons)
    {
        if (gallons < 0)
        {
            System.out.println("Gallons cannot be negative.");
            gallonsOfGas = 0;
            return this;
        }
        else
        {
            this.gallonsOfGas = gallons;
            return this;
        }
    }
    public auto SetMiles(int miles)
    {
        if (miles < 0)
        {
            milesDriven = 0;
        }
        else
        {
            this.milesDriven = miles;
        }
        return this;
    }
    public String GetModel()
    {
        return model;
    }
    public int GetMiles()
    {
        return milesDriven;
    }
    public double GetGallons()
    {
        return gallonsOfGas;
    }
    public String toString()
    {
        return("The model of the car is "+model+". It has driven "+milesDriven+" miles. It has "+gallonsOfGas+" gallons of gas.");
    }
}