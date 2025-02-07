package Adapter;

public class BankFactory {
    public static BankHelper getBankHelper(String bankName){
        if(bankName.equals("ICBC")){
            return new ICBCBank();
        }
        else if(bankName.equals("ABC")){
            return new ABCBank();
        }
        return null;
    }
}
