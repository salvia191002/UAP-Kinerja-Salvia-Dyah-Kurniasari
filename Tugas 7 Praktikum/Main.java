package Polimorfisme;

public class Main {
    public static void main(String [] args){
      Pegawai p1 = new PegawaiTetap("Tiara Andhini", "3503065910010001", 4000000);
      Pegawai p2 = new PegawaiTetap("Alshad Ahmad", "3508263891063403", 1500000);
      Pegawai p3 = new PegawaiTetap("Roy Kiyoshi", "3506377450378002", 2750000);
      System.out.println("========= DATA PEGAWAI TETAP =========");
      System.out.println(p1.toString());
      System.out.println(p2.toString());
      System.out.println(p3.toString());
      
      Pegawai ph1 = new PegawaiHarian("Arya Saloka", "3504638390963819", 10000, 20);
      Pegawai ph2 = new PegawaiHarian("Fadil Jaidi", "3507836745524100", 25000, 36);
      Pegawai ph3 = new PegawaiHarian("Karin Novilda", "3503423190082514", 7500, 55);
      System.out.println("========= DATA PEGAWAI HARIAN =========");
      System.out.println(ph1.toString());
      System.out.println(ph2.toString());
      System.out.println(ph3.toString());
      
      Pegawai s1 = new Sales("Amanda Manopo", "3503667e63889275", 25, 120000);
      Pegawai s2 = new Sales("Rizki Billar", "3507476823983932", 100, 50000);
      Pegawai s3 = new Sales("Ivan Gunawan", "3506377512436343", 75, 65000);
      System.out.println("============= DATA SALES ==============");
      System.out.println(s1.toString());
      System.out.println(s2.toString());
      System.out.println(s3.toString());
    }
}
