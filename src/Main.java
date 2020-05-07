public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 70;
        double heightInMeters = 1.72;
        double bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println(bmi);
    }
}
