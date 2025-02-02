
package pkgfinal.pkg24;
import java.util.Scanner;

public class Q1b {
    public static void main(String[] args) {
        
        int n;
        double sum=0.0;
        Scanner k = new Scanner(System.in);
        n = k.nextInt();
        for (int i=1; i<=n; i++){
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}

/*
public class Q1b {
    public static void main(String[] args) {
        
        int n;
        double sum=0.0;
        Scanner k = new Scanner(System.in);
        n = k.nextInt();
        for (int i=1; i<=n; i++){
            sum += 1/i;
        }
        System.out.println(sum);
    }
}

*/
