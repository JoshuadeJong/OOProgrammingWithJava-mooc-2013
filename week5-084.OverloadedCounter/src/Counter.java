public class Counter {

    private int value;
    private boolean check;


    public Counter(int startingValue, boolean check){
        // creates a new counter with the given value.
        // The check is on if the parameter given to check was true.

        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue){
        // creates a new counter with the given value.
        // The check on the new counter should be off.
        this(startingValue, false);
    }

    public Counter(boolean check){
        //creates a new counter with the starting value 0.
        // The check is on if the parameter given to check was true.
        this(0, true);
    }

    public Counter(){
        // creates a new counter with the starting value of 0 and with checking off.
        this(0, false);
    }

    public int value(){
        return this.value;
    }

    public void increase(int increaseAmount){
        if(0 <= increaseAmount){
            this.value = this.value + increaseAmount;
        }
    }

    public void increase(){
        increase(1);
    }

    public void decrease(int decreaseAmount){
        if(0 <= decreaseAmount){
            if( 0 <= this.value - decreaseAmount || !this.check){
                this.value = this.value - decreaseAmount;
            } else {
                this.value = 0;
            }
        }
    }

    public void decrease(){
        decrease(1);
    }


}
