/**
 * Praktikum-Inheritance_Pemprograman Berorientasi Objek
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author ACER
 */


public class SavingAccount extends Account{
    private double interestRate;
    
    public SavingAccount(double balance, double interstRate){
        super(balance);
        this.interestRate = interstRate;
    }
            
}