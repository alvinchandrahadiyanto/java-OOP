package task2;

public class Persegi extends BangunDatar{

    @Override
    public void gambarBangun() {
        // TODO Auto-generated method stub
        System.out.println("PERSEGI");
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("Karakteristik Persegi: ");
        System.out.println("- Memiliki 4 sisi sama panjang");
        System.out.println("- Semua sudut bernilai 90 derajat");
    }

    @Override
    public double luasBangun() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double luasBangun(double sisi) {
        // TODO Auto-generated method stub
        return sisi*sisi;
    }

    @Override
    public double kelilingBangun() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double kelilingBangun(double sisi) {
        // TODO Auto-generated method stub
        return 4*sisi;
    }
    
}
