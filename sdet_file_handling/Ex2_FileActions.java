import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex2_FileActions {
    public static void createFile(String filePath) {
        File myObj = new File(filePath);
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created:" + myObj.getName());
            } else {
                System.out.println("File is already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // writing data into file
    public static void writeFile(String filePath) {

        try {

            FileWriter mywriter = new FileWriter(filePath);

            mywriter.write("welcome to java file handling ... ");
            mywriter.close();
            System.out.println("Successfully wrote tot he file .... ");
        } catch (IOException e) {

            System.out.println("An error occured .... ");
            e.printStackTrace();
        }
    }

    // reading data from the file
    public static void readFile(String filePath) {

        try {

            File myObj = new File(filePath);

            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();
        } catch (FileNotFoundException e) {

            System.out.println("An error occured while reading .. ");
            e.printStackTrace();
        }
    }

    public static void renameFile(String oldfilePath, String newfilePath) {

        File oldfile = new File(oldfilePath);
        File newfile = new File(newfilePath);

        if (oldfile.renameTo(newfile)) {
            System.out.println("File is renamed.");
        } else {
            System.out.println("The file cannot be renamed .. ");
        }

    }

    public static void deleteFile(String filePath) {

        File myObj = new File(filePath);

        if (myObj.delete()) {
            System.out.println("Deleted the file." + myObj.getName());
        } else {
            System.out.println("Failed to delete teh file .. ");
        }
    }

    public static void main(String[] args) {
    }
}
