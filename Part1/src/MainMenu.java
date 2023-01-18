import java.util.Scanner;

 public class MainMenu {
    static int main() {
        int n;
        Scanner in=new Scanner(System.in);

        /*1) Search Movies
        2) Search Production Companies
        3) Add Movie
        4) Exit System*/


         while(true)
        {
            System.out.println("1) Search Movies ");
            System.out.println("2) Search Production Companies");
            System.out.println("3) Add Movie");
            System.out.println("4) Exit System");
            System.out.print("Enter option :");
            n=in.nextInt();
            if(n>=1 && n<=4)
                return n;
            else
                System.out.println("Invalid choice! Please make a valid choice.\n\n");


        }
}

}






