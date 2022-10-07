import entities.Scenario;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] amounts = new int[] {
                10, 100, 500, 1000, 5000
        };
        FileWriter writer = new FileWriter("output.csv");
        writer.write("AMOUNT,MIN,MAX,AVG,DEV\n");
        writer.close();

        for (int i = 0; i < 5; ++i) {
            Scenario scenario = new Scenario(amounts[i]);
            System.out.println("------------");
            System.out.println("Min.: " + scenario.getMin() + " ms");
            System.out.println("Max.: " + scenario.getMax() + " ms");
            System.out.println("Avg.: " + scenario.getAvg() + " ms");
            System.out.println("Dev.: " + scenario.getDev() + " ms");
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("output.csv", true));
                out.write(
                        amounts[i] + "," + scenario.getMin() + "," + scenario.getMax() + "," + scenario.getAvg() + ","
                                + scenario.getDev()
                                + "\n");
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
