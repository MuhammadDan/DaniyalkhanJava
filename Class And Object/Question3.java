class Cuboid{
    private int length,breadth,height;
    public void setlength(int l){
         length=l;
    }
    public void setbreadth(int b){
         breadth=b; 
    }
    public void setheight(int h){
        height=h;
    }
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
    public int getheight(){
        return height;
    }
    int getvolume(){
        return length*breadth*height;        
    }
    int getsurfacearea(){
        return 2*(length*breadth+breadth*height+length*height);
    }
}
public class Question3 {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid();
        c1.setlength(2);
        c1.setbreadth(2);
        c1.setheight(2);
        System.out.println("The volume "+c1.getvolume());
        System.out.println("The surfacearea "+c1.getsurfacearea());
    }
}
