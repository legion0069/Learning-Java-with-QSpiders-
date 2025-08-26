

public class smith_number{
    public static void main(String[] args) {
        int arr[] = {666,78,89,124} ;
        int global_sum = 0 ;
        for(int num : arr){
            int sum = sum_of_digits(num) ;
            global_sum = prime_Factor(num) ;            
            System.out.println(num + " is given number.");
            System.out.println(sum + " is the sum of its digit");
            System.out.println(global_sum + " is the sum of its prime factors");
            System.err.println((sum==global_sum)?"This is a Smith Number" :"This is not a smith number") ;
            System.out.println();
        }
        
    }

    public static int  sum_of_digits(int num) {
        int dup = num ;
        int sum = 0 ;
        while(dup!=0){
            sum+=(dup%10) ;
            dup/=10 ;
        }
        return sum ;
    }


    public static int lenght(int num){
        int len = 0 ;
        int dup= num ;
        while(dup!=0){
            len++ ;
            dup/=10 ;
        }
        return len ;

    }



    public static int  prime_Factor(int num) {
        int global = 0 ;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                global += sum_of_digits(i) ;
                num = num / i;
            }
        }
        return global ;
    }
}


