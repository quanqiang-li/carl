package com.carl.thread.pool;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WithNoPool {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		List<Integer> l = new LinkedList<Integer>();
		ConcurrentSkipListSet<Integer> ss = new ConcurrentSkipListSet<Integer>();
		
		Random random = new Random();
		int count = 10000000;
		for (int j = 0; j < count; j++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					int nextInt = random.nextInt();
					l.add(nextInt);
					ss.add(nextInt);
				}
			});
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(System.currentTimeMillis() - startTime + "ms");
		System.out.println(l.size());
		System.out.println(ss.size());
	}
}
