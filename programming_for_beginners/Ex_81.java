/*
 * #81 - Java Writer Class with Examples (FileWriter)
The Writer class of the java.io package is an abstract
superclass that represents a stream of characters.


Since Writer is an abstract class, it is not useful by
itself. However, its subclasses can be used to write
data.

Subclasses of Writer
- BufferedWriter
- OutputStreamWriter
- FileWriter
- StringWriter

Methods of Writer
- write(char[] array) - writes the characters from the
specified array to the output stream
- write(String data) - writes the specified string to
the writer
- append(char c) - inserts the specified character to
the current writer
- flush() - forces to write all the data present in the
writer to the corresponding destination
- close() - closes the writer

 */
public class Ex_81 {
    public static void main(String[] args) {
        Writer fw = new FileWriter("C:\\Users\\USER\\Desktop\\");
        fw.write("This is first line in output file. ");
        fw.write("This is another line in output file");
        System.out.println("file content is written");
        fw.close();
    }
}
