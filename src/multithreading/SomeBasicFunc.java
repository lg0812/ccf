package multithreading;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SomeBasicFunc {
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		// runABCWhenAllReady();
		doTaskWithResultInWorker();
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

	/**
	 * 利用 object.wait() 和 object.notify() 两个方法来实现 按照某种顺序执行
	 */
	public static void demo2() {
		Thread A = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (TestD.class) {
					System.out.println("A:" + 1);
					System.out.println("A:" + 2);
					try {
						TestD.class.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("A:" + 3);
				}
			}

		});
		Thread B = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (TestD.class) {
					System.out.println("B:" + 1);
					TestD.class.notify();
					System.out.println("B:" + 2);
					System.out.println("B:" + 3);
				}
			}
		});
		A.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		B.start();
	}

	/**
	 * 四个线程 A B C D，其中 D 要等到 A B C 全执行完毕后才执行，而且 A B C 是同步运行的
	 */
	public static void demo3() {

		CountDownLatch countDownLatch = new CountDownLatch(3);
		Thread D = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("D is waiting for other there threads...");
				try {
					countDownLatch.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("D is down");
			}

		});

		for (char threadName = 'A'; threadName <= 'C'; threadName++) {
			final String tN = String.valueOf(threadName);

			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(tN + " is working...");
					try {
						Thread.sleep(1000);
						System.out.println(tN + " is down");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		D.start();
	}

	/**
	 * 三个运动员各自准备，等到三个人都准备好后，再一起跑
	 */
	private static void runABCWhenAllReady() {
		int runner = 3;
		CyclicBarrier cyclicBarrier = new CyclicBarrier(runner);
		final Random random = new Random();
		for (char runnerName = 'A'; runnerName <= 'C'; runnerName++) {
			final String rN = String.valueOf(runnerName);
			new Thread(new Runnable() {
				@Override
				public void run() {
					long prepareTime = random.nextInt(10000) + 100;
					System.out.println(rN + " is preparing for time:" + prepareTime);
					try {
						Thread.sleep(prepareTime);
					} catch (Exception e) {
						e.printStackTrace();
					}
					try {
						System.out.println(rN + " is prepared, waiting for others");
						cyclicBarrier.await(); // 当前运动员准备完毕，等待别人准备好
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						e.printStackTrace();
					}
					System.out.println(rN + " starts running"); // 所有运动员都准备好了，一起开始跑
				}
			}).start();
		}
	}

	/**
	 * 子线程完成某件任务后，把得到的结果回传给主线程 实际的开发中，我们经常要创建子线程来做一些耗时任务，然后把任务执行结果回传给主线程使用，这种情况在
	 * Java 里要如何实现呢？
	 */
	private static void doTaskWithResultInWorker() {
		Callable<Integer> callable = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				Thread.sleep(50000);
				return 100;
			}
		};

		FutureTask<Integer> futureTask = new FutureTask<>(callable);

		new Thread(futureTask).start();
		try {
			System.out.println("before futureTask.get()");
			System.out.println(futureTask.get());
			System.out.println("after futureTask.get()");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
