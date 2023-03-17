import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Scanner scanner = new Scanner(System.in);
        double input1 = Double.parseDouble(scanner.nextLine());
        double input2 = Double.parseDouble(scanner.nextLine());*/
        insertAverages insAvg = new insertAverages();

        System.out.println("Kahe lõigu keskmine kiirus: " + insAvg.getAverage());
        System.out.println(insAvg.listTotalAverage());
        System.out.println("Lõikudevaheliste keskmiste keskmine: " + insAvg.getTotalAverage());



    }
}