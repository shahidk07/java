import java.io.*;

class Demo {

    static void check() throws IOException {
        throw new IOException("File Error");
    }
    public static void main(String args[]) {

        try {
       
            check();
        }

        catch(IOException e) {
            System.out.println(e);
        }
    }
}