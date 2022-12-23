package task2;

public class Lingkaran extends BangunDatar {

    @Override
    public void gambarBangun() {
        // TODO Auto-generated method stub
        System.out.println("LINGKARAN");
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("Tidak memiliki sudut");
    }

    @Override
    public double luasBangun() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double luasBangun(double jari) {
        // TODO Auto-generated method stub
        return Math.PI*jari*jari;
    }

    @Override
    public double kelilingBangun() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double kelilingBangun(double jari) {
        // TODO Auto-generated method stub
        return 2*Math.PI*jari;
    }
    
}
