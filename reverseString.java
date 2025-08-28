import java.util.Scanner ; 
public class reverseString {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter the String to reverse : ");
    String input = sc.nextLine() ;
    String new_string = ""; 

    for(int i =input.length()-1 ; i>=0 ; i--){
        new_string+=input.charAt(i) ;
    }   
    System.out.println(new_string);
    sc.close();
    }
}
