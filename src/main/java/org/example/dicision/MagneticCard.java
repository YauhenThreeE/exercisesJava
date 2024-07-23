package org.example.dicision;

class MagneticCard {

    private static MagneticCard instance;

    private MagneticCard(){}

    public static MagneticCard getInstance() {
        if (instance == null) {
            instance = new MagneticCard();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "card.MagneticCard@" + Integer.toHexString(hashCode());
    }
}
