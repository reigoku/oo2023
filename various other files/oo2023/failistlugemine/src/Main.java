import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("Lugemine.txt"));
        String row = br.readLine();
        /*System.out.println(row);

         */
        while (row != null){
            System.out.println(row);
            String[] splitter = (row.split("u"));
            System.out.println(Arrays.toString(splitter));
            String row = br.readLine();
            double square = Math.pow(splitter.length, 2);
            System.out.println(square);
            double squareroot = Math.sqrt(splitter.length);
            System.out.println(squareroot);

        }
    }
}