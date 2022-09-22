import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String line;
        String readText = "";
        System.out.print("Введите путь к файлу: ");
        String path = in.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        while ((line = br.readLine()) != null) {
                readText += line;
        }
        String symbols = "Всего символов в тексте " + readText.length();
        String space = "Всего символов в тексте без пробелов " + readText.replaceAll(" ", "").length();
        String words = "Всего слов в тексте " + readText.split(" ").length;
        System.out.println(symbols + "\n" + space + "\n" + words + "\n");
        FileWriter fileWriter = new FileWriter("outputText.txt");
        fileWriter.write(symbols + "\n");
        fileWriter.write(space + "\n");
        fileWriter.write(words + "\n");
        fileWriter.flush();
    }
}