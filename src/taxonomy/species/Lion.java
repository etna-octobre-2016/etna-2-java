package taxonomy.species;

import taxonomy.families.FelideaFamily;

public final class Lion extends FelideaFamily
{
    private String name;
    private static String scientificName = "Panthera Leo";

    /* Constructors */

    public Lion(String name)
    {
        this.name = name;
    }
    public Lion()
    {
        this("Unknown");
    }


    /* Class methods */

    public void eat()
    {
        System.out.println("I love gazelles");
    }
    public void hide()
    {
        System.out.println("You can't see me...");
    }
    public void move()
    {
        System.out.println("Thot walk, hey ! hey !");
    }
    public void reproduce()
    {
        System.out.println("If it's a male, we could call him Simba");
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
