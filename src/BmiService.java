public class BmiService {
    public int calculate(double height, double weigh) {
        double index = weigh / (height * height);
        return (int) index;
    }
}