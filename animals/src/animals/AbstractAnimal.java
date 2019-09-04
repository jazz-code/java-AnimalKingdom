package animals;

public abstract class AbstractAnimal
{
    public static int maxId = 0;
	int id;
    int food;
	String name;
	int yearDiscovered;

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    //constructor
    public AbstractAnimal(int food, String name, int yearDiscovered)
    {
        this.food = food;
    }

    public void move(int steps)
    {
        food = food - steps;
    }

    public vod eat(int i)
    {
        food = food + i;
    }

    
}