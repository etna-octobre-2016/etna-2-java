package taxonomy.behaviours;

import taxonomy.behaviours.ILivingBehaviour;

public interface IHunterBehaviour
{
    public void hide();

    public void kill(ILivingBehaviour animal);

    public void sneakUp();

    public void trackDown();
}
