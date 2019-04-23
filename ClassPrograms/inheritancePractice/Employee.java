package inheritancePractice;

public class Employee
{
    private int Years;
    public Employee(int years)
    {
        Years = years;
    }
    public int getYears()
    {
        return Years;
    }
    public void setYears(int years)
    {
        Years = years;
    }
    public int getHours()
    {
        return 40;
    }
    public double getSalary()
    {
        return 50000;
    }
    public int getVacationDays()
    {
        return 10 + getSeniorityBonus();
    }
    public String getVacationForm()
    {
        return "yellow";
    }
    public int getSeniorityBonus()
    {
        return 2 * Years;
    }
}
