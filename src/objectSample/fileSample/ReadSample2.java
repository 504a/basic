package objectSample.fileSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//テキストファイルの読み込みその２
class ReadSample2 {
    public static void main(String[] args) {
        Path path = Paths.get("src","objectSample","fileSample","input.csv");

        try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
