/**
 * Praktikum-Inheritance_Pemprograman Berorientasi Objek
 * Nama: Nadia Zafira Zahra
 * NIM: 20210040174
 * Kelas: TI21F
 * @author ACER
 */

public class CheckingAccount extends Account {
    
    private double overdraftProtection;

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    public CheckingAccount(double balance) {
        this(balance, -1);
    }

    @Override
    public boolean withDraw(double amt) {
        if (balance - amt >= 0) {
            balance -= amt;
            return true;
        } else {
            if (overdraftProtection <= amt - balance) {
                return false;
            }else{
                balance=0;
                overdraftProtection-=amt-balance;
                return true;
            }
        }
    }

}