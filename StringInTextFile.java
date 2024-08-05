import java.io.*;

public class StringInTextFile {
    public static void main(String[] args) {
        String filePath = "path_to_your_file.txt";
        String searchString = "your_search_string";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                if (line.contains(searchString)) {
                    System.out.println("Line " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
