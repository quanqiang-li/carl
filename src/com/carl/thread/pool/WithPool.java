package com.carl.thread.pool;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WithPool {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		List<Integer> l = new LinkedList<Integer>();
		ConcurrentSkipListSet<Integer> ss = new ConcurrentSkipListSet<Integer>();
		
		int corePoolSize = 5;// 核心线程池大小
		int maximumPoolSize = 10;// 线程池最大线程数
		long keepAliveTime = 60;// 超过corePoolSize的 线程，在此空闲时间之后将被销毁
		TimeUnit unit = TimeUnit.SECONDS;// keepAliveTime的时间单位
		BlockingQueue<Runnable> workQueue = new LinkedBlockingDeque<Runnable>();// 储存提交的任务
		ThreadPoolExecutor tp = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
		Random random = new Random();
		int count = 10000000;
		for (int j = 0; j < count; j++) {
			tp.execute(new Runnable() {
				@Override
				public void run() {
					int nextInt = random.nextInt();
					l.add(nextInt);
					ss.add(nextInt);
				}
			});
		}
		tp.shutdown();// 等待线程执行结束，不再接受新任务
		try {
			tp.awaitTermination(1, TimeUnit.DAYS);// 最多等待时间
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis() - startTime + "ms");
		System.out.println(l.size());
		System.out.println(ss.size());
	}
}
