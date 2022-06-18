import java.util.Scanner;
public class SuratKaisar {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        String teks = input.nextLine();
        int nilai = input.nextInt();
        konversi(teks,nilai);
    }
    public static void konversi(String teks, int nilai){
        String enskripsi = "";
        char chara;
        for(int i = 0; i < teks.length(); ++i){
        chara = teks.charAt(i);
        if(chara >= 'a' && chara <= 'z'){
                    chara = (char)(chara+nilai);

                    if(chara > 'z'){
                        chara = (char)(chara - 'z' + 'a' - 1);
                    }
            enskripsi += chara;
        }
        else if(chara >= 'A' && chara <= 'Z'){
            chara = (char)(chara + nilai);
            
            if(chara > 'Z'){
                chara = (char)(chara - 'Z' + 'A' - 1);
            }
            
            enskripsi += chara;
        }
        else {
          enskripsi += chara;
        }
        }
        System.out.println(enskripsi);
    }
}
