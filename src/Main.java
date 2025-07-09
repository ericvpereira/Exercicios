import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
        
        int a = ler.nextInt();
        int m = ler.nextInt();
        
        int b = (m * 2) - a;
        
        System.out.println(b);
        
        ler.close();
 
    }
 
}