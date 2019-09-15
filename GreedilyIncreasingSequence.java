import java.util.Scanner;
import java.util.ArrayList;

public class GreedilyIncreasingSequence{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int num = sc.nextInt();
            int[] arr=new int[num];
            int count=1;

            ArrayList<Integer> result=new ArrayList<Integer>();

            for(int i=0;i<num;i++){
                arr[i]=sc.nextInt();
            }

            int i=0;
            result.add(arr[0]);

            for(int j=1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    count++;
                    i=j;
                    result.add(arr[j]);
                }
            }


            System.out.println(count);
            for(int k=0;k<result.size();k++){
                System.out.print(result.get(k)+" ");
            }




        }

    }

}