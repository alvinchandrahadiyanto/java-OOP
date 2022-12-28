package task4.controller;

import task4.models.Menu;
import task4.models.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestoController {
    List <Menu> makanan = new ArrayList<>(){{
        add(new Menu("Ayam Geprek", 14000));
        add(new Menu("Lele", 10000));
        add(new Menu("Nasi Putih", 4000));
        add(new Menu("Sate Usus", 3000));
        add(new Menu("Sate Kulit", 3000));
        add(new Menu("Sate Ati Ampela", 3000));
        add(new Menu("Sate Telor Puyuh", 3000));
        add(new Menu("Tahu", 1500));
        add(new Menu("Tempe", 1500));
    }};

    List <Menu> minuman = new ArrayList<>(){{
        add(new Menu("Teh Manis Hangat", 3000));
        add(new Menu("Es Teh Manis", 3000));
        add(new Menu("Fanta", 5000));
        add(new Menu("Sprite", 5000));
        add(new Menu("Coca-cola", 5000));
        add(new Menu("Air Mineral", 2500));
        add(new Menu("Kopi Hitam", 3000));
    }};

    List <Menu> paket = new ArrayList<>(){{
        add(new Menu("Paket A - Ayam Geprek + Nasi + Es Teh Manis", 20000));
        add(new Menu("Paket B - Ayam Geprek + Nasi + Tahu + Tempe + Es Teh Manis", 23000));
        add(new Menu("Paket C - Ayam Geprek + Nasi + Tahu + Tempe + Sate(Kulit/Usus/Ati Ampela) + Es Teh Manis", 25000));
    }};
    List <Order> pesanan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    String pilihpesan;
    String lanjut;

    public void menuList(){
        System.out.println(" ");
        System.out.println("========Menu Makanan========");
        for (int i = 0; i < makanan.size(); i++) {
            System.out.print(i+1);
            System.out.println(". "+makanan.get(i).toString());
        }
        System.out.println(" ");
        System.out.println("========Menu Minuman========");
        for (int i = 0; i<minuman.size(); i++){
            System.out.print(i+1);
            System.out.println(". "+minuman.get(i).toString());
        }
        System.out.println(" ");
        System.out.println("========Menu Paket========");
        for(int i = 0; i<paket.size();i++){
            System.out.print(i+1);
            System.out.println(". "+paket.get(i).toString());
        }
        System.out.println(" ");
    }

    public void menuMakan(){
        System.out.println("========Menu Makanan========");
        for (int i = 0; i < makanan.size(); i++) {
            System.out.print(i+1);
            System.out.println(". "+makanan.get(i).toString());
        }
        do {
            System.out.print("Masukan pilihan makanan: ");
            Integer pilih=Integer.parseInt(input.nextLine());
            pilih=pilih-1;
            Boolean pesanKosong=true;
            if (!((pilih>makanan.size())||(pilih<0))) {
                for (int i = 0; i < pesanan.size(); i++) {
                    if (pesanan.get(i).getTitle().equals(makanan.get(pilih).getTitle())) {
                        pesanKosong=false;
                        break;
                    }
                }
                if (pesanKosong) {
                    System.out.print("Masukan jumlah pesanan: ");
                    Integer jumlah=Integer.parseInt(input.nextLine());
                    if (jumlah>0) {
                        pesanan.add(new Order(makanan.get(pilih).getTitle(), makanan.get(pilih).getPrice(), jumlah));
                    } else {
                        System.out.println("jumlah yang dimasukan salah");
                    }
                    for (int i = 0; i<pesanan.size(); i++){
                        System.out.print(i+1);
                        System.out.println(". "+pesanan.get(i).toString());
                    }
                } else {
                    System.out.println("Pesanan sudah ada");
                }
            } else {
                System.out.println("Pilihan pesanan salah");
            }
            System.out.print("Apakah ingin menambah pesanan? (y/n): ");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));
    }

    public void menuMinum(){
        System.out.println("========Menu Minuman========");
        for (int i = 0; i<minuman.size(); i++){
            System.out.print(i+1);
            System.out.println(". "+minuman.get(i).toString());
        }
        do {
            System.out.print("Masukan pilihan minuman");
            Integer pilih=Integer.parseInt(input.nextLine());
            pilih=pilih-1;
            Boolean pesanKosong=true;
            if (!((pilih>minuman.size())||(pilih<0))) {
                for (int i = 0; i < pesanan.size(); i++) {
                    if (pesanan.get(i).getTitle().equals(minuman.get(pilih).getTitle())) {
                        pesanKosong=false;
                        break;
                    }
                }
                if (pesanKosong) {
                    System.out.print("Masukan jumlah pesanan: ");
                    Integer jumlah=Integer.parseInt(input.nextLine());
                    if (jumlah>0) {
                        pesanan.add(new Order(minuman.get(pilih).getTitle(), minuman.get(pilih).getPrice(), jumlah));
                    } else {
                        System.out.println("jumlah yang dimasukan salah");
                    }
                    for (int i = 0; i<pesanan.size(); i++){
                        System.out.print(i+1);
                        System.out.println(". "+pesanan.get(i).toString());
                    }
                } else {
                    System.out.println("Pesanan sudah ada");
                }
            } else {
                System.out.println("Pilihan pesanan salah");
            }
            System.out.print("Apakah ingin menambah pesanan? (y/n): ");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));
    }

    public void menuPaket(){
        System.out.println("========Menu Paket========");
        for(int i = 0; i<paket.size();i++){
            System.out.print(i+1);
            System.out.println(". "+paket.get(i).toString());
        }
        do {
            System.out.print("Masukan pilihan minuman");
            Integer pilih=Integer.parseInt(input.nextLine());
            pilih=pilih-1;
            Boolean pesanKosong=true;
            if (!((pilih>paket.size())||(pilih<0))) {
                for (int i = 0; i < pesanan.size(); i++) {
                    if (pesanan.get(i).getTitle().equals(paket.get(pilih).getTitle())) {
                        pesanKosong=false;
                        break;
                    }
                }
                if (pesanKosong) {
                    System.out.print("Masukan jumlah pesanan: ");
                    Integer jumlah=Integer.parseInt(input.nextLine());
                    if (jumlah>0) {
                        pesanan.add(new Order(paket.get(pilih).getTitle(), paket.get(pilih).getPrice(), jumlah));
                    } else {
                        System.out.println("jumlah yang dimasukan salah");
                    }
                    for (int i = 0; i<pesanan.size(); i++){
                        System.out.print(i+1);
                        System.out.println(". "+pesanan.get(i).toString());
                    }
                } else {
                    System.out.println("Pesanan sudah ada");
                }
            } else {
                System.out.println("Pilihan pesanan salah");
            }
            System.out.print("Apakah ingin menambah pesanan? (y/n): ");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));
    }

    public void pemesanan(){
        System.out.println("========Pesan========");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Paket");
        pilihpesan = input.nextLine();
        switch (pilihpesan) {
            case "1":
                menuMakan();
                break;
    
            case "2":
                menuMinum();
                break;
    
            case "3":
                menuPaket();
                break;
    
            default:
              System.out.println("Pilihan tidak tersedia!");
              break;
          }
    }
}
