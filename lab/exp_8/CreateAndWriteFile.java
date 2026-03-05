import java.io.FileWriter;
import java.io.IOException;
class CreateAndWriteFile {
 public static void main(String[] args) {
 String fileName = "sample.txt";
 String text = "Hello! This file is created by Java.\nFile handling is easy.";
 try (FileWriter fw = new FileWriter(fileName)) {
 fw.write(text);
 System.out.println("File created and written successfully: " + fileName);
 } catch (IOException e) {
 System.out.println("Error: " + e.getMessage());
 }
 }
}