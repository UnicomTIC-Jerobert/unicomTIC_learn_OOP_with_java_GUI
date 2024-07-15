/*
 * #85 - Java PrintWriter Class with Examples
The PrintWriter class of the java.io package can be
used to write output data in a commonly readable form
(text).

Working of PrintWriter
Unlike other writers, PrintWriter converts the
primitive data (int, float, char, etc.) into the text
format. It then writes that formatted data to the
writer.

Methods of PrintWriter:
- print() - prints the specified data to the writer
- println() - prints the data to the writer along with
a new line character at the end
- printf() - can be used to print the formatted string
 */
public class Ex_85 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter("C:\\Users\\USER\\Desk");
        pw.println("this is first line in external file.");
        pw.println("this is another line.");
        pw.printf("my age is %d", 25);
        System.out.println("file written successfully");
        pw.close();
    }
}
