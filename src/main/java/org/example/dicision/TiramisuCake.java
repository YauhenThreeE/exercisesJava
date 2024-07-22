package org.example.dicision;

public class TiramisuCake implements Cake {

    private String name;

    public TiramisuCake() {
        this.name ="Tiramisu Cake";
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void makingBiscuits() {
        System.out.println("Making ladyfingers for Tiramisu Cake");
    }

    @Override
    public void makingCream() {
        System.out.println("Making mascarpone cream for Tiramisu Cake");
    }

    @Override
    public void makeDecorate() {
        System.out.println("Decorating Tiramisu Cake with cocoa powder");
    }




}
