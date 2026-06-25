package MiniProjects;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    private static final Scanner sc = new Scanner(System.in);
    public static int createSecretNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }
    public static int guessNumber() {
        return sc.nextInt();
    }

    public static int checkGuess(int secretNum, int guessNum) {
        if (guessNum < 1 || guessNum > 100) return -2;
        else if (secretNum < guessNum) return -1;
        else if (secretNum>guessNum) return 0;
        return 1;
    }
    public static void playGame(int secretNum) {
        while (true) {
            System.out.print("Угадайте число (1-100): ");
            int guessNum = guessNumber();
            int guessed = checkGuess(secretNum, guessNum);
            if (guessed == -2) System.out.println("Ваше число вне диапазона (1-100)!");
            else if (guessed==-1) System.out.println("Загаданное число меньше");
            else if (guessed == 0) System.out.println("Загаданное число больше");
            else if (guessed == 1) {
                System.out.println("Ура! Вы угадали!");
                System.out.print("Хотите сыграть ещё раз (Да/Нет): ");
                sc.nextLine();
                String answerRepeatGame =sc.nextLine();
                if (answerRepeatGame.equals("Да")) {
                    secretNum = createSecretNumber();
                }
                else {break;}
            }
        }

    }
    public static void main(String[] args) {
        int secretNum = createSecretNumber();
        playGame(secretNum);
    }
}