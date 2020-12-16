import java.nio.ByteBuffer;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author kkw
 * @project java-tips
 * @date 2020/12/16
 */

public class SetDemo {

    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<String>();
        stringSet.add("hello");
        stringSet.add("hello");
        System.out.println("Size of string set: " + stringSet.size());

        Set<byte[]> byteArraySet = new LinkedHashSet<byte[]>();
        byteArraySet.add("hello".getBytes());
        byteArraySet.add("hello".getBytes());
        System.out.println("Size of byte[] set: " + byteArraySet.size());

        Set<ByteBuffer> byteBufferSet = new LinkedHashSet<ByteBuffer>();
        byteBufferSet.add(ByteBuffer.wrap("hello".getBytes()));
        byteBufferSet.add(ByteBuffer.wrap("hello".getBytes()));
        System.out.println("Size of ByteBuffer set: " + byteBufferSet.size());
    }
}
