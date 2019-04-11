package MatrixPractice;

public class Array3D
{
    public static void main(String[] args)
    {
        int array[][][] = {{{8,9,10,11}, {12, 13, 14, 15}},{{30,31,32,33}, {43}, {4,5,6}}};
        display(array);
    }
    public static void display(int x[][][])
    {
        for (int row = 0; row < x.length; row++)
        {
            for (int collumn=0; collumn < x[row].length; collumn++)
            {
                for (int depth = 0; depth < x[row][collumn].length; depth++)
                {
                    System.out.print(x[row][collumn][depth]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
