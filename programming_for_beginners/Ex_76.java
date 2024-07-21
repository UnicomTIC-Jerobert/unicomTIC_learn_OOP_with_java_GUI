/*
 * #76 - Java OutputStream Class with Examples
The OutputStream class of the java.io package is an
abstract superclass that represents an output stream of
bytes.

Since OutputStream is an abstract class, it is not
useful by itself. However, its subclasses can be used
to write data.

Subclasses of OutputStream
- FileOutputStream
- ByteArrayOutputStream
- ObjectOutputStream

Methods of OutputStream
- write() - writes the specified byte to the output stream
- write(byte[] array) - writes the bytes from the specified array to the output stream
- flush() - forces to write all data present in output stream to the destination
- close() - closes the output stream

 */
public class Ex_76 {
    public static void main(String[] args) {
        try {
            String data = "This is a test line from program.";
            OutputStream output = new FileOutputStream("C:\\Users\\");
            byte[] array = data.getBytes();
            output.write(array);

            output.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
