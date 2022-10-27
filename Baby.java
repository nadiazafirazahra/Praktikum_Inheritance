/**
 * Praktikum-Inheritance_Pemprograman Berorientasi Objek
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author ACER
 */

public class Baby extends Parent{
    String babyName;

    public String getBabyName() {
        return babyName;
    }
    Baby(String babyName){
        super();
        this.babyName = babyName;
        System.out.println("Konstruktor Baby");
        System.out.println(babyName);
 } 
    public void cry() {
        System.out.println("owek owek");
    }
}