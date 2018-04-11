package jerome.com.frameworkapp;

import org.junit.Test;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private int[] newIntArray;
    private int[] intArray;

    @Test
    public void addition_isCorrect() {
        ArrayList<ArrayList<Integer>> integers = new ArrayList<>();
        ArrayList<Integer> newIntegers = new ArrayList<>();
        integers.add(newIntegers);
        newIntegers.add(1);
        newIntegers.add(3);
        System.out.println(integers);

        System.out.println(integers);
    }
}