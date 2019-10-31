import java.io.*;

public class Main {

    public static void main(String[] args) {
        String s1Result = seniorProblem1("2016CCCTestData/s1/s1.1.in");
        System.out.println(s1Result);
    }

    // 2016 CCC Senior problem 1
    public static String seniorProblem1(String testDataFilePath) {
        String first;
        String second;
        File file = new File(testDataFilePath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            first = br.readLine();
            second = br.readLine();
            System.out.println(String.format("%s, %s", first, second));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "N";
    }
}
