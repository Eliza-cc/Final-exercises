
package pkgfinal.pkg19.pkg20;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("This program changes all the odd numbers in the array into even numbers.");
        Scanner s = new Scanner(System.in);
        int size = 5;
        int num[] = new int[size];
        System.out.print("Enter five integer numbers: ");
        for (int i=0; i<size; i++){
            num[i] = s.nextInt();
        }
        convert(num);
        System.out.println("The numbers are: ");
        for (int i=0; i<size; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    
    public static void convert(int[] a) {
        for (int i=0; i<a.length; i++){
            if (a[i]%2 == 1)
                a[i] +=1;
        }
    }
}

/*
1. 定义的函数不要忘了加 static ! （静态方法）
2. 输出num[i]
3. a.length！！ 没有（）
4. for循环从0开始
*/
