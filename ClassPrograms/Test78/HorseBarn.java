package Test78;

public class HorseBarn
{
    private Horse [] spaces;
    public HorseBarn(Horse [] input)
    {
        boolean validHorse = true;
        spaces = new Horse[input.length];
        for (int i = 0; i < input.length; i++)
        {
            for (int n = i; n >= 0; n--)
            {
                if (input[i].getName().equals(spaces[n].getName()));
                {
                    validHorse = false;
                }
            }
            if (validHorse)
            {
                spaces[i] = input[i];
            }
            validHorse = true;
        }
    }
    public void setSpace(int space, Horse newHorse)
    {
        boolean validHorse = true;
        for (int i = 0; i < spaces.length; i++)
        {
            if (newHorse.equals(spaces[i]));
            {
                validHorse = false;
            }
        }
        if (validHorse)
        {
            spaces[space] = newHorse;
        }
    }
    public Horse getHorse(int space)
    {
        return spaces[space];
    }
    public int findHorseSpace(Horse horse)
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
    public int findHorseSpace(String name)
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
            output += "Space "+i+" has a horse named "+spaces[i].getName()+".\n";
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
            System.err.println("Object must be of horse class.\n");
            return false;
        }
    }
    public int getHorseCount()
    {
        int count = 0;
        for (int i = 0; i < spaces.length; i++)
        {
            if (spaces[i] != null)
            {
                count += 1;
            }
        }
        return count;
    }
}
