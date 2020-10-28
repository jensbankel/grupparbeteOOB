import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class OvningEtt {
     public static void main(String[] args) throws IOException {
        Path theFile = FileSystems.getDefault().getPath(args[0]);
        if (!Files.exists(theFile)) {
            System.out.println("No such file exists!");
            System.exit(-1);
        }

/*     Path theRealFile = FileSystems.getDefault().getPath(args[1]);
        if (!Files.exists(theFile)) {
            System.out.println("No such file exists!");
            System.exit(-1);
        }
        Vi ska jämföra en text inte två filer
*/ 
        Censor censor = new Censor(theFile);
   //     System.out.println("Hej hopp".split("\\s+"));

        censor.enAnnanSortsSensor("fuck bra fuck godis dick");
    }

}