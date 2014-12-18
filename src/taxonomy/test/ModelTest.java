package taxonomy.test;

import taxonomy.model.species.Gazelle;
import taxonomy.model.species.Lion;

public class ModelTest
{
    public static void main(String[] args)
    {
        System.out.println("hello world");

        Lion moufassa = new Lion("Moufassa");
        Gazelle gaz = new Gazelle("Gaz");

        System.out.println(moufassa.getName());
        System.out.println(gaz.getName());

        System.out.println(moufassa.getScientificName());
        System.out.println(gaz.getScientificName());

        moufassa.reproduce();
        gaz.reproduce();

        System.out.println(moufassa.getState().getStateDescription());
        System.out.println(gaz.getState().getStateDescription());

        moufassa.growUp();
        gaz.growUp();

        System.out.println(moufassa.getState().getStateDescription());
        System.out.println(gaz.getState().getStateDescription());
        
        moufassa.trackDown();
        gaz.avoid();
        
        moufassa.sneakUp();
        moufassa.eat();
        
        gaz.die();
        System.out.println(gaz.getState().getStateDescription());
        
        
    }
}
