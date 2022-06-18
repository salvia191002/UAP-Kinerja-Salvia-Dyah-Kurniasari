package UBFood;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
    DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
    DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
    System.out.println("====Halaman Utama UBFood====");
    System.out.println("1. Tampil Data Merchant");
    System.out.println("2. Tambah Data Merchant");
    System.out.println("3. Cari Data Merchant");
    System.out.println("4. Update Data Merchant");
    System.out.print("Pilih menu : ");
    int menu = input.nextInt();
        switch (menu) {
            case 1:
              DataMerchant.tampilData();
              System.out.println("");
              break;
            case 2 :
                input.nextLine();
                System.out.println("====Tambah Data Merchant UBFood====");
                System.out.print("Nama Merchant : ");
                String nMerchant = input.nextLine();
                System.out.print("Nama Produk   : ");
                String nProduk = input.nextLine();
                System.out.print("Harga Makanan : ");
                double hMakanan = input.nextDouble();
                DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(nMerchant,nProduk,hMakanan));
                DataMerchant.tampilData();
                break;
            case 3 :
                input.nextLine();
                System.out.println("====Cari Data Merchant UBFood====");
                System.out.print("Cari nama merchant : ");
                String cari = input.nextLine();
                DataMerchant.cariMerchant(cari);
                DataMerchant.tampilData();
                break;
            case 4 :
                input.nextLine();
                System.out.println("====Update Data Merchant UBFood====");
                System.out.print("Cari nama merchant : ");
                String cari2 = input.nextLine();
                System.out.print("Nama Merchant baru : ");
                String merchantBaru = input.nextLine();
                System.out.print("Nama produk baru : ");
                String produkBaru = input.nextLine();
                System.out.print("Harga Makanan baru : ");
                double hargaBaru = input.nextDouble();
                DataMerchant.updateMerchant(DataMerchant.cariMerchant(cari2),merchantBaru,produkBaru,hargaBaru);
                DataMerchant.tampilData();
                break;
            default:
        }        
        }
    }