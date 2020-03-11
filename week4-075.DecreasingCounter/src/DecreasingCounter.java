public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int valueStart;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.valueStart = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(0 < this.value){
            this.value--;
        }
    }

    public void reset(){
        this.value = 0;
    }

    public void setInitial(){
        this.value = this.valueStart;
    }

    // and here the rest of the methods
}
