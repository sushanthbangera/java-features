package com.learn.effective_java.clone;

public class StackCloneTest {

	public static void main(String[] args) {
		
		System.out.println("Testing clone by modifying the original object");
		modifyOriginal();
		
		System.out.println("Testing clone by modifying the Cloned object");
		modifyClone();
		
		System.out.println("Testing clone by modifying the original object");
		modifyValidOriginal();
		
		System.out.println("Testing clone by modifying the Cloned object");
		modifyValidClone();
	}

	private static void modifyOriginal() {
		Stack a = new Stack();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);

		Stack b = a.clone();

		System.out.println(a.pop()); // pops 5
		System.out.println(a.pop()); // pops 4
		System.out.println(a.pop()); // pops 3

		// if expect this to print 5 but it becomes null
		System.out.println(b.pop());
	}

	private static void modifyClone() {
		Stack a = new Stack();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);

		Stack b = a.clone();

		System.out.println(b.pop()); // pops 5
		System.out.println(b.pop()); // pops 4
		System.out.println(b.pop()); // pops 3

		// if expect this to print 5 but it becomes null
		System.out.println(a.pop());
	}
	
	
	private static void modifyValidOriginal () {
		StackWithValidClone a = new StackWithValidClone();
		
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);

		StackWithValidClone b = a.clone();

		System.out.println(a.pop()); // pops 5
		System.out.println(a.pop()); // pops 4
		System.out.println(a.pop()); // pops 3

		// this prints 5 as expected
		System.out.println(b.pop());
	}
	
	private static void modifyValidClone() {
		StackWithValidClone a = new StackWithValidClone();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);

		StackWithValidClone b = a.clone();

		System.out.println(b.pop()); // pops 5
		System.out.println(b.pop()); // pops 4
		System.out.println(b.pop()); // pops 3

		// this prints 5 as expected
		System.out.println(a.pop());
	}
}
