package inheritancePractice;

public class Secretary extends Employee
{
    public Secretary (int years)
    {
        super(years);
    }
    public int getSeniorityBonus()
    {
        return 0;
    }
    public void takeDiction(String text)
    {
        System.out.println("Taking diction of text: " + text);
    }
}
