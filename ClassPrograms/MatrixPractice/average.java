package MatrixPractice;

import java.util.*;

public class average
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to average?");
        int length = scan.nextInt();
        int [] numbers;
        numbers = new int[length];
        for (int i = 0; i < length; i++)
        {
            System.out.println("Input number");
            numbers[i] = scan.nextInt();
        }
        System.out.println(average(numbers));
    }
    public static double average(int [] numbers)
    {
        int total = 0;
        for (int x:numbers)
        {
            total+=x;
        }
        return total/numbers.length;
    }
}
