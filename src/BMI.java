public class BMI {
    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi <= 18.5){
            return "Underweight";
        }
        if (bmi <= 25.0 & bmi > 18.5){
            return "Normal";
        }
        if (bmi <= 30.0 & bmi > 25.0){
            return "Overweight";
        }
        if (bmi > 30.0){
            return "Obese";
        }
        return "";
    }

    public static void main(String[] args) {
        bmi(65, 175);
        System.out.println("");
    }
}
