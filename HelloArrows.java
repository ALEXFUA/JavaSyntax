public class HelloArrows {
    
    public static void main(String [] agrv) {
        int a[] = new int [25];
        a[0] = 5;
        a[24] = 8;
        //a[25] = 0;
        
        int a2[] = new int[] {2,5,14,15,16,22};
        for(int i:a2) {
            System.out.println(i);
        }
    }
}