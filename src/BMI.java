public class BMI {
    public static String bmi(double weight, double height) {
        double bm = weight / (height * height);
        if (bm <= 18.5) {
            return "Underweight";
        }
        if (bm <= 25.0 & bm > 18.5) {
            return "Normal";
        }
        if (bm <= 30.0 & bm > 25.0) {
            return "Overweight";
        }
        if (bm > 30.0) {
            return "Obese";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(bmi(65, 1.75));
    }
}
