import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner sc = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Здравствуйте, введите размер списка: ");
        int N = sc.nextInt();
        System.out.print("Введите верхнюю границу значений элементов в списке: ");
        int M = sc.nextInt();
        if (N <= 0 || M <= 0) {
            logger.log("Числа должны быть положительными: ");
            System.out.print("введите размер списка: ");
            N = sc.nextInt();
            System.out.print("Введите верхнюю границу значений элементов в списке: ");
            M = sc.nextInt();
        }

        logger.log("Создаем и наполняем список");
        List<Integer> randomList = new Random().ints(0, M)
                .limit(N)
                .boxed()
                .toList();

        System.out.print("Вот случайный список: ");
        randomList.forEach(System.out::print);
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите число для фильтрации списка: ");
        int f = sc.nextInt();
        Filter filter = new Filter(f);
        List<Integer> filtredList = filter.filterOut(randomList);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        filtredList.forEach(System.out::print);
        System.out.println();
        logger.log("Завершаем программу");

    }
}