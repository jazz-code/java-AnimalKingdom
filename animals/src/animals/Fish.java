package animals;

public class Fish extends AbstractAnimal
{
    private int yearDiscovered; 
    private String name;

    public Fish(String name, int yearDiscovered)
    {   
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "Swims";
    }

    public String breath()
    {
        return "Breaths with gils";
    }

    public String reproduces()
    {
        return "Reproducess with eggs";
    }
}