package animals;

public class Mammals implements Animal
{
    private int yearDiscovered = 0;
    private String name;

    public Mammals(String name)
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