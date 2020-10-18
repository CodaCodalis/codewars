public class KeepHydrated {
    public static int Liters(double time) {
        int liters = (int)time / 2;
        return liters;

    }
    public static void main(String[] args) {
        double time = 14.67;
        Liters(time);
        System.out.println(Liters(time));
    }
}
