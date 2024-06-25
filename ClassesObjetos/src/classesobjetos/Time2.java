package classesobjetos;


public class Time2 {
    private int hour;
    private int minute;
    private int second;
    
    
    public Time2(int hour, int minute, int second) {
        super();
        
        if(hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        } if(minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        } if(second < 0 || second >=  60) {
            throw new IllegalArgumentException("second must be 0-69");
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    
    public Time2() {
    }
    
    
    public Time2(int hour) {
        this.hour = hour;
    }

    
    public Time2(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    
    public Time2(Time2 time) {
        this.setTime(getHour(), getMinute(), getSecond());
        
    }
    
    
    public void setTime(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        } if(minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-60");
        } if(second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-60");
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    
    public void setHour(int hour) {
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hour = hour;
    }
    
    
    public int getHour() {
        return this.hour;
    }
    
    
    public void setMinute(int minute) {
        if(minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-60");
        }
        this.minute = minute;
    }
    
    
    public int getMinute() {
        return this.minute;
    }
    
    
    public void setSecond(int second){
        if(second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-60");
        }
    }
    
    
    public int getSecond() {
        return this.second;
    }
    
    
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d",  getHour(), getMinute(), getSecond());
    }
    
    
    public String toString() {
        return String.format("%d:%02d:%02d %s", 
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
