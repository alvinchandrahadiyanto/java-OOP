package task1;

public class Pendidikan {
    protected String sd = "SDK Baptis";
    protected String smp = "SMPK Yahya";
    protected String sma = "SMAK Yahya";
    protected String s1 = "Teknik Komputer ITHB";

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
    public void print() {
        System.out.println("");
        System.out.println("SD: "+getSd());
        System.out.println("SMP: "+getSmp());
        System.out.println("SMA: "+getSma());
        System.out.println("S1: "+getS1());
        System.out.println("");
    }
}
