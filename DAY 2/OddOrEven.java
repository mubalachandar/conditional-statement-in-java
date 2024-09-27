import java.util.Scanner;
class OddOrEven{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
if(n%2==0)
{
System.out.println("Even");
}
else
{
System.out.println("Odd");
}
scan.close();
}
}