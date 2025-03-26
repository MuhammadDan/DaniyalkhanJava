class Distance{
    private int kilometer,centimeter,meter;
    public void setDistance(int k,int m,int cm){
        kilometer=k;
        meter=m;
        centimeter=cm;
    }
    void displayDistance(){
        System.out.println();
        System.out.println("Kilometer:"+kilometer);
        System.out.println("meter:"+meter);
        System.out.println("centimeter:"+centimeter);
    }
    public Distance addDistance(Distance d){
        Distance temp = new Distance();
        System.out.println();
        System.out.println("centimeter:"+centimeter);
        System.out.println("d.centimeter:"+d.centimeter);
        temp.centimeter = centimeter+d.centimeter;
        temp.centimeter = temp.centimeter%100; // jab kabhi value 100 sai bari hojye to modulus ki help sai cm ki value 100 sai zyda na ho kyu kai 100cm 1m kai equal hota hai 
        System.out.println("temp.centimeter:"+temp.centimeter);
        System.out.println("meter:"+meter);
        System.out.println("d.meter:"+d.meter);
        temp.meter = temp.centimeter/100+meter+d.meter;
         temp.meter = temp.meter%1000; // Meters kabhi 1000 se zyada na ho (jo extra ho, wo kilometers me chala jaye).
         temp.kilometer = temp.meter/1000+kilometer+d.kilometer;
         temp.meter=temp.meter%1000;
         return temp;
    }
}
public class Question8 {
 public static void main(String[] args) {
    Distance d1 = new Distance();
    Distance d2 = new Distance();
    Distance d3;
    d1.setDistance(3, 40, 100);
    d2.setDistance(2, 150, 200);
    d3 = d1.addDistance(d2);
    d3.displayDistance();
 }
}
