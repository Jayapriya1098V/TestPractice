package org.sample;

	public class Sample {
		//master changing
		
		//login test update
		public Sample() {
			this("Jaya");
			System.out.println("Constructor");
			//working
		}
		public Sample(String name) {
			
			this(10,"Chennai");
			System.out.println("Emp name: "+name);
		}
		
		public Sample(int id, String location) {
			this(55.5);
			System.out.println("Emp id: "+id);
			System.out.println("Loation: "+location);
			
		}
		public Sample(double no){
			System.out.println("no: "+no);
		}
		public static void main(String[] args) {
			Sample s = new Sample();
		}
		}
