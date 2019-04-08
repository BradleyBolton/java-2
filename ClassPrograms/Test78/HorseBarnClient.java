package Test78;

public class HorseBarnClient
{
    public static void main(String [] args)
    {
       Horse [] horses;
       horses = new Horse[4];
       horses[0] = new Horse("Horse 1");
       horses[1] = new Horse("Horse 2");
       HorseBarn [] barns;
       barns = new HorseBarn[3];
       barns[0] = new HorseBarn(horses);
       horses[2] = new Horse("Horse 3");
       barns[1] = new HorseBarn(horses);
       horses[3] = new Horse("Horse 4");
       barns[2] = new HorseBarn(horses);
       int mostHorses = 0;
       for (int i = 0; i < barns.length; i++)
       {
           if (barns[i].getHorseCount() > barns[mostHorses].getHorseCount())
           {
               mostHorses = i;
           }
       }
       System.out.println("Barn number "+mostHorses+" has the most horses. It has "+barns[mostHorses].getHorseCount()+" horses.");
    }
}
