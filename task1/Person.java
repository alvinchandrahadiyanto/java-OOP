package task1;
import java.util.Scanner;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String domisili;
    protected String tahunLahir;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }
    public void setTahunLahir(String tahunLahir) {
        this.tahunLahir = tahunLahir;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDomisili() {
        return domisili;
    }
    public String getTahunLahir() {
        return tahunLahir;
    }
    public void setPerson(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("Masukan Firstname ");
        setFirstName(input.nextLine()+" ");
        System.out.print("Masukan Lastname ");
        setLastName(input.nextLine());
        System.out.print("Masukan Domisili ");
        setDomisili(input.nextLine());
        System.out.print("Masukan Tahun Lahir ");
        setTahunLahir(input.nextLine());
        System.out.println("");
    }
    public void print() {
        System.out.println("");
        System.out.println("Nama: "+getFirstName()+getLastName());
        System.out.println("Domisili: "+getDomisili());
        System.out.println("Tahun Lahir: "+getTahunLahir());
        System.out.println("");
    }
}
