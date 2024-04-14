import java.util.Scanner;
public class Simplearraysum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int sum =0;
        for(int i =0;i<n;i++){
            ar[i] =sc.nextInt();
            sum = sum+ar[i];

        }
        System.out.println(sum);
        sc.close();
    }

}
