package tpfinals5;
public class TPFinals5 {
    public static void main(String[] args) {
       LaunchPage launchPage = new LaunchPage();
       
       
       patient[] p = new patient[100];
       
       int i;
        for (i = 0; i < 100; i++)
            p[i] = new patient();

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
    }
    
}
