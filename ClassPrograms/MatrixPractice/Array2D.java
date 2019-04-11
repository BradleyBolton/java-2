package MatrixPractice;

public class Array2D
{
    public static void main(String[] args)
    {
        int firstarray[][] = {{8,9,10,11}, {12, 13, 14, 15}};
        int secondarray[][] = {{30,31,32,33}, {43}, {4,5,6}};
        display(firstarray);
        display(secondarray);
    }
    public static void display(int x[][])
    {
        for (int row = 0; row < x.length; row++)
        {
            for (int collumn=0; collumn < x[row].length; collumn++)
            {
                System.out.print(x[row][collumn]+"\t");
            }
            System.out.println();
        }
    }
}
