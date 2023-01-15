package tpfinals5;

import java.util.Scanner;

class patient{
    String pid, pname, disease, sex, admit_status;
    int age;
    void new_patient(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("ID of Patient: ");
        pid = input.nextLine();
        System.out.print("Name of Patient: ");
        pname = input.nextLine();
        System.out.print("Disease: ");
        disease = input.nextLine();
        System.out.print("Sex: ");
        sex = input.nextLine();
        System.out.print("Admit Status: ");
        admit_status = input.nextLine();
        System.out.print("Age: ");
        age = input.nextInt();
    }
}
