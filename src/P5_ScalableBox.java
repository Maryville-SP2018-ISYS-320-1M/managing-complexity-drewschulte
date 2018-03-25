

/*
	ISYS 320
	Name(s):drew schulte
	Date: 3/25
*/

public class P5_ScalableBox {
	public static final int SUB_Height = 4;  

	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	
	public static void drawBoxCap() {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= SUB_Height ; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		for( int insideRowIndex = 1; insideRowIndex <= SUB_Height ; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= SUB_Height ; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
