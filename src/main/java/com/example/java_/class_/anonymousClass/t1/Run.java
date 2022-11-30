package com.example.java_.class_.anonymousClass.t1;

public class Run {
	public static void main(String[] args) {

		Run r = new Run();
		r.m1();

	}

	void m1(){
		C1 c = new C1();
		c.m1();
	}

	class C1{
		void m1(){
			C2 c = new C2(){
				@Override
				void m1(){
					System.out.println("C2m1 override");
				}
			};
			c.m1();
		}
	}

	class C2{
		void m1(){
			System.out.println("C2m1");
		}
	}
}
