import java.util.Scanner;

public class Main {
    public static void makeSwim(Swimable swimable) {
        swimable.swim();
    }

    public static void main(String args[]) {
        Fish fish = new Fish();
        Ship ship = new Ship();

        makeSwim(fish);
        makeSwim(ship);

    }
}
