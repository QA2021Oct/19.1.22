import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.Scanner;

public class MyFirstTestClass {
    Random r = new Random();
    Scanner s = new Scanner(System.in);

    @Test
    public void test1(){
        int a = 3;
        int b = 7;
        int result = a+b;
        Assert.assertEquals(result , 10);
    }

    @Test
    public void test2(){
        int userNumber = 5;
        int randomNumber = 5;
        boolean result = Main.isNumbersTheSame(randomNumber, userNumber);
        Assert.assertEquals(result, true);
    }

    @Test
    public void test3(){
        int userNumber = 5;
        int randomNumber = 6;
        boolean result = Main.isNumbersTheSame(randomNumber, userNumber);
        Assert.assertEquals(result, false);

    }
}
