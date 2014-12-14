package taxonomy.model.species;

import taxonomy.model.families.FelideaFamily;
import taxonomy.model.life.LifeException;
import taxonomy.model.state.ELifeState;
import taxonomy.model.state.IStateChangeable;

public final class Lion extends FelideaFamily implements IStateChangeable
{
    private String name;
    private static String scientificName = "Panthera Leo";
    private ELifeState state;

    /* Constructors */

    public Lion(String name)
    {
        this.name = name;
        state = ELifeState.LIFENAISSANCE;
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

    
    /*Implementation de l'interface*/
    public void life() throws LifeException
    {
    	//ici il va falloir g�rer la vie de l'animal
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
	@Override
	public ELifeState getState() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setState(ELifeState lifeState) {
		// TODO Auto-generated method stub
		
	}
}
