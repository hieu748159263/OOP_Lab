import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws IOException {

        String filename = "lorem_ipsum.txt";
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

        long startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes)
            outputStringBuilder.append((char)b);
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
