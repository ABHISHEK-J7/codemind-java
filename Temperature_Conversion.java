import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        double Temp = (32+(X*1.8));
        System.out.printf("%.2f",Temp);
    }
}