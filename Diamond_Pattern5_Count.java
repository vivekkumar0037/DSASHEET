import java.util.*;
public class Diamond_Pattern5_Count {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=n/2;
        int star=1;
        for(int i=0; i<n; i++) {
            System.out.println(space + " " + star);
            if (i < n/2) {
                space--;
                star += 2;
            }
            else{
                space++;
                star-=2;
            }
        }
    }
}
