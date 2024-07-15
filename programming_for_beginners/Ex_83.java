/*
 * #83 - Java BufferedWriter Class with Examplesm (File
Handling)
The BufferedWriter class of the java.io package can be
used with other writers to write data (in characters)
more efficiently.

Working of BufferedWriter
The BufferedWriter maintains an internal buffer of 8192
characters.

During the write operation, the characters are written
to the internal buffer instead of the disk. Once the
buffer is filled or the writer is closed, the whole
characters in the buffer are written to the disk.

Hence, the number of communication to the disk is
reduced. This is why writing characters is faster using
BufferedWriter.
 */
public class Ex_83 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Use"));
        bw.write("This is first line in an external file (output). \n");
        bw.write("This is another line.");
        System.out.println("file content written successfully");
        bw.close();
    }
}
