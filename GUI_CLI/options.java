package tpfinals5;
import java.util.Scanner;
public class options extends doctors{
    String did, dname, specilist, appoint, doc_qual;
    int droom;

    options(){
        Scanner input = new Scanner(System.in);
        System.out.print("New ID: ");
        did = input.nextLine();
        System.out.print("Name of Doctor: ");
        dname = input.nextLine();
        System.out.print("Specilization: ");
        specilist = input.nextLine();
        System.out.print("Working Time: ");
        appoint = input.nextLine();
        System.out.print("Qualification: ");
        doc_qual = input.nextLine();
        System.out.print("Room No.: ");
        droom = input.nextInt();  
        
    }
    
    
}
