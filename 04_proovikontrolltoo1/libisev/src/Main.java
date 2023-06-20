import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        System.out.println(average( x, y, z));

        double[] input = {2, 8, 9, 10};
        System.out.println(Arrays.toString(average2(input)));
    }



    private static double average(int x, int y, int z){
        double avg = (x + y + z)/3;
        return avg;
    }
    private static double[] average2(double[] numbers){
        double[] output = new double[numbers.length - 2];
        for (int i = 0; i < numbers.length - 2; i++){
            output[i] = numbers[i+1] + numbers[i+2] / 2;

        }
        return output;
    }

}