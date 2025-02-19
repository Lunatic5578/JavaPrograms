 import java.util.*;
 class Keith_Number
 {
    
     int keith(int n)
     {
         int t,i,c=0,s=0;
         t=n;
         while(t>0)
         {
             t=t/10;
             c++;
         }
         int d[]=new int[c];
         t=n;
         for(i=c-1;i>=0;i--)
         {
             d[i]=t%10;
             t=t/10;
         }
         while(true)
         {
             s=0;
             for(i=0;i<c;i++)
             s=s+d[i];
             if(s==n)
             {
                 return 1;
             }
             else if(s>n)
             {
                 return 0;
             }
             for(i=0;i<c-1;i++)
             {
                 d[i]=d[i+1];
             }
             d[c-1]=s;
         }
      }
      public static void main(String[] args10)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter lower limit");
          int a=sc.nextInt();
          System.out.println("Enter upper limit");
          int b=sc.nextInt();
          int j;
          Keith_Number obj=new Keith_Number();
          System.out.println("Keith numbers are");
          for(j=a;j<b;j++)
          {
              if(obj.keith(j)==1)
              {
                  System.out.println(j);
                }

                
            }
        }
    }
    
            