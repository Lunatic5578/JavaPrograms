//Implementeing Runnable interface method
//execution differs everytime
//context-switching happens -> thread1 and thread2 both classes will take turns to avoid wasting time

class thread1 implements Runnable
{
    int i=0;
    @Override
    public void run() 
    {
        try {
            Thread.sleep(1000);  // the process will wait for 5 sec and after the wait is over the execution will continue normally
            System.out.println("\n-----After 1 second-----\n");
            while(i<=5)
                System.out.println("thread1 "+i++);
                i++;

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class thread2 implements Runnable
{
    int i=0;
    // public final void setPriority(int 9);
    @Override
    public void run() 
    {
        try {
            Thread.sleep(3000);
            System.out.println("\n-----After 3 seconds-----\n");
            while(i<=5)
                System.out.println("thread2 "+i++);
                i++;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class thread3 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("thread3 "+i);
        }
    }
}

class thread4 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("thread4 "+i);
        }
    }
}
 
public class Threads2 {
    public static void main(String[] args) {
        System.out.println("\n-----Initially-----\n");
        thread1 ob1=new thread1(); //creating object for the runnable
        Thread t1=new Thread(ob1); //passing the runnable object to thread object function

        thread2 ob2=new thread2();
        
        Thread t2=new Thread(ob2);

        thread3 ob3=new thread3();
        thread4 ob4=new thread4();

        
       // System.out.println(t1.getPriority()+" "+ob3.getPriority());
        t1.start();
        t2.start();
        ob3.start();
        ob4.start();
        //more about threads on oracle website
    }
}
