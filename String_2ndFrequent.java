import java.util.*;

public class String_2ndFrequent 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char secondMostFrequentChar = findSecondMostFrequentCharacter(s);

        System.out.println("The second most frequent character is: " + secondMostFrequentChar);
    }

    public static char findSecondMostFrequentCharacter(String str) 
    {
        // Remove spaces and convert to lowercase for case-insensitive counting
        str = str.replaceAll("\\s", "").toLowerCase();

        // Create an array to store character frequencies
        int[] charFrequency = new int[26]; // Assuming only lowercase alphabets

        // Populate the frequency array
        for (char c : str.toCharArray()) 
        {
            if (Character.isLetter(c)) 
            {
                charFrequency[c - 'a']++;
            }
        }

        char mostFrequentChar = '\0';
        int mostFrequentCount = 0;
        char secondMostFrequentChar = '\0';
        int secondMostFrequentCount = 0;

        // Find the most and second most frequent characters
        for (int i = 0; i < charFrequency.length; i++) 
        {
            if (charFrequency[i] > mostFrequentCount) 
            {
                secondMostFrequentCount = mostFrequentCount;
                secondMostFrequentChar = mostFrequentChar;
                mostFrequentCount = charFrequency[i];
                mostFrequentChar = (char) ('a' + i);
            } 
            else if (charFrequency[i] > secondMostFrequentCount && charFrequency[i] != mostFrequentCount) 
            {
                secondMostFrequentCount = charFrequency[i];
                secondMostFrequentChar = (char) ('a' + i);
            }
        }

        return secondMostFrequentChar;
    }
}