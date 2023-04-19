import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input2 = {5,6,7,8};
    int[] input3 = {8,7,6,5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(input3, input2);
  }

  @Test
  public void testReversed2(){
    int[] input2 = {1,2,3,4};
    int[] input3 = {4,3,2,1};
    assertArrayEquals(input3, ArrayExamples.reversed(input2));
  }



}
