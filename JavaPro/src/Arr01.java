
public class Arr01 {

	public static void main(String[] args) {
		int[] iArr1 = {10,20,30,40};
		int iArr2[] = {11,21,31,41};
		int[] iArr3 = new int[4];
		System.out.println(iArr3[1]); // 0 힙은 초기값을 알아서 넣어준다. 스택과 다르게 에러가 나지 않는다.
		iArr3[0] = 12; iArr3[1] = 22; 
		iArr3[2] = 32; iArr3[3] = 42;
		int[] iArr4 = new int[] {13,23,33,43};
		
		System.out.println(iArr1[1]);
		System.out.println(iArr2[2]);
		System.out.println(iArr3[3]);
		System.out.println(iArr4[0]);
	}

}
