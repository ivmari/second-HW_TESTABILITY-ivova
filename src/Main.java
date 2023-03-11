public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double x = 1.87;
        int y = 98;
        int myBmi = service.bmi(x, y);
        System.out.println("Параметры роста и веса:");
        System.out.println((x) + " метра");
        System.out.println((y) + " кг");
        System.out.println("Индекс массы тела:");
        System.out.println(myBmi);
    }
}