 import java.util.*;
 class Average_Array
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner (System.in);
         double ar[],tot=0,avg;
         int i,n,c=0;
         System.out.println("Enter the size of the array");
         n=sc.nextInt();
         ar=new double[n];
         System.out.println("Enter the values of the array");
         for(i=0;i<n;i++)
         {
             ar[i]=sc.nextDouble();
             tot=tot+ar[i];
            }
            avg=tot/n;
            for(i=0;i<n;i++)
            {
            if(ar[i]>avg)
            c++;
        }
        System.out.println("Total marks= "+tot);
        System.out.println("Average= "+avg);
        System.out.println("No.of values greater than average= "+c);
    }
}
     