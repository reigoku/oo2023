import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Double> xCoordinates = new ArrayList<>(Arrays.asList(1.0, 2.5, 3.5));
        List<Double> yCoordinates = new ArrayList<>(Arrays.asList(2.0, 3.5, 4.5));

        shaped shaped = new shaped(yCoordinates, xCoordinates);

        System.out.println(shaped.xCoordinates);
        System.out.println(shaped.yCoordinates);
    }

}