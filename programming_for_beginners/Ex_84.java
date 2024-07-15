
/*
 * #84 - Java StringReader Class with Examples
The StringReader class of the java.io package can be
used to read data (in characters) from strings.

// Creates a StringReader
StringReader input= new StringReader(String data);

Methods of StringReader
- read() - reads a single character from the string
reader
- read(char[] array) - reads the characters from the
reader and stores in the specified array
- ready() - checks if the string reader is ready to be
read
- mark() - marks the position in reader up to which
data has been read
- reset() - returns the control to the point in the
reader where the mark was set


 */

import java.io.StringReader;

public class Ex_84 {
    public static void main(String[] args) {
        String data = "This is a test String";
        StringReader sr = new StringReader(data);
        for (int i = 1; i <= 10; i++) {
            int x = sr.read();
            System.out.print((char) x + ",");
        }
    }
}
