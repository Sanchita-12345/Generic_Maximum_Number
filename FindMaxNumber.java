package bridgelabz;

public class FindMaxNumber
{
    public <E extends Comparable> E maximumNumber(E num1, E num2, E num3)
    {
        E maximumNumber = num1;
        if (num2.compareTo(maximumNumber) > 0)
        {
            maximumNumber = num2;
        }
        else if(num3.compareTo(maximumNumber) > 0)
        {
            maximumNumber = num3;
        }
        printMaximumValue(maximumNumber);
        return maximumNumber;
    }
    public <E> void printMaximumValue(E maximumNumber)
    {
        System.out.println("Maximum Value : " +maximumNumber);
    }
}
