package task1;
import java.util.Scanner;

public class Pendidikan {
    protected String sd;
    protected String smp;
    protected String sma;
    protected String s1;

    public void setSd(String sd) {
        this.sd = sd;
    }
    public void setSmp(String smp) {
        this.smp = smp;
    }
    public void setSma(String sma) {
        this.sma = sma;
    }
    public void setS1(String s1) {
        this.s1 = s1;
    }
    public String getSd() {
        return sd;
    }
    public String getSmp() {
        return smp;
    }
    public String getSma() {
        return sma;
    }
    public String getS1() {
        return s1;
    }
    public void setPendidikan(){
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukan SD ");
        setSd(input.nextLine());
        System.out.print("Masukan SMP ");
        setSmp(input.nextLine());
        System.out.print("Masukan SMA ");
        setSma(input.nextLine());
        System.out.print("Masukan S1 ");
        setS1(input.nextLine());
        System.out.println("");
    }
    public void print() {
        System.out.println("");
        System.out.println("SD: "+getSd());
        System.out.println("SMP: "+getSmp());
        System.out.println("SMA: "+getSma());
        System.out.println("S1: "+getS1());
        System.out.println("");
    }
}
