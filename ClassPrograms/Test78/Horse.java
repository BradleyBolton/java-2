package Test78;

/* Bradley Bolton
 * Horse Object Class
 * Runs on Java SDK 1.8.0_201
 */

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
            return false;
        }
    }
}
