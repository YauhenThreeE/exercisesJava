package org.example.dicision;

public class MainCake {
    public static void main(String[] args) {
        Cake napoleon = CakeFactory.makeCake("Napoleon");
        Cake kyiv = CakeFactory.makeCake("Kyiv");
        Cake tiramisu = CakeFactory.makeCake("Tiramisu");

        System.out.println("Created: " + napoleon.getName());
    }
}
