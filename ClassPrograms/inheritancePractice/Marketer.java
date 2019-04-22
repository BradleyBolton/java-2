package inheritancePractice;

public class Marketer extends Employee
{
    public double getSalary()
    {
        return 10000 + super.getSalary();
    }
    public void advertise(String product)
    {
        System.out.println("Come buy " + product + "!");
    }
}
