import java.util.Scanner;
class Voters{
public static void main(String[] args){
Scanner Scan = new Scanner(System.in);
int age=Scan.nextInt();
if(age>=18)
  System.out.println("You are eligible to vote.");
else
  System.out.println("You are not eligible to vote.");
}
}