import java.util.Scanner;
/**
 Name - Madhav Goel
 Class - 9th B
 Roll no. - 26
 Subject - Computer Applications
 */
public class HomeWork3
{
    final static Scanner sc = new Scanner(System.in);
    
    //question - 1
    public void timePeriod() {
        double length, gravity, Time;
        System.out.println("Enter the length :");
        length = sc.nextDouble();
        System.out.println("Enter the value of acceleration due to gravity :");
        gravity = sc.nextDouble();
        Time = 2*(22/7)*Math.sqrt(length/gravity);
        System.out.println("Time Period : " + Time);
    }
    
    //question - 2
    public void gross_Net() {
        int basic;
        double da,hra,pf,gp,np;
        System.out.println("Enter basic salary");
        basic = sc.nextInt();
        da = basic*30/100d;
        hra = basic*15/100d;
        pf=basic*12.5/100d;
        gp = basic + da + hra;
        np = gp - pf;
        System.out.println("Gross pay Rs."+gp); 
        System.out.println("Net pay Rs."+np);
    }
    
    //question - 3
    public void amount(){
        System.out.println("Enter the Printed price :");
        int price =sc.nextInt();
        double discount = 10/100d * price ;
        double gst = 6/100d * discount ;
        double amount = price - discount + gst;
        System.out.println("Amount : " + amount);
    }
    
    //question - 4
    public void discounts() {
        System.out.println("Enter the price of article :");
        int price = sc.nextInt();
        double discount1 = price*30/100d;
        double discount2 = (1-20/100d)*(1-10/100d)*price;
        System.out.println("Discount by Shopkeeper1 : " + discount1);
        System.out.println("Discount by Shopkeeper2 : " + discount2);
    }
        
    //question - 5
    public void intrests() {
        System.out.print("Principle = ₹");
        double principle = sc.nextInt();
        double rate = 5d;
        for(int i = 1; i<=3;  i++){
            double intrest = principle *(Math.pow((1 + rate / 100d), i));
            System.out.println("Intrest for " + i + " year: " + intrest);
        }
    }
    
    public static void main (String args[])
    {
        while(true) {
        System.out.println("Enter Question number :");
        int n = sc.nextInt();
        HomeWork3 ques = new HomeWork3();
        if(n == 1){
            ques.timePeriod();
        }else if(n == 2){
            ques.gross_Net();
        }else if(n == 3){
            ques.amount();
        }else if(n == 4){
            ques.discounts();
        }else if(n == 5){
            ques.intrests();
        }else { 
            System.out.println("Available from Ques. 1 to 5");
        }
     }
   }
}
