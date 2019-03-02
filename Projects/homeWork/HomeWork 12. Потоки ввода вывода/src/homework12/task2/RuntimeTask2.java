package homework12.task2;

import homework12.task1.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class RuntimeTask2 {

    public static void main(String[] args) throws IOException {
        File file = Paths.get("src", "randomIntegers.txt").toFile();
        FileHandler.generateFile(file);
        FileHandler.sortUniqueIntegers(file);
    }
}
