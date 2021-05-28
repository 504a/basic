package objectSample.fileSample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//ファイルの存在確認
class FileExistsSample {
    public static void main(String[] args) {
        Path existsFile = Paths.get("src","objectSample","fileSample","base.txt");
        Path notExistsFile = Paths.get("src","objectSample","fileSample","copy.txt");

        System.out.println(Files.exists(existsFile));//true
        System.out.println(Files.exists(notExistsFile));//false

        System.out.println(Files.notExists(existsFile));//false
        System.out.println(Files.notExists(notExistsFile));//true

    }
}
