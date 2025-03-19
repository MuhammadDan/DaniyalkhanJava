class Time{
    int hours,minutes,second;
    public void setTime(int h,int m,int s){
        hours=h;
        minutes=m;
        second=s;
    }
    public void printTime(){
        System.out.println(hours+":"+minutes+":"+second);
    }
}
public class Question2 {
    public static void main(String[] args) {
        Time s1 = new Time();
        s1.setTime(3, 20, 45);
        s1.printTime();
    }
}
