import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex5_Ex4_CSVFileReader {
    public static void main(String[] args) throws IOException {
        // Approach1: using Scanner class

        File file = new File(System.getProperty("user.dir") + "\\data\\example.csv");

        Scanner sc = new Scanner(file);

        sc.useDelimiter(",");

        while (sc.hasNext()) {
            System.out.print(sc.next() + "\t");
            sc.close();
        }

        // Appraoch2 : using java split() method
        String csvFileName = System.getProperty("user.dir") + "\\data\\example.csv";
        FileReader reader = new FileReader(csvFileName);

        BufferedReader bfrreader = new BufferedReader(reader);

        String line;

        while ((line = bfrreader.readLine()) != null) {
            String[] data = line.split(",");
            for (String value : data) {
                System.out.print(value + "\t");
            }
        }
    }
}
