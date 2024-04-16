import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Timeconversion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        SimpleDateFormat inputDate=new  SimpleDateFormat  ("hh:mm:ssa");
        SimpleDateFormat outputDate= new  SimpleDateFormat("HH:mm:ss");
        try{
            Date inputFormat=inputDate.parse(s) ;
            String result=outputDate.format(inputFormat);
            System.out.println(result);
        }catch(ParseException e){
            System.out.println("Invalid input Format");
        }

    }
}