package inheritancePractice;

public class employeeClient
{
    public static void main(String [] args)
    {
        Employee ed = new Lawyer(5);
        System.out.println(ed.getSalary());
        System.out.println(ed.getVacationForm());
        System.out.println(ed.getVacationDays());
    }
}
