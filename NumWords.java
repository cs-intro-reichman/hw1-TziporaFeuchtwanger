public class NumWords {
    public static void main(String args[]) {
        String n = args[0];
        
        int length = n.length();
        
    
        if (length == 3) {
            System.out.print(n.charAt(0) + " hundreds, ");
            System.out.print(n.charAt(1) + " tens, and ");
            System.out.print(n.charAt(2) + " ones.");
        } 
        
        else if (length == 2) {
            System.out.print("0 hundreds, ");
            System.out.print(n.charAt(0) + " tens, and ");
            System.out.print(n.charAt(1) + " ones.");
        } 
      
        else if (length == 1) {
            System.out.print("0 hundreds, 0 tens, and ");
            System.out.print(n.charAt(0) + " ones.");
        } 
       
        else {
            System.out.print("Invalid input.");
        }
    }
}



	