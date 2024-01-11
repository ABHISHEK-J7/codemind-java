import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int c = s.nextInt();
        int b = s.nextInt();
        int d = t*c*b;
        System.out.printf("%d KB",d);
    }
}