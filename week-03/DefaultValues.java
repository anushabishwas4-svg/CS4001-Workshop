public class DefaultValues
{
    boolean b;
    byte by;
    short s;
    int i;
    long l;
    float f;
    double d;
    char C;
    
    public static void main(String[] args){
        DefaultValues obj = new DefaultValues(); //Creating obj of the class
        System.out.println("Value of boolean "+obj.b);
        System.out.println("Value of byte "+obj.by);
        System.out.println("Value of short "+obj.s);
        System.out.println("Value of int "+obj.i);
        System.out.println("Value of long "+obj.l);
        System.out.println("Value of float "+obj.f);
        System.out.println("Value of double "+obj.d);
        System.out .println("Value of char "+obj.C);
    }
    //Local variables inside method are not automatically initialized 
    //and attempting to use them without explicit initialization will cause a compilation error
}