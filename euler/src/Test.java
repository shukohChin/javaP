
public class Test {
	public static void main(String[] args) {
		System.out.println(2.00 - 1.10);
		// 金銭計算はFloat,Doubleはいけません

//		byte i = -1;
//		while(i != 0){
//			i >>>= 1;
//			System.out.println("1");
//		}

//		Double i = Double.POSITIVE_INFINITY;
//		Double j = Double.POSITIVE_INFINITY;
//		while(i <= j && j <= j && i != j) {
//			System.out.println("i");
//		}
		int i = 0x80000000;
		while(i != 0 && i == -i) {
			System.out.println("i");
		}
	}
}
