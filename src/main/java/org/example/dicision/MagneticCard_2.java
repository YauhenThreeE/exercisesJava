/*
package org.example.dicision;

public class MagneticCard_2 {
    // Приватная статическая переменная для хранения единственного экземпляра класса.
    // Используется volatile для предотвращения проблем с кешированием при доступе к переменной в многопоточной среде.
    private static volatile MagneticCard_2 instance;

    // Публичный статический метод для получения экземпляра класса.
    // Этот метод реализует двойную проверку блокировки (Double-Checked Locking) для обеспечения безопасного доступа в многопоточной среде.
    public static MagneticCard_2 getInstance() {
        // Локальная переменная для временного хранения ссылки на экземпляр класса.
        MagneticCard_2 localInstance = instance;

        // Проверка, был ли уже создан экземпляр.
        if (localInstance == null) {
            // Синхронизированный блок для предотвращения одновременного создания нескольких экземпляров.
            synchronized (MagneticCard_2.class) {
                // Повторная проверка внутри синхронизированного блока.
                localInstance = instance;
                if (localInstance == null) {
                    // Создание нового экземпляра и присвоение его статической переменной instance и локальной переменной localInstance.
                    instance = localInstance = new MagneticCard_2();
                }
            }
        }
        // Возвращаем единственный экземпляр класса.
        return localInstance;
    }
    public String toString() {
        return "card.MagneticCard_2@" + Integer.toHexString(hashCode());
    }
}
*/
