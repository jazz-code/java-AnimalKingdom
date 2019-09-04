package animals;

public class Birds extends AbstractAnimal
{
    private int yearDiscovered; 
    private String name;

    public Birds(String name, int yearDiscovered)
    {   
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "Flys";
    }

    public String breath()
    {
        return "Breaths with lungs";
    }

    public String reproduce()
    {
        return "Reproducess with eggs";
    }
}