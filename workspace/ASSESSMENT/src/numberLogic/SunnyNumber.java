package numberLogic;

public class SunnyNumber {
	public static void main(String[] args) {
		int n = 9;
		int next = n + 1;
		boolean flag = false;
		for (int i = 1; i <= next / 2; i++) {
			if (i * i == next) {
				flag = true;
				break;
			}
		}
		if(flag==true){
			System.out.println("its sunny number");
		}else{
			System.out.println("not a sunny number");
		}
	}
}
