package Test78;

/* Bradley Bolton
 * Horse Barn Object Class
 * Runs on Java SDK 1.8.0_201
 */

public class HorseBarn
{
    private Horse [] spaces;
    public HorseBarn(Horse [] input)
    {
        boolean validHorse = true;
        spaces = new Horse[input.length];
        for (int i = 0; i < input.length; i++) //copies input array to spaces
        {
            for (int n = i; n >= 0; n--) //checks for duplicate horses
            {
                if (input[i] != null)
                {
                    if (input[i].equals(spaces[n])) {
                        validHorse = false;
                    }
                }
            }
            if (validHorse)
            {
                spaces[i] = input[i];
            }
        }
    }
    public void setSpace(int space, Horse newHorse) //puts the horse object parameter at the location given by space
    {
        boolean validHorse = true;
        for (int i = 0; i < spaces.length; i++) //checks for duplicate horses
        {
            if (newHorse.equals(spaces[i]));
            {
                validHorse = false;
            }
        }
        if (validHorse)
        {
            spaces[space] = newHorse; //places the input horse at specified location
        }
    }
    public Horse getHorse(int space) //returns the horse at a location
    {
        return spaces[space];
    }
    public int findHorseSpace(Horse horse) //returns the location of the parameter horse
    {
        for (int i = 0; i < spaces.length; i++)
        {
            if (horse.equals(spaces[i]));
            {
                return i;
            }
        }
        return -1;
    }
    //Answer to question 1: spaces[index].getName();
    //Answer to question 2: str.equals(anotherString);
    public int findHorseSpace(String name) //returns the location of a horse with given name
    {
        for (int i = 0; i < spaces.length; i++)
        {
            if (name.equals(spaces[i].getName()));
            {
                return i;
            }
        }
        return -1;
    }
    public String toString()
    {
        String output = "";
        for (int i = 0; i < spaces.length; i++)
        {
            if (spaces[i] != null)
            {
                output += "Space " + i + " has a horse named " + spaces[i].getName() + ".\n";
            }
            else
            {
                output += "Space "+i+" is empty.\n";
            }
        }
        return output;
    }
    public boolean equals(Object object)
    {
        if (object instanceof HorseBarn)
        {
            HorseBarn horsebarn2 = (HorseBarn) object;
            return (toString().equals(horsebarn2.toString()));
        }
        else
        {
            System.err.println("Object must be of horse barn class.\n");
            return false;
        }
    }
    public int getHorseCount() //returns the number of horses in the barn
    {
        int count = 0;
        for (int i = 0; i < spaces.length; i++)
        {
            if (spaces[i] != null) //checks if the space in the barn is occupied
            {
                count += 1;
            }
        }
        return count;
    }
}
