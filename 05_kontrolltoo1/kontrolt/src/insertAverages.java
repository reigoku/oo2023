import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class insertAverages {
    double input1;
    double input2;
    List<Double> averageSpeeds;


    public insertAverages(){
        this.input1 = input1;
        this.input2 = input2;
        this.averageSpeeds = new ArrayList<>();
    }
    public double getAverage(/*double input1, double input2*/) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader("kiirusSisestus.txt"));
        input1 = Double.parseDouble(br1.readLine());
        input2 = Double.parseDouble(br1.readLine());
        return (input1 + input2) / 2;
    }
    public double listTotalAverage(){
        averageSpeeds.add(input1);
        averageSpeeds.add(input2);
        double totalSpeed = 0;

        for(int i = 0; i < averageSpeeds.size(); i ++){
            totalSpeed += averageSpeeds.get(i);

        }
        return totalSpeed / averageSpeeds.size();


    }
    public double getTotalAverage(/*double input1, double input2*/) throws IOException {
        /*BufferedReader br = new BufferedReader(new FileReader("kiirusVäljastus.txt"));
        double averageSpeed = Double.parseDouble(br.readLine());
        double averageTotal = 0;
        int i = 0;
        while(String.valueOf(averageSpeed) != null){
            averageTotal += averageSpeed;
            i += 1;
            averageSpeed = Double.parseDouble(br.readLine());

        }*/
        BufferedReader br1 = new BufferedReader(new FileReader("kiirusSisestus.txt"));
        input1 = Double.parseDouble(br1.readLine());
        input2 = Double.parseDouble(br1.readLine());
        br1.close();

        /*BufferedReader br2 = new BufferedReader(new FileReader("kiirusVäljastus.txt"));
        double averageTotal = Double.parseDouble(br2.readLine());
        double i = Integer.parseInt(br2.readLine());
        br2.close();

        averageTotal += input1 + input2;
        i += 2;*/
        double totalAverage = listTotalAverage();
        PrintWriter pw = new PrintWriter(new FileWriter("kiirusVäljastus.txt"));
        pw.println(totalAverage);
        pw.close();
        return totalAverage;

    }
}
