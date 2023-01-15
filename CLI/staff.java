package tpfinals;
import java.util.Scanner;

public class staff extends doctor{
    String sid, sname, desg, sex;
    int salary;
    
    void new_staff(){
        Scanner input = new Scanner(System.in);
        System.out.print("Staff ID: ");
        sid = input.nextLine();
        System.out.print("Name of Staff: ");
        sname = input.nextLine();
        System.out.print("Designation: ");
        desg = input.nextLine();
        System.out.print("Sex: ");
        sex = input.nextLine();
        System.out.print("Salary: ");
        salary = input.nextInt();
    }
    
    void staff_info(){
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
    }
}

