import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {           
            File myObj = new File("C:\\Java\\filename.txt");
            FileWriter w= new FileWriter(myObj);
            w.write("hi jbgrb grjgrhr rkjjr");
            w.flush();
            w.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
