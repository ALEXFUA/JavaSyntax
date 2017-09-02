public class HelloCondition {
    
    public static void main (String [] argv) {
        int a = 8; 
        
        if (a<10) {
        System.out.println("a<10");
        }
        
        if (a!=9) {
            System.out.println("a!=9");
        }
        
        if (a==11) {
            System.out.println("a==11");
        }
        else {
            System.out.println("No, a==11 is wrong!");
        }
        
        if (a<9 && a%6==2) {
            System.out.println("This condition is true!");
        }
        
        if (a>8 || a%4==0) {
            System.out.println("It's OK!");
        }
    }
}