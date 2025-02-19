   import java.util.*;
   class GCD
   {
       public static void main(int n1,int n2)
       {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any two numbers to print their GCD");
            int rem=1 ,divisor, dividend;
            if(n1>n2)
            {
                dividend=n1;
                divisor=n2;
            }
            else
            {
                dividend=n2;
                divisor=n1;
            }
            while(rem!=0)
            {
                rem=dividend%divisor;
                if(rem==0)
                {
                    System.out.println("GCD is = " +divisor);
                }
                else
                {
                    dividend=divisor;
                    divisor=rem;
                }
            }
        }
    }
                
            
        
    
