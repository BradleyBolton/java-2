package Test78;

public class Horse
{
    private String name;
    public Horse(String newName)
    {
        name = newName;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return "This horse is named "+name+".";
    }
    public boolean equals(Object object)
    {
        if (object instanceof Horse)
        {
            Horse horse2 = (Horse) object;
            return (toString().equals(horse2.toString()));
        }
        else
        {
            System.err.println("Object must be of horse class.\n");
            return false;
        }
    }
}
