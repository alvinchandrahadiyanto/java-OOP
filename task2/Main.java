package task2;

import java.util.Scanner;

// Lingkaran orang = new Lingkaran();
//         System.out.println(orang.kelilingBangun(10));

public class Main {
    static Scanner input = new Scanner(System.in);
    static String opsi;
  
    public static void menuApp() {
        System.out.println("1. Bangun Datar Persegi");
        System.out.println("2. Bangun Datar Segitiga"); 
        System.out.println("3. Bangun Datar Lingkaran");
        System.out.println("4. Bangun Ruang Kubus");
        System.out.println("5. Bangun Ruang Prisma");
        System.out.println("6. Bangun Ruang Bola");
        System.out.print("Input User ");
        opsi = input.nextLine();
    }
    public static void main(String[] args) {
      menuApp();
      double sisi;
      double a;
      double b;
      double c;
      double jari;
      double tinggi;

      switch (opsi) {
        case "1":
          System.out.println(" ");
          System.out.print("Masukan sisi persegi ");
          sisi = input.nextDouble();
          Persegi pers = new Persegi();
          pers.gambarBangun();
          pers.karakteristikBangun();
          System.out.println("Luas Persegi "+pers.luasBangun(sisi));
          System.out.println("Keliling Persegi "+pers.kelilingBangun(sisi));
          System.out.println(" ");
          break;

        case "2":
          System.out.println(" ");
          System.out.print("Masukan sisi 1 segitiga ");
          a = input.nextDouble();
          System.out.print("Masukan sisi 2 segitiga ");
          b = input.nextDouble();
          System.out.print("Masukan sisi 3 segitiga ");
          c = input.nextDouble();
          Segitiga seg = new Segitiga();
          seg.gambarBangun();
          seg.karakteristikBangun();
          System.out.println("Luas Segitiga "+seg.luasBangun(a, b, c));
          System.out.println("Keliling Segitiga "+seg.kelilingBangun(a, b, c));
          System.out.println(" ");
          break;
        
        case "3":
          System.out.println(" ");
          System.out.print("Masukan jari jari lingkaran ");
          jari = input.nextDouble();
          Lingkaran ling = new Lingkaran();
          ling.gambarBangun();
          ling.karakteristikBangun();
          System.out.println("Luas Lingkaran "+ling.luasBangun(jari));
          System.out.println("Keliling Lingkaran "+ling.kelilingBangun(jari));
          System.out.println(" ");
          break;
        
        case "4":
          System.out.println(" ");
          System.out.print("Masukan sisi kubus ");
          sisi = input.nextDouble();
          Kubus kbs = new Kubus();
          kbs.gambarBangun();
          kbs.karakteristikBangun();
          System.out.println("Volume Kubus "+kbs.volume(sisi));
          System.out.println("Luas Permukaan Kubus "+kbs.luasPermukaan(sisi));
          System.out.println(" ");
          break;
        
        case "5":
          System.out.println(" ");
          System.out.print("Masukan sisi 1 alas prisma ");
          a = input.nextDouble();
          System.out.print("Masukan sisi 2 alas prisma ");
          b = input.nextDouble();
          System.out.print("Masukan sisi 3 alas prisma ");
          c = input.nextDouble();
          System.out.print("Masukan tinggi prisma ");
          tinggi = input.nextDouble();
          System.out.println(" ");
          Prisma prsm = new Prisma();
          prsm.gambarBangun();
          prsm.karakteristikBangun();
          System.out.println("Volume Prisma "+prsm.volume(a, b, c, tinggi));
          System.out.println("Luas Permukaan Prisma "+prsm.luasPermukaan(a, b, c, tinggi));
          break;

        case "6":
          System.out.println(" ");
          System.out.print("Masukan jari jari bola ");
          jari = input.nextDouble();
          Bola bl = new Bola();
          bl.gambarBangun();
          bl.karakteristikBangun();
          System.out.println("Volume Bola "+bl.volume(jari));
          System.out.println("Luas Permukaan Bola "+bl.luasPermukaan(jari));
          System.out.println(" ");
          break;

        default:
          System.out.println("Pilihan tidak tersedia!");
          break;
      }
    }
}