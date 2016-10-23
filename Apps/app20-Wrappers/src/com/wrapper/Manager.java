package com.wrapper;

	class A{
		void test1(){
			System.out.println("from A.test1");
		}
		void test2(){
			System.out.println("from A.test2");
		}
	}
	class WrapperToA{
		A a1;
		WrapperToA(A a1){
			this.a1=a1;
		}
		void test1(){
			a1.test1();
		}
		void test2(){
			a1.test2();
		}
	}
	class UseWrapperToA extends WrapperToA{
		UseWrapperToA(A a1) {
			super(a1);
		}
	void test1(){
			System.out.println("from UseWrapperToA.test1");
		}
	}
	
	public class Manager {
		public static void main(String[] args) {
			A a1=new A();
			a1.test1();
			a1.test2();
			System.out.println("-----");
			UseWrapperToA a2=new UseWrapperToA(a1);
			a2.test1();
			a2.test2();
		}
}
