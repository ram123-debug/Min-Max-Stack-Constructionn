// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

class ProgramTest {
  public void testMinMaxPeek(int min, int max, int peek, Program.MinMaxStack stack) {
    Utils.assertTrue(stack.getMin() == min);
    Utils.assertTrue(stack.getMax() == max);
    Utils.assertTrue(stack.peek() == peek);
  }

  @Test
  public void TestCase1() {
    Program.MinMaxStack stack = new Program.MinMaxStack();
    stack.push(5);
    testMinMaxPeek(5, 5, 5, stack);
    stack.push(7);
    testMinMaxPeek(5, 7, 7, stack);
    stack.push(2);
    testMinMaxPeek(2, 7, 2, stack);
    Utils.assertTrue(stack.pop() == 2);
    Utils.assertTrue(stack.pop() == 7);
    testMinMaxPeek(5, 5, 5, stack);
  }
}
