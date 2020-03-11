public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.hours.setValue(hoursAtBeginning);

        this.minutes = new BoundedCounter(59);
        this.minutes.setValue(minutesAtBeginning);

        this.seconds = new BoundedCounter( 59);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one second

        this.seconds.next();

        if(0 == this.seconds.getValue()){

            this.minutes.next();

            if(0 == this.minutes.getValue()){
                this.hours.next();
            }
        }
    }
    
    public String toString(){
        return "" + hours + ":" + minutes + ":" + seconds;
    }
}
