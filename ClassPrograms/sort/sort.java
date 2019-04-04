package sort;

public class sort
{
    public static int [] selectionSort(int [] array)
    {
        int lowval = array[0];
        int lowvalLocation = 0;
        for (int n = 0; n < array.length; n++)
        {
            for (int i = n; i < array.length; i++)
            {
                if (array[i] < lowval)
                {
                    lowval = array[i];
                    lowvalLocation = i;
                }
            }
            for (int i = lowvalLocation; i > n; i--)
            {
                array[i] = array[i-1];
            }
            array[n] = lowval;
            lowval = 2147483647;
        }
        return array;
    }
    public static int [] insertionSort(int [] array)
    {
        int lowval = array[0];
        int lowvalLocation = 0;
        int temp1;
        for (int n = 0; n < array.length; n++)
        {
            for (int i = n; i < array.length; i++)
            {
                if (array[i] < lowval)
                {
                    lowval = array[i];
                    lowvalLocation = i;
                }
            }
            temp1 = array[n];
            array[n] = lowval;
            array[lowvalLocation] = temp1;
            lowval = 32766;
            lowvalLocation = array.length - 1;
        }
        return array;
    }
    public static int [] mergeSort(int [] array)
    {
        if (array.length == 1)
        {
            return array;
        }
        int halfLength = array.length / 2;
        int [] firstHalf = new int[halfLength];
        int [] backHalf = new int[array.length - firstHalf.length];
        for (int i = 0; i < firstHalf.length; i++)
        {
            firstHalf[i] = array[i];
        }
        for (int i = firstHalf.length; i < array.length; i++)
        {
            backHalf[i] = array[i];
        }
        firstHalf = mergeSort(firstHalf);
        backHalf = mergeSort(backHalf);
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++)
        {
            if(firstHalf[a] <= backHalf[b])
            {
                array[i] = firstHalf[a];
                a += 1;
            }
            else
            {
                array[i] = backHalf[b];
                b += 1;
            }
        }
        return array;
    }
    public static int [] bubbleSort(int [] array)
    {
        int swaps;
        int temp1;
        int temp2;
        do
        {
            swaps = 0;
            for (int n = 1; n < array.length; n++)
            {
                if (array[n] < array[n - 1])
                {
                    temp1 = array[n];
                    temp2 = array[n - 1];
                    array[n - 1] = temp1;
                    array[n] = temp2;
                    swaps ++;
                }
            }

        }
        while (!(swaps == 0));
        return array;
    }
}
