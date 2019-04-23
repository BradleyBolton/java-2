package inheritancePractice;

public class legalSecretary extends Secretary
{
    public legalSecretary (int years)
    {
        super(years);
    }
    public double getSalary()
    {
        return 5000 + super.getSalary();
    }
    public void prepareLegalDocuments()
    {
        System.out.println("Legal documents prepared.");
    }
}
