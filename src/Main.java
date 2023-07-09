import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
        String phoneNumber;
        while (bufferedReader.ready()){
            phoneNumber = bufferedReader.readLine();
            if (phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}")
               ||phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")) {
               System.out.println(phoneNumber);
            }
        }
    }
}

