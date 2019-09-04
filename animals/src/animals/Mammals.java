package animals;

public class Mammals extends AbstractAnimal
{
    public String name; 
    //constructor pulling super() from AbstractAnimal
    public Mammals (String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "Walks";
    }

    @Override
    public String breath()
    {
        return "Breathes with lungs";
    }

    @Override
    public String reproduce()
    {
        return "Live births";
    }
}