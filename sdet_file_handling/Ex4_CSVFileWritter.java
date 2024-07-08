import java.io.FileWriter;
import java.io.IOException;

public class Ex4_CSVFileWritter {
    public static void main(String[] args) throws IOException {
        String csvFileName = System.getProperty("user.dir") + "\\data\\example.csv";
        FileWriter writer = new FileWriter(csvFileName);

        writer.append("Name,Age,Email \n"); // header
        writer.append("John,30,john@gmail.com");
        writer.append("Smith,20,smith@gmail.com");
        writer.append("Scott,40,scott@gmail.com");

        writer.close();

        System.out.println("CSV file created at:" + csvFileName);

    }
}
