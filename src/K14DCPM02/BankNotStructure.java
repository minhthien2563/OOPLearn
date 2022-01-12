package K14DCPM02;

import java.util.Scanner;

public class BankNotStructure {
    public static void main(String[] args) {
        int account_number = 12345;
        int account_balance = 0;

        Scanner input = new Scanner(System.in);

        //gửi tiền
        System.out.print("Nhap so tien can gui: ");
        int inputAmount = input.nextInt();
        account_balance += inputAmount;

        //Show
        System.out.println("Thong tin cua tai khoan");
        System.out.println("So tai khoan " + account_number);
        System.out.println("So du tai khoan " + account_balance);

        //rút tiền
        int inputWithdrawAmount;
        System.out.print("Nhap so tien can rut: ");
        inputWithdrawAmount = input.nextInt();
        account_balance -= inputWithdrawAmount;

        //Show
        System.out.println("Thong tin cua tai khoan");
        System.out.println("So tai khoan " + account_number);
        System.out.println("So du tai khoan " + account_balance);
    }
}
