class Complex{
    int imaginary;
    int   real;
    void setcomplex(int i,int r){
        imaginary = i;
        real = r;
    }
    void printcomplex(){
        System.out.println("imaginary "+imaginary);
        System.out.println("real "+real);
    }
}
class Question1{
    public static void main(String[] args) {
        Complex d1 = new Complex();
        d1.setcomplex(20, 11);
        d1.printcomplex();
    }
}