package multithreading;

/**
 * Created by LG0812 on 2018/4/6.
 */
public class MultiStopTest {

	public static void main(String[] args) {
		new MultiStopTest().tMultiStop();
	}

	public void tMultiStop() {
		// int stopTime = 0;
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					// stopTime++;
					System.out.println("Thread is running");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

}
