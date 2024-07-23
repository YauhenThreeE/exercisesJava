package org.example.dicision;
import java.util.Scanner;  // Импортируем класс Scanner для считывания ввода с консоли

public class Administration {


    // Главный метод программы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Создаем объект Scanner для считывания ввода с консоли
        String input;  // Переменная для хранения ввода пользователя

        // Бесконечный цикл для ежедневного процесса выдачи карт
        while (true) {
            System.out.println("New day");  // Выводим сообщение о новом дне
            System.out.println("Administration: \"Hello, do you need a magnetic card? (Y/N)\"");  // Спрашиваем у сотрудника, нужна ли ему карта

            input = scanner.nextLine().trim();  // Считываем ввод пользователя и удаляем пробелы в начале и конце

            // Если пользователь ввел "exit", выходим из программы
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
                System.out.println("Could you rephrase that");
                input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("exit")) {
                    /*System.out.println("Process finished with exit code 0");*/
                    return;
                }
            }

            // Если пользователь ввел "Y" (Да), выдаем карту
            if (input.equalsIgnoreCase("Y")) {
                // Генерация нового экземпляра MagneticCard
                MagneticCard card = MagneticCard.getInstance();
                System.out.println("Here is your card: " + card);  // Выводим информацию о карте
            }
            // Если пользователь ввел "N" (Нет), говорим "Хорошего дня"
            else if (input.equalsIgnoreCase("N")) {
                System.out.println("Have a nice day!");

            }


            System.out.println("--------------------------------------------------------");  // Разделитель для улучшения читаемости
        }

        scanner.close();  // Закрываем объект Scanner для освобождения ресурсов
    }
}

