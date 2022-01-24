package actualCode;

public class AssertsTypes {

	public int assertEqualCheck(int a, int b) {
		return a+b;
	}
	
	public String assertSameCheck(String name1) {
		return name1;
	}
	
	public String assertNullCheck(String value) {
		return value;
	}
	
	public boolean assertTrueCheck() {
		int val1 = 5;
		int val2 = 6;
		return val1<val2;
	}
	
	public boolean assertFalseCheck() {
		int val1 =5;
		int val2 =6;
		return val1>val2;
	}
}
