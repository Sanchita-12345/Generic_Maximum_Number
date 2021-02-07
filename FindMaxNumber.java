package bridgelabz;

public class FindMaxNumber <E extends Comparable<E>>
{
    E[] value;

    public FindMaxNumber(E[] value)
    {
        this.value = value;
    }
    public <E> void printMaximumValue(E maximumNumber)
    {
        System.out.println("Maximum Value : " +maximumNumber);
    }
    public E maximumNumber()
    {
        if (value[0].compareTo(value[1]) > 0 && value[0].compareTo(value[2]) > 0)
        {
            printMaximumValue(value[0]);
        }
        else if (value[1].compareTo(value[0]) > 0 && value[1].compareTo(value[2]) > 0)
        {
            printMaximumValue(value[1]);
        }
        else
        {
            printMaximumValue(value[2]);
        }
        return value[2];
    }
}
