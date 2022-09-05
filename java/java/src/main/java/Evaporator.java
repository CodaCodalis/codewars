public class Evaporator {
    public static int evaporator(double content, double evapPerDay, double threshold) {
        int daysLeft = 0;
        threshold = content * threshold / 100;
        while (content > threshold) {
            content = content - content * evapPerDay / 100;
            daysLeft = daysLeft + 1;
        }
        System.out.println(threshold);
        System.out.println(content);
        System.out.println(daysLeft);
        return daysLeft;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10, 10, 10));
    }
}
