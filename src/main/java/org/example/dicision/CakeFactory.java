package org.example.dicision;

public class CakeFactory {
    public static Cake createCake(String type){
        switch (type){
            case "Napoleon": return new NapoleonCake();
            case "Kyiv": return new KyivCake();
            case "Tiramisu": return new TiramisuCake();
            default: throw new IllegalArgumentException("Unknown cake type: " + type);
        }
    }
    public static Cake makeCake(String type) {
        Cake cake = createCake(type);
        cake.makingBiscuits();
        cake.makingCream();
        cake.makeDecorate();
        return cake;
    }
}



