package design_patterns.structural_patterns.decorator;

import java.io.*;

public class DecoratorEverydayDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.write("xiaomi redmi 4 pro miui 9".getBytes());

        bufferedOutputStream.close();
        outputStream.close();
    }
}
