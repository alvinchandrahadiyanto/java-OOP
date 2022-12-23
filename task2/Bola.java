package task2;

public class Bola extends Lingkaran implements BangunRuang{

    @Override
    public void gambarBangun(){
        System.out.println("BOLA");
    }

    public void karakteristikBangun(){
        System.out.println("Tidak memiliki sudut");
    }

    @Override
    public double luasPermukaan() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double luasPermukaan(double jari) {
        // TODO Auto-generated method stub
        return 4*Math.PI*jari*jari;
    }

    @Override
    public double volume() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double volume(double jari) {
        // TODO Auto-generated method stub
        return Math.PI*jari*jari*jari;
    }
    
}
