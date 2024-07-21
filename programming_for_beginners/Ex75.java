/*
 * #75 - Java InputStream Class with Examples
The InputStream class of the java.io package is an
abstract superclass that represents an input stream of
bytes.

Since InputStream is an abstract class, it is not
useful by itself. However, its subclasses can be use
to read data.

Methods of InputStream:
- read(byte[] array) - reads bytes from the stream and
stores in the specified array
- available() - returns the number of bytes available
in the input stream
- close() - closes the input stream


 */

import java.io.FileInputStream;

public class Ex75 {
    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("C:\\Users\\V");
            int count = input.available();
            System.out.println("count : " + count);

            byte[] content = new byte[100];
            input.read(content);

            String fileContent = new String(content);
            System.out.println("file content : " + fileContent);

            input.close();
            System.out.println("the file has been closed");
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());

        }
    }
}
