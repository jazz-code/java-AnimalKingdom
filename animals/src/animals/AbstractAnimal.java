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
        this.yearDiscovered = yearDiscovered;
        this.name = name;
    }
    // default contructor => AbstractAnimal with no parameters
    public AbstractAnimal()
    {
        food = 1;
    }

    public void move(int steps)
    {
        food = food - steps;
    }

    public vod eat(int i)
    {
        food = food + i;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public vod setYearDiscovered()
    {
        this.yearDiscovered = yearDiscovered;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public int getId()
    {
        return id;
    }

}