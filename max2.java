import java.util.Scanner;
 class max2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two number");
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y)
            {
                System.out.println(x+" is Grater ");
            }
            else if(x<y)
            {
                System.out.println(y+" is grater");
            }
        };
    };
};