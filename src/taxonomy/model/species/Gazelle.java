package taxonomy.model.species;

import taxonomy.behaviours.ILivingBehaviour;
import taxonomy.model.families.BovidaeFamily;
import taxonomy.model.life.LifeException;
import taxonomy.state.ELifeState;
import taxonomy.state.LifeStateMachine;

public final class Gazelle extends BovidaeFamily implements ILivingBehaviour
{
    private String name;
    private static String scientificName = "Gazella";
    private ELifeState state;

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Constructors
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public Gazelle(String name)
    {
        this.name = name;
        this.born();
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
    // ILivingBehaviour interface methods definitions
    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void born()
    {
        LifeStateMachine.changeState(this);
    }

    public void growUp()
    {
        LifeStateMachine.changeState(this, ELifeState.LIFEADULTE);
    }

    public void die()
    {
        LifeStateMachine.changeState(this, ELifeState.LIFEMORT);
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

    public void validateStateChange(ELifeState nextState)
    {
        if (this.getState() == nextState)
        {
            throw new LifeException("This gazelle is already in the state: " + this.getState().getStateDescription());
        }
        if (this.getState() == ELifeState.LIFEADULTE && nextState == ELifeState.LIFENAISSANCE)
        {
            throw new LifeException("This gazelle cannot be a little gazelle again");
        }
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
