import java.util.*;
public class Pythagorean_Triplets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        if(b>=max){
            max=b;
        }
         if(c>=max){
            max=c;
        }
        if(max==a){
            boolean flag=((a*a)==(b*b)+(c*c));
            System.out.println(flag);
        }
        else if(max==b){
            boolean flag=((b*b)==(c*c)+(a*a));
            System.out.println(flag);
        }
        else{
            boolean flag=((c*c)==(a*a)+(b*b));
            System.out.println(flag);
        }
    }
}
