package taxonomy.model.species;

import taxonomy.model.families.BovidaeFamily;

public final class Gazelle extends BovidaeFamily
{
    private String name;
    private static String scientificName = "Gazella";

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Constructors
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public Gazelle(String name)
    {
        this.name = name;
    }

    public Gazelle()
    {
        this("Unknown");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // AnimaliaKingdom abstract methods definitions
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void eat()
    {
        System.out.println("I like the fresh grass");
    }

    public void move()
    {
        System.out.println("Travel with grace and elegance");
    }

    public void reproduce()
    {
        System.out.println("A new meal for lions T_T");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // IVictimBehaviour interface methods definitions
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void hide()
    {
        System.out.println("You can't see me...");
    }

    public void avoid()
    {
        System.out.println("I run away with grace and elegance");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Getters & Setters
    ///////////////////////////////////////////////////////////////////////////////////////////////

    /* Getters */

    public String getScientificName()
    {
        return this.scientificName;
    }

    public String getName()
    {
        return this.name;
    }

    /* Setters */

    public void setName(String name)
    {
        this.name = name;
    }
}
