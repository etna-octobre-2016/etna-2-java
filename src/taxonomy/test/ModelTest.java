package taxonomy.test;

import taxonomy.model.species.Lion;

public class ModelTest
{
    public static void main(String[] args)
    {
        System.out.println("hello world");

        Lion moufassa = new Lion("Moufassa");

        System.out.println(moufassa.getName());

        System.out.println(moufassa.getScientificName());

        moufassa.reproduce();

        System.out.println(moufassa.getState().getStateDescription());

        moufassa.growUp();

        System.out.println(moufassa.getState().getStateDescription());
    }
}
