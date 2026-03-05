import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class CopyFileUsingArgs {
 public static void main(String[] args) {
 if (args.length < 2) {
 System.out.println("Usage: java CopyFileUsingArgs <sourceFile> <destFile>");
 return;
 }
 String source = args[0];
 String dest = args[1];
 try (FileInputStream fis = new FileInputStream(source);
 FileOutputStream fos = new FileOutputStream(dest)) {
 byte[] buffer = new byte[4096];
 int bytesRead;
 while ((bytesRead = fis.read(buffer)) != -1) {
 fos.write(buffer, 0, bytesRead);
 }
 System.out.println("Copied data from " + source + " to " + dest);
 } catch (IOException e) {
 System.out.println("Error: " + e.getMessage());
 }
 }
}