package inheritancePractice;

public class employeeClient
{
    public static void main(String [] args)
    {
        Employee [] employees = {new Lawyer(10), new Secretary(3), new legalSecretary(5)};
        for (int i = 0; i < employees.length; i++)
        {
            printInfo(employees[i]);
        }
    }
    public static void printInfo(Employee employee)
    {
        System.out.println("Salary- "+employee.getSalary());
        System.out.println("v.days- "+employee.getVacationDays());
        System.out.println("v.form- "+employee.getVacationForm());
        System.out.println();
    }
}
