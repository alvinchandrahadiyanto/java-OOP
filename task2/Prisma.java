package task2;

public class Prisma extends Segitiga implements BangunRuang{

    @Override
    public void gambarBangun(){
        System.out.println("PRISMA");
    }

    public void karakteristikBangun(){
        System.out.println("Memiliki 6 rusuk");
    }

    @Override
    public double luasPermukaan() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double luasPermukaan(double a,double b,double c,double tinggi) {
        // TODO Auto-generated method stub
        double s = (a+b+c)/2;
        double luas1=Math.sqrt(s*(s-a)*(s-b)*(s-c))*tinggi;
        double luas2=(a+b+c)*tinggi;
        return luas1+luas2;
    }

    @Override
    public double volume() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double volume(double a,double b,double c,double tinggi) {
        // TODO Auto-generated method stub
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c))*tinggi;
    }
    
}
