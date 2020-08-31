public class TwelveInts
{
    public static void main (String[] args)
    {
        int[] numbers = {54, 9, 11, 100, 99, 87, 112, 32, 16, 90, 73, 42};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}