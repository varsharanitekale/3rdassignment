import java.util.Scanner;
public class usingwhile {
    public static void main(String[] args){
        // table  of user intput number
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number :");
         int a= sc.nextInt();
         int i=1;
         while(i<=10){
             int protable=a*i;
             System.out.println(protable);
             i++;

         }
         // factorial of number!!!!
         int p= sc.nextInt();
           int j=1;
           int fact=1;
          while( j<=p ){
              fact=fact*j;
                
            j++;

          }System.out.println(fact);


           // swapping of the number 
           System.out.println("Enter your 'r' number");

    int r =sc.nextInt();
    System.out.println("Enter your 'q' number");
       int q =sc.nextInt();
        // swap using 3rd variable
        int temp= r;
        r=q;
        q=temp;
        System.out.println("r"+ "=" + r);
        System.out.println(" q" + "="+ q);

        
   





    }

  


    
}
