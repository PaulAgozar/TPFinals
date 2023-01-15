package tpfinals5;
class doctor2 {
    String did, dname, specilist, appoint, doc_qual;
    int droom;
        
    void new_doctor2(){
        doctor2[] d = new doctor2[25];

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
    }
}

