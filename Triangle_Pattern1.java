import java.util.*;
public class Triangle_Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
