package taxonomy.test;

import taxonomy.model.species.Lion;

public class ModelTest
{
    public static void main(String[] args)
    {
        System.out.println("hello world");

        Lion simba = new Lion("Simba");
        System.out.println(simba.getName());
        System.out.println(simba.getScientificName());
        simba.reproduce();
    }
}
