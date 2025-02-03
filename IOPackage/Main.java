import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Main {
    public static void main(String[] args) {
        //Path filePath = Paths.get("./Data.txt");
        try (BufferedReader br = new BufferedReader(new FileReader("./Data.txt"))) {//Files.newBufferedReader(filePath)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
