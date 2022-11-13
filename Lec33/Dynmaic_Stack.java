package Lec33;

import Lec30.Stack;

public class Dynmaic_Stack extends Stack {
	@Override
	public void push(int item) throws Exception {
		if (this.isfull()) {
			int[] a = new int[2 * arr.length];

			for (int i = 0; i < arr.length; i++) {
				a[i] = arr[i];
			}
			arr = a;
		}
		super.push(item);

	}

}
