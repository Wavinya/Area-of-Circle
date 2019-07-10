import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String args[]){
    System.out.println("Input your radius here");
    
    double a;
    Scanner s = new Scanner(System.in);
    
    a = s.nextDouble();
    System.out.println("The radius is: "+a);
    
    double b;
    b=((22*a*a)/(7));
    System.out.println("The area is: "+b);
    
    
    }
}
