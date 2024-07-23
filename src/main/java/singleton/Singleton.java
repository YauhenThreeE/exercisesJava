package singleton;

public class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        // Приватный конструктор, чтобы предотвратить создание объектов извне
    }
    public static Singleton getInstance(){
        return INSTANCE;
    }

    public String toString() {
        return "card.MagneticCard_2@" + Integer.toHexString(hashCode());
    }
}
