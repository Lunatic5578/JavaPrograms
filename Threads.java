

//Extending Thread class method
//execution differs everytime
//context-switching happens -> thread1 and thread2 both classes will take turns executing to avoid wasting time

class thread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread1 "+i);
        }
    }
}

class thread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread2 "+i);
        }
    }
}


public class Threads 
{
    public static void main(String[] args) 
    {
        thread1 ob1=new thread1();
        thread2 ob2=new thread2();
        ob1.setPriority(9);
        ob2.setPriority(2);
        ob1.start();    
        ob2.start();
        System.out.println("ID of thread 1 is "+ob1.getId()+" and its priority is "+ob1.getPriority());
        System.out.println("Name of thread 2 is "+ob2.getName()+" (unchanged)");//name can be changed as per user requirements
        ob2.setName("Thread2");
        System.out.println("Name of thread 2 is "+ob2.getName()+" (changed)");
    }    
}