import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("./Files/TextFile.txt"));
            //br.write("Writing to a text file");
            

            BufferedReader reader = new BufferedReader(new FileReader("E:/Visual_Studio/Questions.txt"));
            String line;
            while((line = reader.readLine()) != null){
                //System.out.println(line);
                br.write(line+"\n");
            }
            reader.close();br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
