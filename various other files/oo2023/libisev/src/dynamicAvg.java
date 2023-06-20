import java.util.ArrayList;
import java.util.List;

public class dynamicAvg {

    List<Double> numbersInList = new ArrayList<>(); //arvud
    List<Double> numberAverages = new ArrayList<>(); //salvestamine
//    int addedNumberCount;

    public dynamicAvg(double num1, double num2, double num3){


        numbersInList.add(num1);
        numbersInList.add(num2);
        numbersInList.add(num3);

    }

    public void addNumber(double number){
        numbersInList.add(number);
        for(int i = 0; i<numbersInList.size()-2; i++){
            double average = (numbersInList.get(i) + numbersInList.get(i+1) + numbersInList.get(i+2))/3;
            numberAverages.add(average);
        }
    }
}

