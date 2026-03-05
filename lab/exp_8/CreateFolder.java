import java.io.File;
class CreateFolder {
 public static void main(String[] args) {
 File folder = new File("MyFolder");
 if (folder.exists()) {
 System.out.println("Folder already exists.");
 } else {
 boolean created = folder.mkdir();
 System.out.println(created ? "Folder created." : "Failed to create folder.");
 }
 }
}