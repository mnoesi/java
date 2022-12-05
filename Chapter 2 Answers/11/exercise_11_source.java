import java.util.*;

public class Program {
    public static void main(String a[]){
        int eggs;
        int dozen;
        int single;
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter Eggs: "); eggs = input.nextInt();
        dozen = eggs / 12;
        single = eggs % 12;

        System.out.print("\n" + dozen + " Dozen Eggs x $" + 3.25 + ":\t$" + (dozen * 3.25));
        System.out.print("\n" + single + " Eggs x $" + 0.45 + ":\t\t\t$" + (single * 0.45));
        System.out.print("\n-----------------------------");
        System.out.print("\nTotal:\t\t\t\t\t$" + ((dozen * 3.25 ) + (single * 0.45)));
    }
}