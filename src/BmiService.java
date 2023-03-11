public class BmiService {
    public int bmi(double heightMeters, int weightKilogram) {
        int bmi = (int) (weightKilogram / (heightMeters * heightMeters));
        return bmi;
    }
}
