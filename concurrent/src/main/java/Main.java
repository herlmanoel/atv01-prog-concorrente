import entities.Scenario;

public class Main {
    public static void main(String[] args) {
        Scenario scenario = new Scenario(10);
        System.out.println("------------");
        System.out.println("Min.: " + scenario.getMin() + " ms");
        System.out.println("Max.: " + scenario.getMax() + " ms");
        System.out.println("Avg.: " + scenario.getAvg() + " ms");
    }
}
