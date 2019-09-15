import java.util.Scanner;
public class Planina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int num = (int) Math.pow(2, i);
        System.out.println((int) Math.pow((num+1),2));
    }
}
