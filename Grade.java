import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>90){
            System.out.println("Excellent");
        }
        else if(marks>80 &&marks<=90){
            System.out.println("Good");
        }
        else if(marks>70 && marks<=80){
            System.out.println("Fair");
        }
        else if(marks>60 && marks<=70){
            System.out.println("Meet Expectation");
        }
        else{
            System.out.println("Below Par");
        }
    }
}
