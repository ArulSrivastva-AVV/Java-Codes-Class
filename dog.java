import java.util.Scanner;

public class dog {
    
    
    String name;
    String color;
    int X;
    int ch;
    

    public static void main(String[] args) {
        
        dog myDog = new dog();
        String a;
        String b;
        Scanner in = new Scanner(System.in);
        
        a=in.nextLine();
        myDog.name = a;
        b=in.nextLine();
        myDog.color = b;
         myDog.ch=in.nextInt();

        in.close();

        System.out.println("My dog's name is " + myDog.name + " and its color is " + myDog.color + ".");

    }
    
}