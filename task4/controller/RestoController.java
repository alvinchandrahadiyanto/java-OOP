package task4.controller;

public class RestoController {
    String[] makanan={"Ayam Geprek","Lele","Nasi Putih","Sate Usus"
                      ,"Sate Kulit","Sate Ati Ampela","Sate Telor Puyuh","Tahu","Tempe"};
    int[] harga_makanan={14000,10000,4000,3000,3000,3000,3000,1500,1500};
    String[] minuman={"Teh Manis Hangat","Es Teh Manis","Fanta","Sprite","Coca-cola","Air Mineral","Kopi Hitam"};
    int[] harga_minum={3000,3000,5000,5000,5000,2500,3000};
    String[] paket={"Paket A - Ayam Geprek + Nasi + Es Teh Manis","Paket B - Ayam Geprek + Nasi + Tahu + Tempe + Es Teh Manis","Paket C - Ayam Geprek + Nasi + Tahu + Tempe + Sate(Kulit/Usus/Ati Ampela) + Es Teh Manis"};
    int[] harga_paket={20000,23000,25000};
    
    public void menuList(){
        System.out.println("========Menu Makanan========");
        System.out.println("1. Ayam Geprek - 14000");
        System.out.println("2. Lele - 10000");
        System.out.println("3. Nasi Putih - 4000");
        System.out.println("4. Sate Usus - 3000");
        System.out.println("5. Sate Kulit - 3000");
        System.out.println("6. Sate Ati Ampela - 3000");
        System.out.println("7. Sate Telor Puyuh - 3000");
        System.out.println("8. Tahu - 1500");
        System.out.println("9. Tempe - 1500");
        
        System.out.println("========Menu Minuman========");
        System.out.println("1. Teh Manis Hangat - 3000");
        System.out.println("2. Es Teh Manis - 3000");
        System.out.println("3. Fanta - 5000");
        System.out.println("4. Sprite - 5000");
        System.out.println("5. Coca-cola - 5000");
        System.out.println("6. Air Mineral - 2500");
        System.out.println("7. Kopi Hitam - 3000");

        System.out.println("========Menu Paket========");
        System.out.println("1. Paket A - Ayam Geprek + Nasi + Es Teh Manis - 20000");
        System.out.println("2. Paket B - Ayam Geprek + Nasi + Tahu + Tempe + Es Teh Manis - 23000");
        System.out.println("3. Paket C - Ayam Geprek + Nasi + Tahu + Tempe + Sate(Kulit/Usus/Ati Ampela) + Es Teh Manis - 25000");
    }

    public void menuMakan(){
        System.out.println("========Menu Makanan========");
        System.out.println("1. Ayam Geprek - 14000");
        System.out.println("2. Lele - 10000");
        System.out.println("3. Nasi Putih - 4000");
        System.out.println("4. Sate Usus - 3000");
        System.out.println("5. Sate Kulit - 3000");
        System.out.println("6. Sate Ati Ampela - 3000");
        System.out.println("7. Sate Telor Puyuh - 3000");
        System.out.println("8. Tahu - 1500");
        System.out.println("9. Tempe - 1500");
    }

    public void menuMinum(){
        System.out.println("========Menu Minuman========");
        System.out.println("1. Teh Manis Hangat - 3000");
        System.out.println("2. Es Teh Manis - 3000");
        System.out.println("3. Fanta - 5000");
        System.out.println("4. Sprite - 5000");
        System.out.println("5. Coca-cola - 5000");
        System.out.println("6. Air Mineral - 2500");
        System.out.println("7. Kopi Hitam - 3000");
    }

    public void menuPaket(){
        System.out.println("========Menu Paket========");
        System.out.println("1. Paket A - Ayam Geprek + Nasi + Es Teh Manis - 20000");
        System.out.println("2. Paket B - Ayam Geprek + Nasi + Tahu + Tempe + Es Teh Manis - 23000");
        System.out.println("3. Paket C - Ayam Geprek + Nasi + Tahu + Tempe + Sate(Kulit/Usus/Ati Ampela) + Es Teh Manis - 25000");
    }
}
