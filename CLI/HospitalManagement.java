package tpfinals;
import java.util.*;

public class HospitalManagement extends staff{
    public static void main(String args[]){

        int mm1 = 4, mm2 = 4, mm3 = 4, mm4 = 4, mm5 = 4;
        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println("              *** Welcome to Hospital Management System ***");
        System.out.println("------------------------------------------------------------------------------------");
        
        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        lab[] l = new lab[20];
        facility[] f = new facility[20];
        medical[] m = new medical[100];
        staff[] s = new staff[100];
        
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctor();
        for (i = 0; i < 100; i++)
            p[i] = new patient();
        for (i = 0; i < 20; i++)
            l[i] = new lab();
        for (i = 0; i < 20; i++)
            f[i] = new facility();
        for (i = 0; i < 100; i++)
            m[i] = new medical();
        for (i = 0; i < 100; i++)
            s[i] = new staff();

        d[0].did = "16";
        d[0].dname = "Dr.Gonzales";
        d[0].specilist = "ENT";
        d[0].appoint = "6-10AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 20;
        
        d[1].did = "25";
        d[1].dname = "Dr.Concepcion";
        d[1].specilist = "Physician";
        d[1].appoint = "9-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 46;
        
        d[2].did = "10";
        d[2].dname = "Dr.Agoncillo";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].droom = 4;
        
        d[3].did = "51";
        d[3].dname = "Dr.Bagulaya";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 32;

        p[0].pid = "32";
        p[0].pname = "Nataniel";
        p[0].disease = "Cancer";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 40;
        
        p[1].pid = "05";
        p[1].pname = "Eric";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 10;
        
        p[2].pid = "14";
        p[2].pname = "Abdul";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 38;
        
        p[3].pid = "38";
        p[3].pname = "Freddy";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 48;

        m[0].med_name = "Amoxicillin";
        m[0].exp_date = "7-18-2023";
        m[0].med_cost = 100;
        m[0].count = 8;
        
        m[1].med_name = "Viagra";
        m[1].exp_date = "9-28-2023";
        m[1].med_cost = 500;
        m[1].count = 5;
        
        m[2].med_name = "Methadone";
        m[2].exp_date = "7-10-2023";
        m[2].med_cost = 200;
        m[2].count = 59;
        
        m[3].med_name = "Cephalexin";
        m[3].exp_date = "5-17-2023";
        m[3].med_cost = 1100;
        m[3].count = 100;

        l[0].facility = "X-ray     ";
        l[0].lab_cost = 500;
        
        l[1].facility = "CT Scan   ";
        l[1].lab_cost = 1500;
        
        l[2].facility = "OR Scan   ";
        l[2].lab_cost = 1600;
        
        l[3].facility = "Blood Bank";
        l[3].lab_cost = 50;

        f[0].fac_name = "Ambulance";
        f[1].fac_name = "Admit Facility ";
        f[2].fac_name = "Canteen";
        f[3].fac_name = "Emergency";

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1;
        while (status == 1){
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("                                    MAIN MENU");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("       1.Doctors  2. Patients  3.Medicines  4.Laboratories  5. Facilities  ");
            System.out.println("------------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice){
                case 1:{
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                             **DOCTOR SECTION**");
                        System.out.println("------------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1){
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1){
                                case 1:{
                                        d[mm1].new_doctor();mm1++;
                                        break;
                                    }
                                case 2:{
                                        System.out.println("------------------------------------------------------------------------------------");
                                        System.out.println("ID \t Name\t    Specilist \t        Timing \t       Qualification \t    Room No.");
                                        System.out.println("------------------------------------------------------------------------------------");
                                        for (j = 0; j < mm1; j++){
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                
                case 2:{
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                             **PATIENT SECTION**");
                        System.out.println("------------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1){
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            
                            switch (c1){
                                case 1:{
                                        p[mm2].new_patient();mm2++;
                                        break;
                                    }
                                case 2:{
                                        System.out.println("------------------------------------------------------------------------------------");
                                        System.out.println("ID \t Name \t       Disease \t        Gender \t  Admit Status \t     Age");
                                        System.out.println("------------------------------------------------------------------------------------");
                                        for (j = 0; j < mm2; j++) {
                                            p[j].patient_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }
                
                case 3:{
                        s3 = 1;
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                            **MEDICINE SECTION**");
                        System.out.println("------------------------------------------------------------------------------------");
                        while (s3 == 1){
                            System.out.println("1.Add New Entry\n2. Existing Medicines List");
                            c1 = input.nextInt();
                            switch (c1){
                                case 1:{
                                        m[mm3].new_medi();mm3++;
                                        break;
                                    }
                                case 2:{
                                        System.out.println("------------------------------------------------------------------------------------");
                                        System.out.println("Name    \tExpiry Date  \tCost");
                                        System.out.println("------------------------------------------------------------------------------------");
                                        for (j = 0; j < mm3; j++) {
                                            m[j].find_medi();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }
                
                case 4:{
                        s4 = 1;
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                          **LABORATORY SECTION**");
                        System.out.println("------------------------------------------------------------------------------------");
                        
                        while (s4 == 1){
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                            c1 = input.nextInt();
                            switch (c1){
                                case 1:{
                                        l[mm4].new_faci();mm4++;
                                        break;
                                    }
                                case 2:{
                                        System.out.println("------------------------------------------------------------------------------------");
                                        System.out.println("Facilities\t\tCost");
                                        System.out.println("------------------------------------------------------------------------------------");
                                        for (j = 0; j < mm4; j++) {
                                            l[j].faci_list();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }
                
                case 5:{
                        s5 = 1;
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                        **HOSPITAL FACILITY SECTION**");
                        System.out.println("------------------------------------------------------------------------------------");
                        while (s5 == 1){
                            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                            c1 = input.nextInt();
                            switch (c1){
                                case 1:{
                                        f[mm5].add_faci();mm5++;
                                        break;
                                    }
                                case 2:{
                                        System.out.println("------------------------------------------------------------------------------------");
                                        System.out.println("                              Hospital Facilities");
                                        System.out.println("------------------------------------------------------------------------------------");
                                        for (j = 0; j < mm5; j++) {
                                            f[j].show_faci();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s5 = input.nextInt();
                        }
                        break;
                    }
                
                default:{
                        System.out.println("You Have Enter Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
            System.out.println(" ");
        }
    }
}