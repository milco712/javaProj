
public class Arr02 {

	public static void main(String[] args) {
		int a1=10, a2=10;
		System.out.println(a1==a2); // t
		
		int[] iArr1 = {10,20,30};
		int[] iArr2 = {10,20,30};
		System.out.println(iArr1[0]==iArr2[0]); // t
		System.out.println(iArr1==iArr2); // f
		
		System.out.println("------------------");
		
		String s1 = "Apple", s2 = "Apple";
		System.out.println(s1==s2); // true
		
		String[] sArr1 = {"Apple","Banana","Grape"};
		String[] sArr2 = {"Apple","Banana","Grape"};
		System.out.println(sArr1[0]==sArr2[0]); // true
		System.out.println(sArr1==sArr2); // false
		System.out.println(sArr1[0]==s1); // true
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(sArr1[0].hashCode());
		System.out.println(sArr2[0].hashCode());
		
		sArr1[0] = null;
		System.out.println(sArr1[0]);
		s1 = null;
		System.out.println(s1);
	}

}
