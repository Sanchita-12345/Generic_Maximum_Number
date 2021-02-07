package bridgelabz;

public class FindMaxNumber
{
    //Integer Number
    public Integer toPrint(Integer num1, Integer num2, Integer num3)
    {
        Integer maximumNumber = num1;
        if (num2.compareTo(maximumNumber) > 0)
        {
            maximumNumber = num2;
        }
        else if(num3.compareTo(maximumNumber)>0)
        {
            maximumNumber = num3;
        }
        return maximumNumber;
    }

    //Float Number
    public Float toPrintFloat(Float num1, Float num2, Float num3)
    {
        Float maximumNumber = num1;
        if (num2.compareTo(maximumNumber) > 0)
        {
            maximumNumber = num2;
        }
        else if(num3.compareTo(maximumNumber)>0)
        {
            maximumNumber = num3;
        }
        return maximumNumber;
    }

    //String
    public String toPrintString(String num1, String num2, String num3)
    {
        String maximumNumber = num1;
        if (num2.compareTo(maximumNumber) > 0)
        {
            maximumNumber = num2;
        }
        else if(num3.compareTo(maximumNumber)>0)
        {
            maximumNumber = num3;
        }
        return maximumNumber;
    }
}
