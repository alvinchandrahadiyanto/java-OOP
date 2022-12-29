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
    String pilihPesan;
    String pilihEdit;
    String lanjut;

    public void menuList(){
        System.out.println(" ");
        System.out.println("======== Menu Makanan ========");
        for (int i = 0; i < makanan.size(); i++) {
            System.out.print(i+1);
            System.out.println(". "+makanan.get(i).toString());
        }
        System.out.println(" ");
        System.out.println("======== Menu Minuman ========");
        for (int i = 0; i<minuman.size(); i++){
            System.out.print(i+1);
            System.out.println(". "+minuman.get(i).toString());
        }
        System.out.println(" ");
        System.out.println("======== Menu Paket ========");
        for(int i = 0; i<paket.size();i++){
            System.out.print(i+1);
            System.out.println(". "+paket.get(i).toString());
        }
        System.out.println(" ");
    }

    public void lihatListPesanan(){
        if (!pesanan.isEmpty()) {
            System.out.println(" ");
            System.out.println("======== Pesanan Anda ========");
            for (int i = 0; i<pesanan.size(); i++){
                System.out.print(i+1);
                System.out.println(". "+pesanan.get(i).toString());
            }
            System.out.println(" ");
        }
    }

    public void menuMakan(){
        do {
            System.out.println(" ");
            System.out.println("======== Menu Makanan ========");
            for (int i = 0; i < makanan.size(); i++) {
                System.out.print(i+1);
                System.out.println(". "+makanan.get(i).toString());
            }
            System.out.println(" ");
            System.out.print("Masukan pilihan makanan: ");
            Integer pilih=Integer.parseInt(input.nextLine());
            pilih=pilih-1;
            Boolean pesanKosong=true;
            if (!((pilih>=makanan.size())||(pilih<0))) {
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
                    lihatListPesanan();
                } else {
                    System.out.println("Pesanan sudah ada!");
                }
            } else {
                System.out.println("Pilihan pesanan salah!");
            }
            System.out.print("Apakah ingin menambah makanan? (y/n): ");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));
    }

    public void menuMinum(){
        do {
            System.out.println(" ");
            System.out.println("======== Menu Minuman ========");
            for (int i = 0; i<minuman.size(); i++){
                System.out.print(i+1);
                System.out.println(". "+minuman.get(i).toString());
            }
            System.out.println(" ");
            System.out.print("Masukan pilihan minuman: ");
            Integer pilih=Integer.parseInt(input.nextLine());
            pilih=pilih-1;
            Boolean pesanKosong=true;
            if (!((pilih>=minuman.size())||(pilih<0))) {
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
                    lihatListPesanan();
                } else {
                    System.out.println("Pesanan sudah ada!");
                }
            } else {
                System.out.println("Pilihan pesanan salah!");
            }
            System.out.print("Apakah ingin menambah minuman? (y/n): ");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));
    }

    public void menuPaket(){
        do {
            System.out.println(" ");
            System.out.println("======== Menu Paket ========");
            for(int i = 0; i<paket.size();i++){
                System.out.print(i+1);
                System.out.println(". "+paket.get(i).toString());
            }
            System.out.println(" ");
            System.out.print("Masukan pilihan paket: ");
            Integer pilih=Integer.parseInt(input.nextLine());
            pilih=pilih-1;
            Boolean pesanKosong=true;
            if (!((pilih>=paket.size())||(pilih<0))) {
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
                    lihatListPesanan();
                } else {
                    System.out.println("Pesanan sudah ada!");
                }
            } else {
                System.out.println("Pilihan pesanan salah!");
            }
            System.out.print("Apakah ingin menambah paket? (y/n): ");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));
    }

    public void editPesan(){
        System.out.println(" ");
        System.out.println("======== Pesanan Anda ========");
        for (int i = 0; i<pesanan.size(); i++){
            System.out.print(i+1);
            System.out.println(". "+pesanan.get(i).toString());
        }
        System.out.println(" ");
        System.out.print("Masukan pilihan pesanan untuk diedit: ");
        Integer pilih=Integer.parseInt(input.nextLine());
        pilih=pilih-1;
        if (!((pilih>=pesanan.size())||(pilih<0))) {
            System.out.print("Edit jumlah pesanan: ");
            Integer jumlah=Integer.parseInt(input.nextLine());
            if (jumlah<=0) {
                System.out.print("Apakah ingin menghapus pesanan? (y/n): ");
                String confirm = input.nextLine();
                if (confirm.equalsIgnoreCase("y")) {
                    pesanan.remove(pilih);
                }
            } else {
                pesanan.get(pilih).setJlmhPesan(jumlah);
            }
        } else {
            System.out.println("Pilihan pesanan salah!");
        }
    }

    public void hapusPesan(){
        System.out.println(" ");
        System.out.println("======== Pesanan Anda ========");
        for (int i = 0; i<pesanan.size(); i++){
            System.out.print(i+1);
            System.out.println(". "+pesanan.get(i).toString());
        }
        System.out.println(" ");
        System.out.print("Masukan pilihan pesanan untuk dihapus: ");
        Integer pilih=Integer.parseInt(input.nextLine());
        pilih=pilih-1;
        if (!((pilih>=pesanan.size())||(pilih<0))) {
            System.out.print("Apakah ingin menghapus pesanan? (y/n): ");
            String confirm = input.nextLine();
            if (confirm.equalsIgnoreCase("y")) {
                pesanan.remove(pilih);
                System.out.println("Pesanan sudah dihapus!");
            }
        } else {
            System.out.println("Pilihan pesanan salah!");
        }
    }

    public void editHapus(){
        if (!pesanan.isEmpty()) {
            do {
                System.out.println(" ");
                System.out.println("========Edit/Hapus========");
                System.out.println("1. Edit Pesanan");
                System.out.println("2. Hapus Pesanan");
                System.out.println(" ");
                System.out.print("Pilih Edit/Hapus: ");
                pilihEdit = input.nextLine();
                switch (pilihEdit) {
                    case "1":
                        editPesan();
                        break;
                    
                    case "2":
                        hapusPesan();
                        break;
    
                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        break;
                }
                System.out.print("Apakah ingin lanjut edit/hapus paket? (y/n): ");
                lanjut = input.nextLine();
            } while (lanjut.equalsIgnoreCase("y"));
        } else {
            System.out.println("Pesanan masih kosong!");
        }
    }

    public void lihatPesanan(){
        if (!pesanan.isEmpty()) {
            System.out.println(" ");
            System.out.println("======== Pesanan Anda ========");
            for (int i = 0; i<pesanan.size(); i++){
                System.out.print(i+1);
                System.out.println(". "+pesanan.get(i).toString());
            }
            System.out.println(" ");
        } else {
            System.out.println("Pesanan masih kosong!");
        }
    }

    public void pemesanan(){
        do {
            System.out.println(" ");
            System.out.println("========Pesan========");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Paket");
            System.out.println("4. Edit/Hapus Pesanan");
            System.out.println("5. Lihat Pesanan");
            System.out.println(" ");
            System.out.print("Pilih Pesan: ");
            pilihPesan = input.nextLine();
            switch (pilihPesan) {
                case "1":
                    menuMakan();
                    break;
        
                case "2":
                    menuMinum();
                    break;
        
                case "3":
                    menuPaket();
                    break;
                
                case "4":
                    editHapus();
                    break;
                
                case "5":
                    lihatPesanan();
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
                    break;
            }
            System.out.print("Apakah ingin menambah/edit/hapus paket? (y/n): ");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));
    }

    public void pembayaran(){
        if (!pesanan.isEmpty()) {
            float totalTanpaPPN=0;
            for (int i = 0; i < pesanan.size(); i++) {
                totalTanpaPPN=totalTanpaPPN+pesanan.get(i).getTotalSementara();
            }
            do {
                lihatPesanan();
            } while (false);
        } else {
            System.out.println("Pesanan masih kosong!");
        }
    }
}