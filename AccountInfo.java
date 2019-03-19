package corejava.OOPs.ClassAndObject;

public class AccountInfo {

    int acno;
    double balance = 1000;

    public void setAccountNo() {
        acno = 12345;
    }

    public void checkBalance(int ac) {
        if (acno == ac) {
            System.out.println("Your balance is " + balance);
        } else {
            System.out.println("Account no did not match");
        }
    }

    public void deposit(double dep) {
        balance = balance + dep;
        System.out.println("Your balance is " + balance);
    }

    public void withdraw(double withd) {
        if (withd > balance) {
            System.out.println("Insufficient Balance in the account.");
        } else {
            balance -= withd;
        }
    }
}

class BankTest {

    public static void main(String[] args) {
        System.out.println("WELCOM TO OUR BANK");
        System.out.println("");
        AccountInfo bank = new AccountInfo();
        bank.setAccountNo();
        bank.checkBalance(12345);
        System.out.print("Balance after  deposit ");
        bank.deposit(10000);
        System.out.println("Balance after withdraw ");
        bank.withdraw(12000);
        bank.checkBalance(1234);

    }
}
