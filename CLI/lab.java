package tpfinals;
import java.util.Scanner;

public class lab extends facility{
    String facility;
    int lab_cost;
    void new_faci(){
        Scanner input = new Scanner(System.in);
        System.out.print("Name of New Facility: ");
        facility = input.nextLine();
        System.out.print("Cost: ");
        lab_cost = input.nextInt();
    }
    
    void faci_list(){
        System.out.println(facility + "\t\t" + lab_cost);
    }
}
