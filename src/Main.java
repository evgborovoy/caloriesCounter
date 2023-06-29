import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker user = new StepTracker();
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 4) {
            switch (userInput) {
                case 1:
                    // ввод пройденного количества шагов за день
                    break;

                case 2:
                    // печать статистики за определенный месяц
                    System.out.println("2");
                    break;

                case 3:
                    System.out.println("Введите новую цель: ");
                    int newGoal = scanner.nextInt();
                    if (newGoal > 0) {
                        user.setStepsGoal(newGoal);
                    } else {
                        System.out.println("Число должно быть больше 0");
                    }
                    break;
                default:
                    System.out.println("Такой команды нет");
            }
            printMenu();
            userInput = scanner.nextInt();
        }
        System.out.println("Программа завершена");
    }

    public static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1. Ввести количество шагов за определённый день;");
        System.out.println("2. Напечатать статистику за определённый месяц;");
        System.out.println("3. Изменить цель по количеству шагов в день;");
        System.out.println("4. Выйти из приложения;");
    }
}