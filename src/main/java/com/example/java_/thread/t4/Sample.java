package com.example.java_.thread.t4;

import java.util.ArrayList;

// Thread클래스를 상속받으면 다른 클래스를 상속받을 수 없기 때문에 Runnable인터페이스를 구현하는 방법을 주로 씀
public class Sample implements Runnable{

	int seq;

	public Sample(int seq) {
		this.seq = seq;
	}

	public void run() {
		System.out.println(this.seq + "쓰레드 시작");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println(this.seq + "쓰레드 종료");
	}

	public static void main(String[] args) {

		ArrayList<Thread> threads = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Sample(i));
			t.start();
			threads.add(t);
		}

		for (int i = 0; i < threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			} catch (Exception e) {
			}
		}

		System.out.println("메인 메소드 종료");

	}

}




















