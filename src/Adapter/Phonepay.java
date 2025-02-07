package Adapter;

public class Phonepay {
    public static void main(String[] args){
        BankHelper bankHelper = BankFactory.getBankHelper("ICBC");
        int x = bankHelper.pay();
        System.out.println(x);
    }
}
