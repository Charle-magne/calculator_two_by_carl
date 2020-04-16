package se.lexicon.carl;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest 
{
    /**
     * Yes yes, REALLY rigorous Test :-)
     */
    @Test
    public void doesAdditionWork()
    {
        //Arrange
        double num1 = 1;
        double num2 = 1;
        double expected = 2;

        //Act
        double actualNumber = App.add(num1, num2);

        //Assert
        assertEquals(expected, actualNumber, 0);
    }

    @Test
    public void doesSubtractionWork()
    {
        //Arrange
        double num1 = 3;
        double num2 = 1;
        double expected = 2;

        //Act
        double actualNumber = App.subtract(num1, num2);

        //Assert
        assertEquals(expected, actualNumber, 0);
    }

    @Test
    public void doesMultiplicationWork()
    {
        //Arrange
        double num1 = 3;
        double num2 = 2;
        double expected = 6;

        //Act
        double actualNumber = App.multiply(num1, num2);

        //Assert
        assertEquals(expected, actualNumber, 0);
    }

    @Test
    public void doesDivisionWork()
    {
        //Arrange
        double num1 = 6;
        double num2 = 2;
        double expected = 3;

        //Act
        double actualNumber = App.divide(num1, num2);

        //Assert
        assertEquals(expected, actualNumber, 0);
    }
}
