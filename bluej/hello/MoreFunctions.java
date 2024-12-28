
/**
 * Write a description of MoreFunctions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoreFunctions {
    int f(int x, int y) {
        if(x < y) {
            System.out.println("x < y");
            return y + x;
        } else {
            System.out.println("x >= y");
            if(x > 8) {
                return y + 7;
            }
        }
        
        return x-2;
    }
    
    int g() {
        int a = f(3, 4);
        int b = f(a,5);
        return b;
    }

}
