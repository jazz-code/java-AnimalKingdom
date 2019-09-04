package animals;

public class Mammals extends AbstractAnimal
{
    public String name; 
    //constructor pulling super() from AbstractAnimal
    public Mammals (String name, int yearDiscovered, int food)
    {
        super(name, yearDiscovered, food);
    }

    public abstract String move()
    {

    }
    public abstract String breath()
    {

    }
    public abstract String reproduce()
    {

    }
}