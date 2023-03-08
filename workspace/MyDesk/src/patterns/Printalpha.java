package patterns;

public class Printalpha {
  public static void main(String[] args) throws InterruptedException {
//	for (int i = 1  ; i<=5 ; i++){
//		for(int j = 1; j<=5; j++){
//			System.out.print(i+""+j+" ");
////			Thread.sleep(200);
//		}
//		System.out.println();
//	}
	System.out.println();
	for (int i = 1  ; i<=5 ; i++){
		for(int j = 1; j<=5; j++){
			if(i==1||j==1||j==5||i==3){
			System.out.print("* ");
			Thread.sleep(200);
		}else{
			System.out.print("  ");
		}
		}
		System.out.println();
	}
//	System.out.println();
//	for (int i = 1  ; i<=5 ; i++){
//		for(int j = 1; j<=5; j++){
//			if(j==1||j==5||i==j){
//			System.out.print("* ");
//			Thread.sleep(200);
//
//		}else{
//			System.out.print("  ");
//		}
//		}
//		System.out.println();
//	}
	
}
  }

