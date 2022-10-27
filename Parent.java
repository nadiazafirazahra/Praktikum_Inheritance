/**
 * Praktikum-Inheritance_Pemprograman Berorientasi Objek
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author ACER
 */

public class Parent {
    String parentName;
    public Parent() {}

    public String getParentName() {
        return parentName;
    }public Parent(String parentName){
        this.parentName = parentName;
        System.out.println("Konstruktor parent");
    }

}