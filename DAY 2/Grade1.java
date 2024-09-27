import java.util.Scanner;
public class Grade1{
       public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            int score=input.nextInt();
            if(score>=90) {
                   System.out.println("Grade A");
            }
            else if(score>=80 && score<=90) {
                  System.out.println("Grade B");
            }else if(score>=70 && score<=80) {
                  System.out.println("Grade C");
            }else if(score>=60 && score<=70) {
                  System.out.println("Grade D");
            }else{
                  System.out.println("Fail");
            }
        }
}