package task1;
public class Person {
    protected String firstName = "Alvin";
    protected String lastName = " Chandra Hadiyanto";
    protected String domisili= "Purwodadi";
    protected String tahunLahir = "20 juli 1998";

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
    public void print() {
        System.out.println("");
        System.out.println("Nama: "+getFirstName()+getLastName());
        System.out.println("Domisili: "+getDomisili());
        System.out.println("Tahun Lahir: "+getTahunLahir());
        System.out.println("");
    }
}
