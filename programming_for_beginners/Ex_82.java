/*
 * characters is read from the disk and stored in the

#82 - Java BufferedReader Class with Examples (File
Handling)
The BufferedReader class of the java.io package can be
used with other readers to read data (in characters)
more efficiently.

Working of BufferedReader
The BufferedReader maintains an internal buffer of 8192
characters.

During the read operation in BufferedReader, a chunk of
characters is read from the disk and stored in the
internal buffer. And from the internal buffer
characters are read individually.

Hence, the number of communication to the disk is
reduced. This is why reading characters is faster using
BufferedReader.
 */

public class Ex_82 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new FileReader(""));
        // String data = br.readLine();
        String data = "";
        while (br.readLine() != null) {
            data = br.readLine();
            System.out.println(data);

        }
    }
}
