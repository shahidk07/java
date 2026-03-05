import java.io.File;
class RenameFile {
 public static void main(String[] args) {
 File oldFile = new File("sample.txt");
 File newFile = new File("renamed_sample.txt");
 if (!oldFile.exists()) {
 System.out.println("Old file does not exist: sample.txt");
 return;
 }
 boolean ok = oldFile.renameTo(newFile);
 System.out.println(ok ? "File renamed successfully." : "File rename failed.");
 }
}