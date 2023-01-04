class Stack {
	int index;
	int stack[];

	Stack(int n) {
		stack = new int[n]; // allocating memory to the stack variable
		int index = 0;
	}

	public void push(int x) {
		stack[index] = x;
		index++;
	}

	public int pop() {
		int topElement = stack[index - 1];
		index--;
		return topElement;
	}

	public void printStack() {
		for (int i = 0; i < index; i++) {
			System.out.print(stack[i] + " ");
		}
	}
}

class q3 {
	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push(-1);
		s.push(-2132133);
		s.push(213213);
		s.push(-1999232131);
		s.push(232213);
		s.printStack();
	}
}
