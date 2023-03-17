import java.io.*;

public class insertAverages {
    double input1;
    double input2;

    public insertAverages(double input1, double input2){
        this.input1 = input1;
        this.input2 = input2;
    }
    public static double getTotalAverage(double input1, double input2) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("keskkiirus.txt"));
        double averageSpeed = Double.parseDouble(br.readLine());
        double averageTotal = 0;
        int i = 0;
        while(averageSpeed != null){
            averageTotal += averageSpeed;
            i += 1;
            averageSpeed = Double.parseDouble(br.readLine());

        }
        averageTotal += input1 + input2;
        double totalAverage = averageTotal / i;
        PrintWriter pw = new PrintWriter(new FileWriter("keskkiirus.txt"));
        pw.print((input1 + input2)/2);
        return totalAverage;

    }
}
