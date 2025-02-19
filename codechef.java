/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
/*input
4 (no.of cases)
3 (no.of sources)
START38 LTIME108 START38 (source name)
4
LTIME108 LTIME108 LTIME108 START38
2
LTIME108 LTIME108
6
START38 LTIME108 LTIME108 LTIME108 START38 LTIME108

 Output 
2 1
1 3
0 2
2 4*/

class codechef
{
    
    
    public static void main(String[] args) throws java.lang.Exception
    {
         Scanner sc = new Scanner(System.in) ;
            int T,N;
            String C,a="Start38";
            
            T=sc.nextInt();
            for(int i=0;i<T;i++)
            {
                
                N=sc.nextInt();
                int s=0,l=0;
                for(int j=0;j<N;j++)
                {
                   
                    C=sc.next();
                    if(C.length()==a.length())
                    {
                        s++;
                    }
                    else
                    {
                        l++;
                    }
                }
                
                System.out.println(s+" "+l);
   
            }
        }
    }   


