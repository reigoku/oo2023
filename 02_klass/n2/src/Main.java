import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        //ma ei tea mille kohta tegelikult kasutatavat koodi kirjutada
        Incomprehensible incom = new Incomprehensible(num1, num2);
        incom.definitelyCorrectAddition(num1, num2);
        incom.theFunny();

    }

}