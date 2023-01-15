package tpfinals;
import java.util.Scanner;

public class facility{
    String fac_name;
    void add_faci(){
        Scanner input = new Scanner(System.in);
        System.out.print("Name of Facility: ");
        fac_name = input.nextLine();
    }
    
    void show_faci(){
        System.out.println(fac_name);
    }
}
