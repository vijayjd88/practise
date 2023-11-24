package day11;

import day2.Read;

public class ExpDemo4 {

    public static void main(String[] args) {

        int balance = 20000;
        int amtwithdraw=0;
        try {
            System.out.println("enter the amount to withdraw ");
            amtwithdraw = Read.sc.nextInt();
            if(amtwithdraw >= balance) throw new BalanceInsufficient("....HO no Money");
            System.out.println("Please wait your transaction is under process");
        }catch (BalanceInsufficient e){
            System.out.println(e.getMessage());
        }
    }
}
