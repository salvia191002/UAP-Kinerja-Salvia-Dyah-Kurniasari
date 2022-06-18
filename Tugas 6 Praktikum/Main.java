package inheritance;
import java.util.ArrayList;

public class Main {
    private static Manusia manusia[];
    private static MahasiswaFilkom mahasiswaFilkom[];
    private static Pekerja pekerja[];
    private static Manajer manajer[];
    
    public static void main(String [] args){
        manusia = new Manusia [3];
        mahasiswaFilkom = new MahasiswaFilkom[3];
        pekerja = new Pekerja[3];
        manajer = new Manajer[3];
        System.out.println("----------------------------------------------------");
        System.out.println("        DATA PROFESI FILKOM FT BIKINI BOTTOM        ");
        System.out.println("----------------------------------------------------");
        System.out.println("=================== DATA MANUSIA ===================");
        manusia [0] = new Manusia("Ria Ricis", "2457890123", false, true);
        manusia [1] = new Manusia("Atta Halilintar", "7889082382", true, true);
        manusia [2] = new Manusia("Aurel Hermansyah","1283937791", false, false);
        System.out.println(manusia[0].toString()); 
        System.out.println(manusia[1].toString()); 
        System.out.println(manusia[2].toString());
        System.out.println("================== DATA MAHASISWA ==================");
        mahasiswaFilkom [0] = new MahasiswaFilkom("Raffi Ahmad", "678906271808", true, false, "215150601111006", 3.75);
        mahasiswaFilkom [1] = new MahasiswaFilkom("Nessie Judge","987682917190", false, true, "205150711110018", 3.50);
        mahasiswaFilkom [2] = new MahasiswaFilkom("Baim Wong", "127809682332", true, false, "195150401110028", 3.20); 
        System.out.println(mahasiswaFilkom[0].toString());
        System.out.println(mahasiswaFilkom[1].toString());
        System.out.println(mahasiswaFilkom[2].toString());
        System.out.println("==================== DATA PEKERJA ==================");
        pekerja [0] = new Pekerja(7, 22, "198720472888", "Nadia Omara",    "367788972", false, false);
        pekerja [1] = new Pekerja(8, 30, "715719859010", "Nagita Slavina", "368282008", false, true);
        pekerja [2] = new Pekerja(5, 15, "696102439283", "Jessica Jane",   "309376388", false, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());
        System.out.println("==================== DATA MANAJER ==================");
        manajer [0] = new Manajer(12, 25, "287369937937", "Iis Dahlia", "351707384392", false, true, 2500);
        manajer [1] = new Manajer(6, 18,  "402637887383", "Tasya Farasya", "351707384392", false, true, 1563);
        manajer [2] = new Manajer(8, 30,  "319063736763", "Jess No Limit", "351707384392", true, false, 865);
        System.out.println(manajer[0].toString());
        System.out.println(manajer[1].toString());
        System.out.println(manajer[2].toString());
        System.out.println("==================== TOTAL PROFESI ==================");
        System.out.println("Total Manusia       : " + manusia.length);
        System.out.println("Total Mahasiswa     : " + mahasiswaFilkom.length);
        System.out.println("Total Pekeja        : " + pekerja.length);
        System.out.println("Total Manajer       : " + manajer.length);
        
        

        
    }
    
}
