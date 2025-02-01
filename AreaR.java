import java.util.Scanner;
public  class AreaR{
public static void main(String[] args){
Scanner  s =  new Scanner
System.out.println("Enter the length:");
int L = s.nextInt();
System.out.println("Enter the breadth:");
int B = s.nextInt();
int sum  =  L*B;
System.out.println("The area of rectangle is :"+sum);
s.close();
} }