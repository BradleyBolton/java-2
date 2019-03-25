package Television;

//Bradley Bolton, 3-19-2019
//Object Class for Television Channels

public class TelevisionChannel
{
    private String name;
    private int number;
    private boolean cable;
    public TelevisionChannel(String Name, int Number, boolean Cable)
    {
        name = Name;
        number = Number;
        cable = Cable;
    }
    public TelevisionChannel ()
    {
        String name = "";
        int number = 0;
        boolean cable = false;
    }
    public int getNumber()
    {
        return number;
    }
    public String getName()
    {
        return name;
    }
    public boolean getCable()
    {
        return cable;
    }
    public void setNumber(int newNumber)
    {
        number = newNumber;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public void setCable(boolean newCable)
    {
        cable = newCable;
    }
    public String toString()
    {
        return "The channel name is "+name+". It is number "+number+". It has a cable value of "+cable+".";
    }
    public boolean equals(Object object)
    {
        if (object instanceof TelevisionChannel)
        {
            TelevisionChannel Channel2 = (TelevisionChannel) object;
            return (toString().equals(Channel2.toString()));
        }
        else
        {
            System.err.println("Object must be of Airport type.\n");
            return false;
        }
    }
}
