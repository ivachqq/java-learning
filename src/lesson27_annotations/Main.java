package lesson27_annotations;

public class Main {
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        g1.hello("Bob");
        g1.helloOld("Bob"); //выделяет, ибо аннотация устаревшего
        System.out.println(g1.toString());
    }
}
