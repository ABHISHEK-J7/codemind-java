import java.util.*;
public class abhi{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int c = s.nextInt();
        int b = s.nextInt();
        int d = 512*b;
        int x = d*c;
        int y = x*t;
        int z = 2*y;
        System.out.printf("%d",z);
    }
}