package project2_0322;


//  ##배열
public class class1_0322 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int i = 0; i < arr.length; i++) { //배열의 크기(length)만큼 반복해주면 됨
			System.out.print(arr[i]);
			System.out.print("   ");
		}
		System.out.println();
		
		int[] arr2 = arr;
		int[] arr3 = arr2;
		arr3[0] = 10;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print("       ");
		}
	}

	}
