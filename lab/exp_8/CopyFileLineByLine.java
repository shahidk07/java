import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class CopyFileLineByLine {
 public static void main(String[] args) {
 String source = "source.txt";
 String dest = "destination.txt";
 try (BufferedReader br = new BufferedReader(new FileReader(source));
 BufferedWriter bw = new BufferedWriter(new FileWriter(dest))) {
 String line;
 while ((line = br.readLine()) != null) {
 bw.write(line);
 bw.newLine();
 }
 System.out.println("Copied line-by-line from " + source + " to " + dest);
 } catch (IOException e) {
 System.out.println("Error: " + e.getMessage());
 }
 }
}