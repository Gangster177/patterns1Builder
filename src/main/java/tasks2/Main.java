package tasks2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");

        Scanner scanner = new Scanner(System.in);
        int longValue = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        List<Integer> list = new Random()
                .ints(0, maxValue)
                .limit(longValue)
                .boxed()
                .toList();
        System.out.print("Вот случайный список: ");
        list.forEach(value -> System.out.print(value + " "));
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        var listByFilter = filter.filterOut(list);

        logger.log("Прошло фильтр " + listByFilter.size() + " элемента из " + list.size());

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        listByFilter.forEach(value -> System.out.print(value + " "));
        System.out.println();

        logger.log("Завершаем программу");
    }
}
