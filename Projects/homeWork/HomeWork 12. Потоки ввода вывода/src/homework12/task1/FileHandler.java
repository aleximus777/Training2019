package homework12.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public final class FileHandler {

    private static Random rnd = new Random();
    private static final int QUANTITY_OF_INTEGERS = 100;
    private static final int BOUND_OF_INTEGERS = 100;

    public static TreeMap<Character, Integer> calculateLetters(File file) throws IOException {
        BufferedReader inpStream = new BufferedReader(new FileReader(file));
        String line;
        String currentSymbol;
        TreeMap map = new TreeMap<Character, Integer>();

        line = inpStream.readLine();
        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                currentSymbol = line.substring(i, i + 1).toLowerCase();
                if (currentSymbol.matches("^[а-яёЁ]")) {
                    map.putIfAbsent(currentSymbol, 1);
                    if (map.containsKey(currentSymbol)) {
                        map.put(currentSymbol, (Integer) map.get(currentSymbol) + 1);
                    }
                }
            }
            line = inpStream.readLine();
        }
        inpStream.close();

        return map;
    }

    public static void writeToFile(File file, TreeMap<Character, Integer> map) throws IOException {
        BufferedWriter outStream = new BufferedWriter(new FileWriter(file));
        String content = map.toString().replace(",", System.lineSeparator()).replace("=", " - ");
        outStream.write(content);
        outStream.flush();
        outStream.close();
    }

    public static String getRandom() {
        Integer digit = rnd.nextInt(BOUND_OF_INTEGERS);
        return digit.toString();
    }

    public static void generateFile(File file) throws IOException {
        StringBuffer str = new StringBuffer();
        BufferedWriter outStream = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < QUANTITY_OF_INTEGERS; i++) {
            str.append(getRandom());
            str.append(System.lineSeparator());
        }
        outStream.write(str.toString());
        outStream.flush();
        outStream.close();
    }

    public static void sortUniqueIntegers(File file) throws IOException {
        BufferedReader inpStream = new BufferedReader(new FileReader(file));
        String line;
        int currentDigit;
        TreeSet treeSet = new TreeSet<Integer>();

        line = inpStream.readLine();
        while (line != null) {
            currentDigit = Integer.parseInt(line);
            treeSet.add(currentDigit);
            line = inpStream.readLine();
        }
        inpStream.close();
        BufferedWriter outStream = new BufferedWriter(new FileWriter(file));
        file.createNewFile();
        outStream.write(treeSet.toString().replace(",", System.lineSeparator()).replace("[", "").replace("]", "").replace(" ", ""));
        outStream.flush();
        outStream.close();
    }
}
