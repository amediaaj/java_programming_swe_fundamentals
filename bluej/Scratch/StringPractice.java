
/**
 * Write a description of StringPractice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringPractice {
    void PrintString(){
        String s = "dukeprogramming";
        String x = s.substring(4,7);
        System.out.println(x);
        System.out.println(x.length());
        System.out.println(s.indexOf('g'));
        System.out.println(s.indexOf('g',8));
        System.out.println(s.startsWith("duke"));
    }
}
