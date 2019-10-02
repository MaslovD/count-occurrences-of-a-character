package io.dmitr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        // String inputString = "";

        byte[] fileContent = Files.readAllBytes(Paths.get("test.data"));
        int[] tempArray = new int[256];

        long start = System.currentTimeMillis();

        for (int i = 0; i <= fileContent.length - 1; i++) {
            int asciiCode = fileContent[i];
            tempArray[asciiCode] = ++tempArray[asciiCode];
        }

        for (int i = 0; i <= tempArray.length - 1; i++) {
            if (tempArray[i] > 1)
                System.out.println(
                        new StringBuilder(
                                String.valueOf((char) i))
                                .append("-")
                                .append(tempArray[i])
                );
        }

        System.out.println(System.currentTimeMillis() - start);
    }
}
