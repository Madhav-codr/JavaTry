import java.util.Scanner;
public class Volume
{
    final static Scanner sc = new Scanner(System.in);
    public static void main (String args[])
    {
     System.out.println("Hi! I am Jarvis 1.O");
     System.out.println("I can find out the volume of following solids : \nCube\nCuboid\nCylinder\nSphere\nCone");
      while(true) {               
      System.out.println("\n");
      System.out.println("To continue to check the solution of the questions - Type \"Continue\"");
      System.out.println("To exit the program - Type \"Exit\"");
      String string = sc.next();
      String test1 = "Exit";
      String test2 = "Continue";
      int i = string.compareToIgnoreCase(test1);
      int v = string.compareToIgnoreCase(test2);
      if (i == 0){
          System.out.println("Successfully Exited.");
          System.exit(0);
        }else if (v == 0) {
          System.out.println("\n");
          System.out.print("Enter the type of solid : ");
          String solid = sc.next();
          calculate(solid);
        }
    }
  }
   public static void calculate(String solid) {
       Volume obj = new Volume();
       String solid1 = "Cube";
       String solid2 = "Cuboid";
       String solid3 = "Cylinder";
       String solid4 = "Sphere";
       String solid5 = "Cone";
       double volume = 0;
       if(solid1.compareToIgnoreCase(solid) == 0) {
           volume = obj.cube();
           System.out.println("Volume :" + volume);
       }else if(solid2.compareToIgnoreCase(solid) == 0) {
            volume = obj.cuboid();
            System.out.println("Volume :" + volume);
       }else if(solid3.compareToIgnoreCase(solid) == 0) {
            volume = obj.cylinder();
            System.out.println("Volume :" + volume);
       }else if(solid4.compareToIgnoreCase(solid) == 0) {
            volume = obj.sphere();
            System.out.println("Volume :" + volume);
       }else if(solid5.compareToIgnoreCase(solid) == 0) {
            volume = obj.cone();
            System.out.println("Volume :" + volume);
       }else {
            System.out.println("Wrong choice.");
       }              
  }
   public double cube() {
       double s = sc.nextDouble();
       System.out.print("Enter the side of cube : ");
       double volume = s*s*s;
       return volume;
  }
   public double cuboid() {
       System.out.print("Enter the length of cuboid : ");
       double l = sc.nextDouble();
       System.out.print("Enter the breadth of cuboid : ");
       double b = sc.nextDouble();
       System.out.print("Enter the height of cuboid : ");
       double h = sc.nextDouble();
       double volume = l*b*h;
       return volume;
  }
   public double cylinder() {
       System.out.print("Enter the radius of cylinder : ");
       double r = sc.nextDouble();
       System.out.print("Enter the height of cylinder : ");
       double h = sc.nextDouble();
       double volume = (22d/7)*r*r*h;
       return volume;
  }
   public double sphere() {
       System.out.print("Enter the radius of sphere : ");
       double r = sc.nextDouble();
       double volume = (4d/3)*(22d/7)*r*r*r;
       return volume;
  }
   public double cone() {
       System.out.print("Enter the radius of cone : ");
       double r = sc.nextDouble();
       System.out.print("Enter the height of cone : ");
       double h = sc.nextDouble();
       double volume = (1/3d)*(22d/7)*r*r*h;
       return volume;
  }
}
