package org.example.dicision;

public class NapoleonCake implements Cake {
    private String name;

    public NapoleonCake(){
        this.name = "Napoleon Cake";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makingBiscuits() {
        System.out.println("Making flaky biscuits for Napoleon Cake");
    }

    @Override
    public void makingCream() {
        System.out.println("Making custard cream for Napoleon Cake");
    }

    @Override
    public void makeDecorate() {
        System.out.println("Decorating Napoleon Cake with powdered sugar");
    }
}


