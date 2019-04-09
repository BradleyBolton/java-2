package Test78;

/* Bradley Bolton
 * Horse Barn Client Program
 * Runs on Java SDK 1.8.0_201
 */

public class HorseBarnClient
{
    public static void main(String [] args)
    {
       Horse [] horses;
       horses = new Horse[4];
       HorseBarn [] barns;
       barns = new HorseBarn[4];
       for (int i = 0; i < 3; i++) //fills barns with incrementing amount of horses
       {
           horses[i] = new Horse("Horse " + i);
           barns[i] = new HorseBarn(horses);
       }
       int mostHorses = 0;
       for (int i = 0; i < barns.length; i++) //finds the barn with the most horses
       {
           if (barns[i] != null) //checks that a barn exists at index i
           {
               if (barns[i].getHorseCount() > barns[mostHorses].getHorseCount())
               {
                   mostHorses = i; //records which barn has the most horses
               }
           }
       }
       System.out.println("Barn "+mostHorses+" has the most horses. It has "+barns[mostHorses].getHorseCount()+" horses.");
    }
}
