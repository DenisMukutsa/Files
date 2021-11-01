package Files;

public class StorageDurationMedia {
    private int hours;
    private int minutes;
    private int seconds;

    public StorageDurationMedia(int minutes, int seconds) {

        setMinutes(minutes);
        setSeconds(seconds);

    }

    public StorageDurationMedia(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if(hours > 0) {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if(minutes > 0) {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if(seconds > 0) {
            this.seconds = seconds;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public String toString() {
        return (hours != 0) ? hours + ":" + minutes + ":" + seconds : minutes + ":" + seconds;


    }

}
