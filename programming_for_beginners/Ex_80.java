/*
 * #80 - Java Reader Class with Examples (FileReader)
The Reader class of the java.io package is an abstract
superclass that represents a stream of characters.

Since Reader is an abstract class, it is not useful by
itself. However, its subclasses can be used to read
data.

Subclasses of Reader:
- BufferedReader
- InputStreamReader
- FileReader
- StringReader

Methods of Reader:
- ready() - checks if the reader is ready to be read
- read(char[] array) - reads the characters from the
stream and stores in the specified array
- skip() - discards the specified number of characters
from the stream
- close() - to close the reader

 */

public class Ex_80 {
    public static void main(String[] args) {
        Reader fileReader = new FileReader("C:\\Users\\USER\\De");
        char[] array = new char[100];
        System.out.println("ready? -" + fileReader.ready());
        fileReader.read(array);

        System.out.println("file content is : " + array);
        fileReader.close();
    }
}
