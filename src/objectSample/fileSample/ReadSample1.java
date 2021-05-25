package objectSample.fileSample;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


//テキストファイルの読み込みその１
class ReadSample1 {
    public static void main(String[] args) {
        Path path = Paths.get("src","objectSample","fileSample","input.csv");

        try {
            //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#readAllLines(java.nio.file.Path)
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String line:lines) System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
