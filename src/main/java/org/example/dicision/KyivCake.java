package org.example.dicision;

public class KyivCake implements Cake {

    private String name;

    public KyivCake(){
        this.name = "Kyiv Cake";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makingBiscuits() {
        System.out.println("Making nut meringue layers for Kyiv Cake");
    }

    @Override
    public void makingCream() {
        System.out.println("Making buttercream for Kyiv Cake");
    }

    @Override
    public void makeDecorate() {
        System.out.println("Decorating Kyiv Cake with floral patterns");
    }



}
