package classesobjetos;


public class ClassesObjetos {

    public static void main(String[] args) {
        Time1 time1 = new Time1(13, 27, 6);
        
        displayTime1("After time object is created", time1);
        System.out.println("");
        displayTime1("after calling setTime", time1);
        System.out.println("");
        
        
        try {
            time1.setTime(99, 99, 99);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.printf("Exception: %s%n%n", illegalArgumentException.getMessage());
        }
        
        
        displayTime1("after calling setTime with invalid values", time1);
        
        
        System.out.println("");
        System.out.println("============================================");
        
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(t4);
        
        
        System.out.println("Constructed with: ");
        displayTime2("t1: all default arguments", t1);
        displayTime2("t2: hour specified; default minute and second", t2);
        displayTime2("t3: hour and minute specified; default second", t3);
        displayTime2("t4: hour, minute and second specified", t4);
        displayTime2("t5: Time2 object t4 specified", t5);
        
        
        try {
            Time2 t6 = new Time2(27, 74, 99);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.printf("%nException while initializing t6: %s%n", illegalArgumentException.getMessage());
        }
    }
    
    
    public static void displayTime1(String header, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }
    
    
    public static void displayTime2(String header, Time2 time){
        System.out.printf("%s%n    %s%n    %s%n", header, time.toUniversalString(), time.toString());
    }

}
