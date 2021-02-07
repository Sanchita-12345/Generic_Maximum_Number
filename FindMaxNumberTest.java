package bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    FindMaxNumber max = new FindMaxNumber();

    //Test Case 1.1
    @Test
    public void givenFirstNumberMaximum()
    {
        Integer number = max.maximumNumber(50, 27, 5);
        Assert.assertEquals((Integer) 50, number);
    }

    //Test Case 1.2
    @Test
    public void givenSecondNumberMaximum()
    {
        Integer number = max.maximumNumber(34, 97, 48);
        Assert.assertEquals((Integer) 97, number);
    }

    //Test case 1.3
    @Test
    public void givenThirdNumberMaximum()
    {
        Integer number = max.maximumNumber(4, 30, 45);
        Assert.assertEquals((Integer) 45, number);
    }

    //Test Case 2.1
    @Test
    public void givenFirstNumberFloatMaximum()
    {
        Float number = max.maximumNumber(6.7f, 2.7f, 5.1f);
        Assert.assertEquals((Float) 6.7f, number);
    }

    //Test Case 2.2
    @Test
    public void givenSecondNumberFloatMaximum()
    {
        Float number = max.maximumNumber(3.7f, 9.8f, 4.5f);
        Assert.assertEquals((Float) 9.8f, number);
    }

    //Test case 2.3
    @Test
    public void givenThirdNumberFloatMaximum()
    {
        Float number = max.maximumNumber(4.1f, 3.9f, 7.3f);
        Assert.assertEquals((Float) 7.3f, number);
    }

    //Test Case 3.1
    @Test
    public void givenFirstStringMaximum()
    {
        String number = max.maximumNumber("Banana", "Apple", "Orange");
        Assert.assertEquals((String) "Banana", number);
    }

    //Test Case 3.2
    @Test
    public void givenSecondStringMaximum()
    {
        String number = max.maximumNumber("Ginger", "Capsicum", "Chili");
        Assert.assertEquals((String) "Capsicum", number);
    }

    //Test case 3.3
    @Test
    public void givenThirdStringMaximum()
    {
        String number = max.maximumNumber("Rose", "Lotus", "Sunflower");
        Assert.assertEquals((String) "Sunflower", number);
    }
}
