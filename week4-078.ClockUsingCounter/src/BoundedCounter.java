public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit + 1;
        this.value = 0;
    }

    public void next(){
        this.value = (this.value + 1)%this.upperLimit;
    }

    public String toString(){
        return String.format("%02d", this.value);
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int valueStart){
        if(0 <= valueStart) {
            this.value = valueStart % this.upperLimit;
        }
    }

}
