package task2;

public class Segitiga extends BangunDatar{

    @Override
    public void gambarBangun() {
        // TODO Auto-generated method stub
        System.out.println("SEGITIGA");
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("Karakteristik Segitiga: ");
        System.out.println("- Hanya memiliki 3 sisi");
        System.out.println("- Jumlah sudut ada 180 derajat");
    }

    @Override
    public double luasBangun() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double luasBangun(double a,double b,double c) {
        // TODO Auto-generated method stub
        double s = (a+b+c)/2;
        return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
    }

    @Override
    public double kelilingBangun() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double kelilingBangun(double a,double b,double c) {
        // TODO Auto-generated method stub
        return a+b+c;
    }
    
}
