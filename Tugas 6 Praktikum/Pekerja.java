package inheritance;
public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja (int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah){
        super (nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }
    public double getGaji() {
        gaji = this.hariKerja * this.jamKerja* 15;
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        double bonusLembur, bonusLibur;
        bonusLembur = ((hariKerja/7 ) * 5 + (hariKerja % 7)) * ((jamKerja - 7) * 7);
        bonusLibur = (hariKerja/7) * 2 * jamKerja * 20;
        if (jamKerja <= 7){
            return bonusLibur;
        } else return bonusLibur + bonusLembur;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    
    public String getStatus(){
          String kantor = "", cabang, departemen = "";
          switch(NIP.substring(0,1)){
              case "1" :
                  kantor = "Mondstadt";
                  break;
              case "2" :
                  kantor = "Liyue";
                  break;
              case "3" :
                  kantor = "Inazuma";
                  break;
              case "4" :
                  kantor = "Semeru";
                  break;
              case "5" :
                  kantor = "Fontaine";
                  break;
              case "6" :
                  kantor = "Natlan";
                  break;
              case "7" :
                  kantor = "Snezhnaya";
                  break;
          }
          cabang = "cabang ke- " + NIP.substring(2,3);
          switch(NIP.substring(6,7)){
             case "1" :
                  departemen = "Pemasaran"; 
                  break;
             case "2" :
                  departemen = "Humas"; 
                  break;
             case "3" :
                  departemen = "Riset"; 
                  break;
             case "4" :
                  departemen = "Teknologi"; 
                  break;
             case "5" :
                  departemen = "Personalia"; 
                  break;
             case "6" :
                  departemen = "Akademik"; 
                  break;
             case "7" :
                  departemen = "Administrasi"; 
                  break;
             case "8" :
                  departemen = "Operasional"; 
                  break;
             case "9" :
                  departemen = "Pembangunan"; 
                  break;
          }
          return departemen + "," + kantor + " " + cabang;
    }
    
    @Override
    public String toString(){
          System.out.println("Nama           : " + this.getNama());
          System.out.println("NIK            : " + this.getNIK());
          System.out.print  ("Jenis Kelamin  : " );
            if (jenisKelamin == true) {
                System.out.println("Laki-laki");
            }
            else System.out.println("Perempuan");
          System.out.println("Pendapatan     : " + (this.getGaji()+this.getBonus()+this.getTunjangan())+"$");
          System.out.println("Bonua          : " + this.getBonus()+"$");
          System.out.println("Gaji           : " + this.getGaji()+"$");
          System.out.println("Status         : " + this.getStatus());
          return "";
    }
}
