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
    public AbstractAnimal(String name, int yearDiscovered)
    {
        this.food = food;
        this.yearDiscovered = yearDiscovered;
        this.name = name;
        id = maxId++;
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

    public void eat(int i)
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

    public void setYearDiscovered(int yearDiscovered)
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