package MiniProjects;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secretNum = rand.nextInt(100) + 1;
        int counter = 0;
        while (true) {
            counter++;
            System.out.print("Угадайте число от 1 до 100: ");
            int guessNum = sc.nextInt();
            if (guessNum < 1 || guessNum>100) {
                System.out.println("Вы пытаетесь ввести число, которое выходит за рамки загаданного диапазона (1-100)");
                counter--;
            } else if (guessNum==secretNum) {
                System.out.println("Поздравляю! Вы угадали! Количество использованных попыток: " + counter);
                break;
            } else if (guessNum < secretNum) {
                System.out.println("Ваше число меньше загаданного.");
            }
            else {
                System.out.println("Ваше число больше загаданного!");
            }
        }
        sc.close();
    }
}