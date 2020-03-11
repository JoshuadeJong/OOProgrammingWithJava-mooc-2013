public class LyyraCard {
    private double balance;


    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }

    public String toString(){
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical(){
        if(2.50 <= this.balance) {
            this.balance = this.balance - 2.50;
        }
    }

    public void payGourmet(){
        if(4.00 <= this.balance) {
            this.balance = this.balance - 4.00;
        }
    }

    public void loadMoney(double amount){
        if(150 >= this.balance + amount && 0 <= amount) {
            this.balance = this.balance + amount;
        } else if( 150 < this.balance + amount) {
            this.balance = 150;
        }
    }

}
