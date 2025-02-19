import java.util.*;
class dateval 
{

    static boolean isLeap(int y) 
    {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            return true;
        return false;
    }

    static boolean isValid(int d, int m, int y) 
    {
        if (d > 31 || d < 1 || m < 1 || m > 12 || y < 0 || m == 0)
            return false;

        if (( m == 4 || m == 6 || m == 9 || m == 11) && d > 30)
            return false;

        if (m == 2) 
        {
            if (isLeap(y) && d > 29)
                return false;
            if (!isLeap(y) && d > 28)
                return false;
        }
        return true;
    }

    
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        String date,M;
        int d, m, y;

        String month[]={"0","January","February","March","April","June","July","August","September","October","November","December"};
        
        System.out.println("Enter the date");
        date = sc.nextLine();
        int l = date.length();

        d = Integer.parseInt(date.substring(0, date.indexOf('/')));

        m = Integer.parseInt(date.substring((date.indexOf('/') + 1), date.lastIndexOf('/')));

        y = Integer.parseInt(date.substring((date.lastIndexOf('/') + 1), l));

    
        M=month[m];

        if (isValid(d, m, y) == true) 
        {
            System.out.println(d + " " + M + "," + y);
        }
        else
        {
            System.out.println("Invalid");
        }

    }
}