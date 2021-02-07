package bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    //Test Case 1.1
    @Test
    public void givenFirstNumberMaximum()
    {
        Integer[] integerValues = {50, 27, 5};
        Integer maximumNumber = new FindMaxNumber<>(integerValues).maximumNumber();
        Assert.assertEquals((Integer) 50, maximumNumber);
    }

    //Test Case 1.2
    @Test
    public void givenSecondNumberMaximum()
    {
        Integer[] integerValues = {34, 97, 48};
        Integer maximumNumber = new FindMaxNumber<>(integerValues).maximumNumber();
        Assert.assertEquals((Integer) 97, maximumNumber);
    }

    //Test case 1.3
    @Test
    public void givenThirdNumberMaximum()
    {
        Integer[] integerValues = {4, 30, 45};
        Integer maximumNumber = new FindMaxNumber<>(integerValues).maximumNumber();
        Assert.assertEquals((Integer) 45, maximumNumber);
    }

    //Test Case 2.1
    @Test
    public void givenFirstNumberFloatMaximum()
    {
        Float[] floatValues = {6.7f, 2.7f, 5.1f};
        Float maximumNumber = new FindMaxNumber<>(floatValues).maximumNumber();
        Assert.assertEquals((Float) 6.7f, maximumNumber);
    }

    //Test Case 2.2
    @Test
    public void givenSecondNumberFloatMaximum()
    {
        Float[] floatValues = {3.7f, 9.8f, 4.5f};
        Float maximumNumber = new FindMaxNumber<>(floatValues).maximumNumber();
        Assert.assertEquals((Float) 9.8f, maximumNumber);
    }

    //Test case 2.3
    @Test
    public void givenThirdNumberFloatMaximum()
    {
        Float[] floatValues = {4.1f, 3.9f, 7.3f};
        Float maximumNumber = new FindMaxNumber<>(floatValues).maximumNumber();
        Assert .assertEquals((Float) 7.3f, maximumNumber);
    }

    //Test Case 3.1
    @Test
    public void givenFirstStringMaximum()
    {
        String[] stringValues = {"Banana", "Apple", "Orange"};
        String maximumNumber = new FindMaxNumber<>(stringValues).maximumNumber();
        Assert.assertEquals((String) "Banana", maximumNumber);
    }

    //Test Case 3.2
    @Test
    public void givenSecondStringMaximum()
    {
        String[] stringValues = {"Ginger", "Capsicum", "Chili"};
        String maximumNumber = new FindMaxNumber<>(stringValues).maximumNumber();
        Assert.assertEquals((String) "Capsicum", maximumNumber);
    }

    //Test case 3.3
    @Test
    public void givenThirdStringMaximum()
    {
        String[] stringValues = {"Rose", "Lotus", "Sunflower"};
        String maximumNumber = new FindMaxNumber<>(stringValues).maximumNumber();
        Assert.assertEquals((String) "Sunflower", maximumNumber);
    }
}
