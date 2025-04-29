package ListaCesar.modelos;

public class HorasMin {
    private int hour, minutes;

    public void setTime(int h, int m) {
        this.hour = h;
        this.minutes = m;
    }

    public int calcTotalMin(){
        return (hour*60)+ minutes;
    }


}
