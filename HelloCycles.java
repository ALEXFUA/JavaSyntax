public class HelloCycles {
    
    public static void main(String[] argv) {
        int a = 20; 
        
        while (a>0) {
            System.out.println(a);
                a/=2;
        }
    System.out.println();
        
        a = 6;
        do {
            System.out.println(a);
                a/=2;
        }
        while (a>0);
            System.out.println(a);
        
        System.out.println();
        
        for(int i=0; i<10; ++i) 
        {
            System.out.println(i);
        }
        System.out.println();
        
        int[] ar = new int[5];
        ar[0] = 1; ar[1] = 2; ar[2] = 5; ar[3] = 12; ar[4] = 22;
        for (int i:ar) {
            System.out.println(i);
        }
        System.out.println();
    }
}