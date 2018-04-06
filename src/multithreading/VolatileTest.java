package multithreading;

/**
 * @author LG0812</br>
 *         volatile能够保证<span style="color:red;">可见性</span>，<br>
 *         但是不能保证操作的原子性，<br>
 *         可以<span style="color:blue;">保证<strong style=
 *         "color:e85347;">一定的有序性</strong></span><br>
 * 
 *         这里的inc++ 不是原子操作：包括读取x的值，进行加1操作，写入新的值。
 */
public class VolatileTest {
	volatile int inc = 0;

	public static void main(String[] args) {
		new VolatileTest().demo();
	}

	public void increment() {
		inc++;
	}

	private void demo() {

		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					for (int j = 0; j < 100; j++) {
						increment();
					}
				}
			}).start();
		}
		while (Thread.activeCount() > 1) {
			Thread.yield();
		}
		System.out.println(inc);
	}
}
