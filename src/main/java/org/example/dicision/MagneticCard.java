package org.example.dicision;

public class MagneticCard {

    // Приватная статическая переменная для хранения единственного экземпляра класса
    private static  MagneticCard instance;

    // Приватный конструктор, чтобы предотвратить создание объектов вне класса
    private MagneticCard() {}


    // Публичный статический метод для получения экземпляра класса
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


