package arraystopic;

import java.util.Stack;

public class RevUsingStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		int[] a = { 10, 30, 60 };
		for (int i = 0; i < a.length; i++) {
			s.push(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) s.pop();

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
