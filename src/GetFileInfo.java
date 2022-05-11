import java.io.File;
import java.io.IOException;

public class GetFileInfo {
    public static void main(String[] args) throws IOException {
        File f = new File("example.txt");
        if (f.exists()){
            System.out.println(f.canExecute());
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
            System.out.println(f.getAbsoluteFile());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getCanonicalFile());
            System.out.println(f.getName());
            System.out.println(f.length());
        }
    }
}
