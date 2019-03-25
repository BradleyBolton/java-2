package coins;

public class Main
{
    public static void main(String args[])
    {
        coins change1 = new coins (5, 4, 6, 11);
        coins change2 = new coins (5, 2,3, 8);
        System.out.println("In change1, "+change1.toString());
        System.out.println("It has a total value of "+change1.getTotal());
        System.out.println(change1.getSums());
        System.out.println("In change2, "+change2.toString());
        System.out.println("It has a total value of "+change2.getTotal());
        System.out.println(change2.getSums());

        if (change1.equals(change2))
        {
            System.out.println("Both change collections are the same");
        }
        else
        {
            System.out.println("The change collections are different");
        }
    }
}
