package bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    FindMaxNumber max = new FindMaxNumber();

    //Test Case 1.1
    @Test
    public void givenFirstNumberMaximum()
    {
        Integer num1 = max.toPrint(50, 27, 5);
        Assert.assertEquals((Integer) 50, num1);
    }

    //Test Case 1.2
    @Test
    public void givenSecondNumberMaximum()
    {
        Integer num2 = max.toPrint(34, 97, 48);
        Assert.assertEquals((Integer) 97, num2);
    }

    //Test case 1.3
    @Test
    public void givenThirdNumberMaximum()
    {
        Integer num3 = max.toPrint(4, 30, 45);
        Assert.assertEquals((Integer) 45, num3);
    }
}
