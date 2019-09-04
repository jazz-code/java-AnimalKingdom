package animals;

public class Fish implements Animal
{
    private int yearDiscovered = 0;
    private String name;

    public Fish(String name)
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