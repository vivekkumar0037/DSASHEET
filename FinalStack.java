import java.util.*;
import java.util.Scanner;
public class FinalStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        System.out.println(st+ " "+st.size());
        System.out.println(st.pop()+" "+st.size());

    }
}
