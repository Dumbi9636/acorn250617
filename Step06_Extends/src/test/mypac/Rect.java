package test.mypac;

public class Rect extends Shape {

	private int rec;
	public Rect(int x, int y, int rec) {
		super(x, y);
		this.rec = rec;
	}
	// 사각형의 넓이
	public void printArea() {
		int area = rec*rec;
		System.out.println("사각형의 넓이는: "+area);
		
	}
	
	// 사각형의 좌표
	public void printInfo() {
		super.printInfo();
		System.out.println("사각형의 한변의 길이: "+rec);
	}
}