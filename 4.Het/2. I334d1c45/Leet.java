import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Leet {

    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
    
    static String translator(String text) {
        if (text.contains("a")) {
            text = text.replace("a","4");
        }
        if (text.contains("b")) {
            text = text.replace("b","8");
        }
        if (text.contains("c")) {
            text = text.replace("c","<");
        }
        if (text.contains("d")) {
            text = text.replace("d","|)");
        }
        if (text.contains("e")) {
            text = text.replace("e","3");
        }
        if (text.contains("f")) {
            text = text.replace("f","|=");
        }
        if (text.contains("g")) {
            text = text.replace("g","9");
        }
        if (text.contains("h")) {
            text = text.replace("h","#");
        }
        if (text.contains("i")) {
            text = text.replace("i","1");
        }
        if (text.contains("j")) {
            text = text.replace("j","_|");
        }
        if (text.contains("k")) {
            text = text.replace("k","|<");
        }
        if (text.contains("l")) {
            text = text.replace("l","|_");
        }
		if (text.contains("m")) {
            text = text.replace("m","|\\/|");
        }
        if (text.contains("n")) {
            text = text.replace("n","|\\|");
        }
        if (text.contains("o")) {
            text = text.replace("o","0");
        }
        if (text.contains("p")) {
            text = text.replace("p","|2");
        }
        if (text.contains("q")) {
            text = text.replace("q","(,)");
        }
        if (text.contains("r")) {
            text = text.replace("r","|?");
        }
        if (text.contains("s")) {
            text = text.replace("s","$");
        }
        if (text.contains("t")) {
            text = text.replace("t","7");
        }
		if (text.contains("u")) {
            text = text.replace("u","|_|");
        }
        if (text.contains("v")) {
            text = text.replace("v","\\/");
        }
        if (text.contains("w")) {
            text = text.replace("w","\\/\\/");
        }
        if (text.contains("x")) {
            text = text.replace("x","><");
        }
        if (text.contains("y")) {
            text = text.replace("y","´/");
        }
        if (text.contains("z")) {
            text = text.replace("z","2");
        }
        return text;      
    }
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kérem a fálj nevét: ");
        String fileName = scanner.nextLine();
        String fullFileContents = readFile(fileName,StandardCharsets.UTF_8);  
        System.out.println("File beolvasva.");
        fullFileContents = fullFileContents.toLowerCase();
        fullFileContents = translator(fullFileContents);
        System.out.println("File lefordítva.");
        
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        writer.print(fullFileContents);
        writer.close();
        System.out.println("A fordított szöveg az output.txt-ben megtalálható.");
        
        scanner.close();
    }
    
}