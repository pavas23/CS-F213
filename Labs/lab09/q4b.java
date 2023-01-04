// Same as NewThread but extended Thread class instead of implementing Runnable
class NewThread extends Thread {
	NewThread() {
		start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child thread " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child...");
	}
}

class q4b {
	public static void main(String args[]) {
		new NewThread2();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main thread " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			System.out.println("Main interrupted");
		}
		System.out.println("Exiting main thread...");
	}
}
