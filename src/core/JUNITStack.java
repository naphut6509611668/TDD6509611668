package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	public void testCeateNewEmptyStack() {
	/*	Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty()); */
		
	/*	Stack s1 = new Stack();
		s1.pushStack(2);
		assertEquals(s1.getSize(), s1.isTop()); */
		
		Stack s1 = new Stack();
		s1.pushStack(2);
		s1.pushStack(2);
		s1.pushStack(2);
		
		assertEquals(s1.isTop(), s1.getValue());
		assertEquals(s1.isTop(), s1.getValue());
	
		
	}
}
