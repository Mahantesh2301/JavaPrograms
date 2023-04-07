package numberLogic;

public class TernaryOp {
public static void main(String[] args) {
	int a = 100;
	int b = 500;
	int c =30;
	int max = a>b?(a>c?a:c):b>c?b:c;
	System.out.println(max);
}
}
