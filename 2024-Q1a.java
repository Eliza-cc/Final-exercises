package pkgfinal.pkg24;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int x, p, n, z;
        String c;
        p=0;
        n=0;
        z=0;
        
        while (true){
            c = k.next();
            if (c.equalsIgnoreCase("X")){
                break;
            }
            try {
                x = Integer.parseInt(c);
                if (x==0){
                    z++;
                }
                else if (x>0){
                    p++;
                }
                else{
                    n++;
                }
            } catch(NumberFormatException e){       //这步是都是这么写的吗
                System.out.println("Invalid input.");
            }
            
        }
        System.out.println(p+" "+n+" "+z);
    }
}

/*
注释里是自己先写的，上面是修改后的
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int x, p, n, z;
        String c;
        p=0;
        n=0;
        z=0;
        do {
            c = k.next();
            if (c=="X") {
                break;
            }
            x = k.nextInt();
            if (x==0){
                z++;
            }
            else if (x>0){
                p++;
            }
            else{
                n++;
            }
            
        } while (c!="X");
        System.out.println(p+" "+n+" "+z);
    }
}
*/
