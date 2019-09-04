package animals;

import java.util.*;

public class Main 
{
    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
    {
        for (AbstractAnimal v : animals)
        {
            if (tester.test(v))
            {
                System.out.println(v.getName());
            }
        }
    }
    public static void main(String[] args)
    {
        //--Mammals---*
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);
        //---Birds---*
        Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);
        //---Fish---*
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("CatFish", 1817);
        Fish perch = new Fish("Perch", 1758);
        
        //--Prints name and year discovered from different classes----*
        System.out.println(panda.getName() + " " + "Year Discovered: " + panda.getYearDiscovered());
        System.out.println(pigeon.getName() + " " + "Year Discovered: " + pigeon.getYearDiscovered());
        System.out.println(salmon.getName() + " " + "Year Discovered: " + salmon.getYearDiscovered());

        //-- New ArrayList combines classes from AbstractAnimal--*
        ArrayList<AbstractAnimal> myList = new ArrayList<AbstractAnimal>();
        //Add all to arrayList
        System.out.println("***ArrayList***");
		myList.add(panda);
		myList.add(zebra);
		myList.add(koala);
		myList.add(sloth);
		myList.add(armadillo);
		myList.add(raccoon);
		myList.add(bigfoot);
		myList.add(pigeon);
		myList.add(peacock);
		myList.add(toucan);
		myList.add(parrot);
		myList.add(swan);
		myList.add(salmon);
		myList.add(catfish);
		myList.add(perch);

        myList.forEach((v) -> System.out.println(v.getName()));
        
        //--List all the animals in descending order by year named--*
        System.out.println("***Animals in descending order by year named***");
        myList.sort((v1, v2) -> v2.getYearDiscovered() - v1.getYearDiscovered());
        myList.forEach(animal -> System.out.println(animal.getName() + " " + animal.getYearDiscovered()));
        System.out.println();

        // List all the animals alphabetically
        System.out.println("***List all the animals alphabetically***");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach(animal -> System.out.println(animal.getName()));
        System.out.println();

        // List all the animals order by how they move
        System.out.println("***List all the animals order by how they move***");
        myList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        myList.forEach(animal -> System.out.println(animal.move()));
        System.out.println();

        // List only those animals the breath with lungs
        System.out.println("***List only those animals the breath with lungs***");
        // filters List 
        printAnimals(myList, v -> v.breath().equals("Breathes with lungs"));
        System.out.println();
    }
}
