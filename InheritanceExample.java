/**
 * Praktikum-Inheritance_Pemprograman Berorientasi Objek
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author ACER
 */

public class InheritanceExample {
    
public static void main(String[] args) {
    Bapak objectBapak = new Bapak();
    Anak objectAnak = new Anak();
    


objectBapak.a=1;
objectBapak.b=1;
System.out.println("Object Bapak (Superclass):");
objectBapak.show_variabel();

objectAnak.c=5;
System.out.println("Object Anak (Superclass dari Bapak):");
objectAnak.show_Variabel();
}
}