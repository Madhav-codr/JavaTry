 import java.util.Scanner;
/**
 Name - Madhav Goel
 Class - 9th - B
 Roll no. - 26
 Subject - Computer Applications
 */
public class HomeWork2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double a, b, c, s, perimeter, area ;
        System.out.println("Enter the sides of the triangle : ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        perimeter = (a+b+c);
        System.out.println("Perimeter :" + perimeter);
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area :" + area);
    
    }
}
