import java.util.*;
public class Number_Pattern_Count11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count =1;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }
}
