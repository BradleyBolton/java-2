package inheritancePractice;

public class Lawyer extends Employee
{
    public Lawyer(int years)
    {
        super(years);
    }
    public int getVacationDays()
    {
        return 5 + super.getVacationDays();
    }
    public String getVacationForm()
    {
        return "pink";
    }
    public void sue(String victim)
    {
        System.out.println("Suing " + victim);
    }
}
