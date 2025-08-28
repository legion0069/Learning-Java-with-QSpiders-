import java.util.Scanner ;

public class countUpperLowerCase {
    public static void main(String[] args) {
        
    System.out.println("Enter the String: ");
    Scanner sc = new Scanner(System.in) ;
    String input = sc.nextLine() ;


    int UpperCount = 0 ;
    int Lowercount =0 ;

    for(int i =0 ; i<input.length() ; i++){
        char a = input.charAt(i) ;
        if(Character.isLowerCase(a)){
            Lowercount++ ;
        }else if(Character.isUpperCase(a)){
            UpperCount++ ;
        }
    }
    System.out.println("Upper Count is " + UpperCount);
    System.out.println("Lower Count is " + Lowercount);
}
}
