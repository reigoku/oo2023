
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class shaped {
    List<Double> xCoordinates;
    public shaped(List<Double> xCoordinates, List<Double> yCoordinates){
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }

    public String defineTriangle(double x, double y){
        xCoordinates.add(x);
        yCoordinates.add(y);
    }

}
