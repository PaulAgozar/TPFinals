package tpfinals;
import java.util.Scanner;

public class medical extends lab{
    String med_name, exp_date;
    int med_cost, count;
    
    void new_medi(){
        Scanner input = new Scanner(System.in);
        System.out.print("Name of Medicine: ");
        med_name = input.nextLine();
        System.out.print("Expiry Date: ");
        exp_date = input.nextLine();
        System.out.print("Cost of Medicine: ");
        med_cost = input.nextInt();
        System.out.print("Quantity: ");
        count = input.nextInt();
    }
    
    void find_medi(){
        System.out.println(med_name + "    \t" + exp_date + "     \t" + med_cost);
    }
}

