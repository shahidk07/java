import java.io.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("test.txt");
        int i;
        // fr.read() reads one character
        // -1 when file ends
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }

        fr.close();

    }
}

