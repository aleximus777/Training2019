package homework12.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.TreeMap;

public class Runtime {

    public static void main(String[] args) throws IOException {
        File file = Paths.get("src", "poem.txt").toFile();
        File outputFile = Paths.get("src", "poemLetters.txt").toFile();
        TreeMap<Character, Integer> map = FileHandler.calculateLetters(file);
        FileHandler.writeToFile(outputFile, map);
    }
}
