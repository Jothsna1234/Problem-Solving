import java.io.*;
import java.math.*;
import java.util.Scanner;
public class Grading{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]grades=new int[n];
        for(int i=0;i<n;i++){
            grades[i]=sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            int grade = grades[i];
            if (grade >= 38) {
                int nextMultipleOf5 = ((grade / 5) + 1) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    grades[i] = nextMultipleOf5;
                }
            }
            System.out.println(grades[i]);

        }
    }
}
