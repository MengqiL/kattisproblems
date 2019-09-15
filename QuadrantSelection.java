import java.util.Scanner;
public class QuadrantSelection {
    public static void main (String[] args) {
        System.out.println(outPut());
    }
    public static int outPut() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0) {
            if (b > 0) {
                return 1;
            }
            return 4;
        }
        if (b > 0) {
            return 2;
        }
        return 3;
    }
    
}
