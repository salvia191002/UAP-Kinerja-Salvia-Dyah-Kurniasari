/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumexception;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author BISMILLAH NAWAITU
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang Di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player: ");
        String nama = input.nextLine();
        int role = 0;
        int count = 0;
        boolean start = true;

        while (true) {
            start = true;
            System.out.println("List daftar karakter: "
                    + "\n1. Magician"
                    + "\n2. Healer"
                    + "\n3. Warrior");
            System.out.println("Silahkan pilih karakter yang Anda inginkan : ");
            try {
                String roles = input.nextLine();
                role = Integer.valueOf(roles);
            } catch (Exception e) {
                start = false;
            }

            if (start && role > 0 && role < 4) {
                break;
            } else if (!start) {
                System.out.println(
                        "Tolong masukkan angka ya !");

            } else {
                System.out.println(
                        "Tolong pilih karakter yang tersedia !");
            }
        }
       
        Titan titan = new Titan();
        Character chara = null;
        System.out.printf("Selamat datang, %s !%n", nama);

        switch (role) {
            case 1:
                chara = new Magician();
                chara.info();
                break;
            case 2:
                chara = new Healer();
                ((Healer) chara).info();
                break;
            case 3:
                chara = new Warrior();
                ((Warrior) chara).info();
                break;
            default:
        }

        while (titan.getHP() > 0 && chara.getHP() > 0) {
            count++;
            System.out.printf("========== TURN %d ========== %n", count);
            if (count % 2 == 0 && chara instanceof Healer) {
                ((Healer) chara).heal();
                System.out.println("Menggunakan skill Heal.");
            }
            System.out.println("Enemy's HP\t: " + titan.getHP());
            System.out.printf("%s's HP\t: %d%n", nama, chara.getHP());
            if (titan.attack() == true) {
                chara.receiveDamage(titan.getAttack());
            }
            if (chara.attack() == true) {
                titan.receiveDamage(chara.getAttack());
            }
        }
        if (titan.getHP() <= 0) {
            titan.setHP(0);
        } else if (chara.getHP() <= 0) {
            chara.setHP(0);
        }
        String result = titan.getHP() <= 0 ? nama : "Titan";
        System.out.println(result + " menang\n");
        System.out.println(
                "========== PLAYER==========");
        chara.info();
        System.out.println(
                "\n========== MUSUH ==========");
        titan.info();
    }
}
