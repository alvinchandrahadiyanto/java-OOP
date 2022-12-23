package task2;

public class Kubus extends Persegi implements BangunRuang{

    @Override
    public void gambarBangun(){
        System.out.println("KUBUS");
    }

    public void karakteristikBangun(){
        System.out.println("Karakteristik Kubus: ");
        System.out.println("- Memiliki 12 rusuk yang sama panjang");
        System.out.println("- Mempunyai 8 titik sudut");
    }

    @Override
    public double luasPermukaan() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double luasPermukaan(double sisi) {
        // TODO Auto-generated method stub
        return 6*sisi*sisi;
    }

    @Override
    public double volume() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double volume(double sisi) {
        // TODO Auto-generated method stub
        return sisi*sisi*sisi;
    }
    
}
