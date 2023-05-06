package tasks2;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        Scanner scanner = new Scanner(System.in);
        int longValue = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list =  new Random()
                .ints(0, maxValue)
                .limit(longValue)
                .boxed()
                .toList();
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int treshold = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
    }
}
