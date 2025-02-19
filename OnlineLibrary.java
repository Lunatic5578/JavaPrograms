import java.util.*;

class Properties 
{
    Scanner sc=new Scanner(System.in);
    String books[]=new String[10];
    int noofBooks=0;

    void addBook(String bn)
    {
        books[noofBooks]=bn;
        noofBooks++;
    }
    void showBook()
    {
        for(int i=0;i<noofBooks;i++)
        {
            if(books[i]==null)
            {
                i++;
            }
            System.out.println(books[i]);
        }
    }
    void issueBook(String bn)
    {
        int c=0;
        //String tmp="";
        for(int i=0;i<noofBooks;i++)
        {
            if(books[i].equalsIgnoreCase(bn))
            {
                c++;
                books[i]=null;
                return;
            }
        }
        if(c>0)
        {
            System.out.println("The book has been issued");
        }
        else
        {
            System.out.println("The book is not available");
        }
    }
    void searchBook(String bn)
    {
        int c=0;
        for(int i=0;i<noofBooks;i++)
        {
            if(books[i]==null)
            {
                i++;
            }
            if(books[i].equalsIgnoreCase(bn))
            {
                c++;
            }
        }
        if(c!=0)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}

class OnlineLibrary
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);        
        Properties obj=new Properties();
        while(true)
        {
            System.out.println("Enter 1 to add books");
            System.out.println("Enter 2 to show books");
            System.out.println("Enter 3 to issue books");
            System.out.println("Enter 4 to return books");
            System.out.println("Enter 5 to search books");
            System.out.println("Enter 6 to exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the book name you want to add");
                    String bn=sc.next();
                    obj.addBook(bn);
                    break;
                }
                case 2:
                {
                    obj.showBook();
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the book name you want to issue");
                    String bn=sc.next();
                    obj.issueBook(bn);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the book name you want to return");
                    String bn=sc.next();
                    obj.addBook(bn);
                    break;
                }
                case 5:
                {
                    System.out.println("Enter the book name you want to search");
                    String bn=sc.next();
                    obj.searchBook(bn);
                    break;
                }
                case 6:
                {
                    System.exit(0);
                }
            }
        }
    }
}
