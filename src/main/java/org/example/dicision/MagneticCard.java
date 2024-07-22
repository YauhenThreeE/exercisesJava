package org.example.dicision;

class MagneticCard {
   /* private static int idCounter = 0;
    private final int id;

    public MagneticCard() {
        this.id = idCounter++;
    }*/

    @Override
    public String toString() {
        return "card.MagneticCard@" + Integer.toHexString(hashCode());
    }
}
