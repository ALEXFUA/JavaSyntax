public class HelloString {
    
    public static void main (String [] argv) {
        String a = "This is string";
        String b = "This my first acquaintance with string";
        String e = "This is string";
        String c = "This is string about java";
        String d = "Java is better language as C#";
    
        if (a==b) {
            System.out.println("a==b");
        }
        else {
            System.out.println("a!=b");
        }
        
        if (a==e) {
            System.out.println("a==e");
        }
        else {
            System.out.println("a!=b");
        }
        
        //Method == is not works correctly
        if (a==e.substring (0,14)) {
            System.out.println("This is method .substring");
        }
        else {
            System.out.println("None");
        }
        
        //Method equals 
        if (a.equals(e.substring(0,14)) ) {
            System.out.println ("The method equals is working!");
        }
        else {
            System.out.println ("Wrong!");
        }
        
        //Construction strings - это не нужено делать!
        //String ast = "qwer";
        //ast += "ty";
        //    System.out.println(ast);
    
        //Method .append
        StringBuilder sb = new StringBuilder ("abc");
        sb.append("defj");
            System.out.println(sb.toString());
    }
}
