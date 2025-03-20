class Distance{
    private int kilometer,meter,centimeter;
    public void setDistance(int k,int m,int cm){
        kilometer=k;
        meter=m;
        centimeter=cm;
    }
    void displayDistance(){
        System.out.println();
        System.out.println("Kilometer:"+kilometer);
        System.out.println("meter"+meter);
        System.out.println("centimeter"+centimeter);
    }
    public int addDistance(){
        return kilometer+meter;
    }
}
public class Question8 {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.setDistance(3, 3, 4);
        d1.displayDistance();
        System.out.println("The sum:"+d1.addDistance());
    }
}
