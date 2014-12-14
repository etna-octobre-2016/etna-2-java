package taxonomy.model.species;

import taxonomy.behaviours.ILivingBehaviour;
import taxonomy.model.families.FelideaFamily;
import taxonomy.state.ELifeState;

public final class Lion extends FelideaFamily implements ILivingBehaviour
{
    private static String scientificName = "Panthera Leo";

    private String name;

    private ELifeState state;

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Constructors
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public Lion(String name)
    {
        this.name = name;
    }

    public Lion()
    {
        this("Unknown");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // AnimaliaKingdom abstract methods definitions
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void eat()
    {
        System.out.println("I love gazelles");
    }

    public void move()
    {
        System.out.println("Thot walk, hey ! hey !");
    }

    public void reproduce()
    {
        System.out.println("If it's a male, we could call him Simba");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // IHunterBehaviour interface methods definitions
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void hide()
    {
        System.out.println("You can't see me...");
    }

    public void sneakUp()
    {
        System.out.println("Behind you!");
    }

    public void trackDown()
    {
        System.out.println("You can't run away from me!");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // ILivingBehaviour interface methods definitions
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void born()
    {
        // do stuff
    }

    public void growUp()
    {
        // do stuff
    }

    public void die()
    {
        // do stuff
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // IStateChangeable interface methods definitions
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public ELifeState getState()
    {
        return this.state;
    }

    public void setState(ELifeState state)
    {
        this.state = state;
    }

    public void validateStateChange(ELifeState currentState, ELifeState nextState)
    {
        // do stuff
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
