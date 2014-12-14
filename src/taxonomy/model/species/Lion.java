package taxonomy.model.species;

import taxonomy.behaviours.ILivingBehaviour;
import taxonomy.model.families.FelideaFamily;
import taxonomy.model.life.LifeException;
import taxonomy.state.ELifeState;
import taxonomy.state.LifeStateMachine;

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
        this.born();
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
            throw new LifeException("This lion is already in the state: " + this.getState().getState());
        }
        if (this.getState() == ELifeState.LIFEADULTE && nextState == ELifeState.LIFENAISSANCE)
        {
            throw new LifeException("This lion cannot be a little lion again");
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
