package animals;

public class Birds implements Animal
{
    private int yearDiscovered = 0;
    private String name;

    public Birds(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName()
    {
        this.name = name;
    }
}