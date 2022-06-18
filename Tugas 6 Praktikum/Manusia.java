package inheritance;
public class Manusia {
    private String nama;
    private String NIK;
     boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama,String NIK, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public double getTunjangan(){
        double tunjangan;
        if(this.isMenikah() == true){
            if(this.isJenisKelamin() == true){
                tunjangan = 25;
            } else tunjangan = 20;
        }
        else tunjangan = 15;
        return tunjangan;
    }
   
    public double getPendapatan(){
        double pendapatan = getTunjangan();
        return pendapatan;
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
        System.out.println("Pendapatan     : " + this.getPendapatan()+"$");
        return "";
    }
}
