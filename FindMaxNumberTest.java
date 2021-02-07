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

    //Test Case 2.1
    @Test
    public void givenFirstNumberFloatMaximum()
    {
        Float numFloat1 = max.toPrintFloat(6.7f, 2.7f, 5.1f);
        Assert.assertEquals((Float) 6.7f, numFloat1);
    }

    //Test Case 2.2
    @Test
    public void givenSecondNumberFloatMaximum()
    {
        Float numFloat2 = max.toPrintFloat(3.7f, 9.8f, 4.5f);
        Assert.assertEquals((Float) 9.8f, numFloat2);
    }

    //Test case 2.3
    @Test
    public void givenThirdNumberFloatMaximum()
    {
        Float numFloat3 = max.toPrintFloat(4.1f, 3.9f, 7.3f);
        Assert.assertEquals((Float) 7.3f, numFloat3);
    }

    //Test Case 3.1
    @Test
    public void givenFirstStringMaximum()
    {
        String string1 = max.toPrintString("Banana", "Apple", "Orange");
        Assert.assertEquals((String) "Banana", string1);
    }

    //Test Case 3.2
    @Test
    public void givenSecondStringMaximum()
    {
        String string2 = max.toPrintString("Ginger", "Capsicum", "Chili");
        Assert.assertEquals((String) "Capsicum", string2);
    }

    //Test case 3.3
    @Test
    public void givenThirdStringMaximum()
    {
        String string3 = max.toPrintString("Rose", "Lotus", "Sunflower");
        Assert.assertEquals((String) "Sunflower", string3);
    }
}
