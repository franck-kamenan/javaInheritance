package be.intecbrussel.javaInheritance;

public class MyMain
{
    public static void main(String[] args)
    {
        MyCar maVoiture = new MyCar();
        maVoiture.claxon();
        System.out.println("J'ai une " + maVoiture.marque + " " + maVoiture.type + ".");
    }


}
