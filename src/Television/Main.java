package Television;

public class Main
{
    public static void main(String args[])
    {
        TelevisionChannel one = new TelevisionChannel("ABC", 3, true);
        TelevisionChannel two = new TelevisionChannel("AMC", 16, false);
        System.out.println(one.toString());
        System.out.println(two.toString());
    }

}
