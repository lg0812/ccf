package multithreading;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			// 调用setDaemon 将线程设置为后台线程
			// 后台线程不属于程序中不可或缺的一部分，当所有非后台线程结束时，程序也就终止了，反过来说，只要还有任何非后台线程还在运行，程序就不会终止，
			// main() 就是一个非后台线程
			daemon.setDaemon(true);
			daemon.start();
		}

		try {
			TimeUnit.MILLISECONDS.sleep(175);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread() + "");
		}
	}
}
