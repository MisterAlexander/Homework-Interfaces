package Bank;

public class BancaTransilvania implements BankingSystem{

    private int sold;

    public BancaTransilvania(int sold) {
        this.sold = sold;
    }

    public int withdraw(int amount) {
        if (sold < amount) {
            System.out.println("You Don't Have enough money in the bank");
            return sold;
        }
        sold = sold - amount;
        System.out.println(String.format("Extracted from bank  %d and the remaining sold is %d", amount, sold));
        return sold;
    }

    public int deposit(int amount) {
        sold = sold + amount;
        System.out.println(String.format("You deposited  %d and the new sold is now %d", amount, sold));
        return sold;
    }
}