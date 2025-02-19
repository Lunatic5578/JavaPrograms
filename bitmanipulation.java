import java.util.*;

public class bitmanipulation {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);    
        int n,pos;
        System.out.println("Enter the number");
        n=sc.nextInt();
        System.out.println("Enter the position");
        pos=sc.nextInt();

        

        bitmanipulation obj=new bitmanipulation();

        obj.getBit(n, pos);

        int newNum=obj.setBit(n, pos);
        System.out.println(newNum);

        int newNum2=obj.clearBit(n, pos);
        System.out.println(newNum2);

        obj.updateBit(n, pos);
    }

    void getBit(int n,int pos)
    {
        int bitMask=1<<pos; //left shifts the binary equivalent of the 1, pos times 

        if((bitMask & n)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }//this function gives the binary bit of a number at the given pos
    
    
    int setBit(int n,int pos)
    {
        int bitMask=1<<pos; //left shifts the binary equivalent of the 1, pos times 

        return ( bitMask | n);
    }//this function sets the digit of n at pos position to 1


    int clearBit(int n,int pos)
    {
        int bitMask=1<<pos; //left shifts the binary equivalent of the 1, pos times
        int notBitMask= ~(bitMask); //gives the NOT of bitMask

        return (notBitMask&n);
    }

    void updateBit(int n,int pos)
    {
        Scanner sc=new Scanner(System.in);
        int newNum;
        int bitMask=1<<pos;
        System.out.println("1. To update 0 with 1");
        System.out.println("2. To update 1 with 0");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        if(ch==1)
        {
            newNum=bitMask|n;
        }
        else
        {
            int notBitMask= ~(bitMask);
            newNum=notBitMask&n;
        }
        System.out.println(newNum);
    }
}
