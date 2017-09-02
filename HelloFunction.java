public class HelloFunction {
    
    public static void main (String [] argv) {
        System.out.println( foo (2, 3));
        
        double b = bar(7, 2.5) + 3;
        System.out.println(b);
    }
    
    public static int foo(int a, int b) {
        int c;
        c = a+b;
        return c;
    }
    
    public static double bar(int a, double b) {
        double c = a*b;
        return c;   
    }
    
}