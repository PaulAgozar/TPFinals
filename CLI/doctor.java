package tpfinals;
import java.util.Scanner;

public class doctor extends patient{
    String did, dname, specilist, appoint, doc_qual;
    int droom;
    
    void new_doctor(){
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
    
    void doctor_info(){
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t     " + droom);
    }
}
