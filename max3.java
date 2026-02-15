import java.util.Scanner;
public class max3 {
    public static void main(String[] args) {
        try(Scanner s1=new Scanner(System.in)){
            System.out.print("Enter 3 Number:");
            int x=s1.nextInt();
            int y=s1.nextInt();
            int z=s1.nextInt();
            if(x>=y &&  x>z){
                System.err.println(x +" is Grater");
            }
            else if(y>=x && y>z){
                System.out.println(y +" is Grater");
            }
            else if(z>x && z>y){
                System.out.println(z +" is Grater");
            }
            else{
                System.out.println("all are Equal");
            };
        };
    };
};
