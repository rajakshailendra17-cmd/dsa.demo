import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     // Given N numbers. Count how many of these values are even, odd, positive and negative.
     int N = sc.nextInt();
     int i = 1;
     int even = 0;
     int odd = 0;
     int positive = 0;
     int negative = 0;
     while(i<=N){
        int num = sc
           .nextInt();
           if(num%2==0){
             even++;
             
           }
           if(num%2!=0){
              odd++;
              
           }
           if(num>0){
             positive++;
             
           }
           if(num<0){
            negative++;
            
           }
           i++;
           
     }
     System.out.println("Even:"+" "+even);
     System.out.println("Odd:"+" "+odd);
     System.out.println("Positive:"+" "+positive);
     System.out.println("Negative:"+" "+negative);

     sc.close();


     //print all even number from 1 to N and print -1 if there is no even number.
    //  int N = sc.nextInt();
    //  int i = 2;
    //  while(i<=N){
    //     System.out.println(i);
    //     i = i+2;
        
    //  }
    
    //  if(i==2){
    //     System.out.println(-1);
        
    //  }


    //  int N = sc.nextInt();
    //  int i = 1;
    //  while(i<=N){
    //     System.out.println(i);
    //     i++;
        
    //  }
     
    


}
}
