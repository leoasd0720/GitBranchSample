package gitBranchApp;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �o�O�ժ��Ĥ@���s��
		System.out.println("1st Version");
		// �o�O�a�ƾ����O����
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