import java.util.*;
public class DistanceFromAverage
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[20];
        double entry, total = 0, avg = 0;
        final int QUIT = 99999;
        int x = 0, y;
        System.out.print("Enter a number or " + QUIT + " to quit:  ");
        entry = input.nextDouble();
        while(entry != QUIT && x < numbers.length)
        {
            numbers[x] = entry;
            total += numbers[x];
            ++x;
            if(x < numbers.length)
            {
                System.out.print("Enter next number or " + QUIT + " to quit:  ");
                entry = input.nextDouble();
            }
        }
        if(x == 0)
            System.out.println("No numbers were entered. Please enter numbers to calculate average.");
        else
        {
            avg = total / x;
            System.out.println("Numbers entered: " + x + " and their average is " + avg);
            for(y = 0; y < x; ++y)
                System.out.println(numbers[y] + " is " + (numbers[y] - avg) + " away from the average");
        }
    }
}