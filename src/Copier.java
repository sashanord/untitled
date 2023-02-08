import java.io.*;

public class Copier{
    String fileFrom;
    String fileTo;
    public Copier(String fileFrom, String fileTo) {
        this.fileFrom = fileFrom;
        this.fileTo = fileTo;
    }

    public void copy() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileFrom));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileTo))) {
            String line = reader.readLine();
            if (line != null){
                writer.write(line);
            } else System.out.println("Сорри, файл пустой :(");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}