import java.util.*;

public class Program {
    public static void main(String[] a){
        int adult;
        int children;
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter Adult Meals: ");
        adult = input.nextInt();
        System.out.print("\nEnter Children's Meals: ");
        children = input.nextInt();

        System.out.print("\n" + adult + " Adult Meals x $" + 7 + ":\t\t\t$ " + (adult * 7));
        System.out.print("\n" + children + " Children's Meals x $" + 4 + ":\t$ " + (children * 4));
        System.out.print("\n---------------------------------");
        System.out.print("\nTotal:\t\t\t\t\t\t$ " + ((adult * 7) + (children * 4)));
    }
}