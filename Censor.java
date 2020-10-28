import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Censor {
    
    private Map<String, String> ettNamnMap = new HashMap<>();
    
    public Censor(Path theFile) throws IOException{
        
        try (BufferedReader reader = new BufferedReader(new FileReader(theFile.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {  //läser till det inte finns mer att läsa
                String badword = line;
                String goodWord = reader.readLine();
                ettNamnMap.put(badword, goodWord);
    //            System.out.println(badword + " " + goodWord);
            }
        }   
    }


    int count = 0;

    public String enAnnanSortsSensor(String text) {
        String[] words = text.split("\\s+"); //alla tecken som vi tycker är blanka, dela av
        for (String str : words) {
            String replaceWord = ettNamnMap.get(str); 
            if (replaceWord != null) {
                System.out.println(replaceWord);
            } else {
                System.out.println(str);
            }
        }
        /*
         * if (fult ord equals fult fuck) ändra till hej
         * 
         */
        count++;
        return text;
    }
}
