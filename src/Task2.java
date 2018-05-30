import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Task2 {

    public static void main(String[] args) throws IOException {
        task2("key3", "value3");
    }

    static void task2(String key, String value) throws IOException {

        HashMap<String, String> hashMapOfFile = new HashMap<>();
        Scanner scanFile = new Scanner(new File ("task2.txt"));
        Scanner keys = new Scanner(scanFile.nextLine());
        Scanner values = new Scanner(scanFile.nextLine());
        while(keys.hasNext())
            hashMapOfFile.put(keys.next(), values.next());
        hashMapOfFile.put(key, value);
        FileWriter fw = new FileWriter("task2.txt");
        fw.write(String.valueOf(hashMapOfFile.keySet() + "\n")
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
        );
        fw.write(String.valueOf(hashMapOfFile.values() + "\n")
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
        );
        fw.close();
    }
}
