package taxonomy.model.species;

import taxonomy.model.families.FelideaFamily;

public class Panthere extends FelideaFamily
{
	private String name;
    private static String scientificName = "Panthera uncia";

    /* Constructors */

    public Panthere(String name)
    {
        this.name = name;
    }
    public Panthere()
    {
        this("Unknown");
    }


    /* Class methods */

    public void eat()
    {
        System.out.println("I love Wild sheeps and Ibexes");
    }
    public void hide()
    {
        System.out.println("You can't see me...");
    }
    public void move()
    {
        System.out.println("Furtive movement");
    }
    public void reproduce()
    {
        System.out.println("between january and mars :)");
    }
    public void sneakUp()
    {
        System.out.println("Behind you!");
    }
    public void trackDown()
    {
        System.out.println("You can't run away from me!");
    }

    /* Getters */

    public String getScientificName() {
        return this.scientificName;
    }
    public String getName() {
        return this.name;
    }

    /* Setters */

    public void setName(String name) {
        this.name = name;
    }
}
