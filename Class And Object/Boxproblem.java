class Box{
    int length,breath,height;
    void setDimension(int x,int y,int z){
        length=x;
        breath=y;
        height=z;
    }
    void showDimension(){
        System.out.println("Length "+length);
        System.out.println("Breadth "+breath);
        System.out.println("height "+height);
    }
}
class Boxproblem{
    public static void main(String[] args){
        Box b1 = new Box();
        b1.setDimension(20,15,11);
        System.out.print("");
        b1.showDimension();
    }
}