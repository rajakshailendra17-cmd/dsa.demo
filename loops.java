import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     //print all even number from 1 to N and print -1 if there is no even number.
     int N = sc.nextInt();
     int i = 2;
     while(i<=N){
        System.out.println(i);
        i = i+2;
        
     }
    
     if(i==2){
        System.out.println(-1);
        
     }


sc.close();

    //  int N = sc.nextInt();
    //  int i = 1;
    //  while(i<=N){
    //     System.out.println(i);
    //     i++;
        
    //  }
     
    


}
}
