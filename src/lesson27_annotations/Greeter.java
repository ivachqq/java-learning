package lesson27_annotations;

public class Greeter {

    public String hello(String name) {
        return "Hello, " + name;
    }

    @Deprecated
    public String helloOld(String name) {
        return hello(name);
    }
    //Deprecated для того, чтобы пометить уже устаревший метод
    @Override
    public String toString() {
        return "Greeter";
    }
    //override, ибо метод уже существует в классе-родителе и мы его переопределяем
    //если напечатать без override и toStrng, то это абсолютно другой метод, никак не относящийся к toString и относящийся только к классу Greater
}
