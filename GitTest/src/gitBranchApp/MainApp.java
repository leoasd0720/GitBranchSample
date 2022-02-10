package gitBranchApp;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 這是組長第一次編輯
		System.out.println("1st Version");
		// 這是家數學類別版本
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(10, 5));
	}
}

class Math{
	int add(int a, int b) {
		return a+b;
	}
}