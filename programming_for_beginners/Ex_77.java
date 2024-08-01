/*
 * #77 - Java BufferedInputStream Class with Examples
The BufferedInputStream class of the java.io package is
used with other input streams to read the data (in
bytes) more efficiently.

Working of BufferedInputStream:
The BufferedInputStream maintains an internal buffer of
8192 bytes.

During the read operation in BufferedInputStream, a
chunk of bytes is read from the disk and stored in the
internal buffer. And from the internal buffer bytes are
read individually.
Hence, the number of communication to the disk is
reduced. This is why reading bytes is faster using the
BufferedInputStream.

Methods of BufferedInputStream:
- read() - reads a single byte from the input stream
- read(byte[] arr) - reads bytes from the stream and
stores in the specified array
- available() - to get the number of available bytes in
the input stream
- skip() - to discard and skip the specified number of
bytes
- close() - to close the buffered input stream

 */

import java.io.BufferedInputStream;

public class Ex77 {
    public static void main(String[] args) {
        BufferedInputStream bis = new BufferedInputStream(new);
int i = bis.read();
System.out.print("file content is : ");
while(i != -1) {
System.out.print((char) i);
i = bis.read();
    }

    bis.close();
}

}
