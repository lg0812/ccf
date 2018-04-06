package multithreading;

public class SomeBasicFunc {
	public static void main(String[] args) {
		demo1();
	}

	/**
	 * 利用 thread.join() 方法,使B在A全部打印完后再开始打印
	 */
	public static void demo1() {
		Thread A = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				printNum("A");
			}

		});
		Thread B = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					A.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub
				printNum("B");
			}
		});
		A.start();
		B.start();
	}

	protected static void printNum(String name) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i++ < 3) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + ":" + i);
		}
	}
}
