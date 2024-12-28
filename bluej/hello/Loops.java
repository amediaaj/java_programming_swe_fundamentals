
/**
 * Write a description of Loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.FileResource;
public class Loops {
    public void runHello() {
        FileResource f;
        f = new FileResource("file.txt");
        for(String line : f.lines()){
            System.out.println(line);
        }
    }
}
