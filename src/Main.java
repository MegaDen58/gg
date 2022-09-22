import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String line;
        String readText = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("inputText.txt")));
        while ((line = br.readLine()) != null) {
                readText += line;
        }
        String symbols = "Всего символов в тексте " + readText.length();
        String space = "Всего символов в тексте без пробелов " + readText.replaceAll(" ", "").length();
        String words = "Всего слов в тексте " + readText.split(" ").length;
        System.out.println(symbols + "\n" + space + "\n" + words + "\n");
        FileWriter fileWriter = new FileWriter("outputText.txt");
        fileWriter.write(symbols);
        fileWriter.write(space);
        fileWriter.write(words);
    }
}