package linearDataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class size {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String path = "D:\\Softuni" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\Exercises Resources";

        File files = new File(path);
        int sum = 0;
        for (File file : files.listFiles()) {
            sum += file.length();

        }
        System.out.println("Folder size: " + sum);
    }
}
