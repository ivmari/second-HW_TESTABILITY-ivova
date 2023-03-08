public class BmiService {
    public int bmi(double height_meters, int weight_kilogram) {
        int bmi = (int) (weight_kilogram / (height_meters * height_meters));
        return bmi;
    }
}
