import java.util.Arrays; //배열 안에 있는 내용을 확인하고 싶을 때 반드시 추가해주어야 함

public class Array {
public static void main(String[] args) {
	int Arr[] = {1, 2, 3, 4, 5};
	int Arr2[] = Arr;
	int Arr3[] = Arr2;
	
	Arr3[0] = 10;
	
	System.out.println(Arrays.toString(Arr)); //배열이 갖고 있는 모든 요소를 확인하고 싶을때는 Arrays.toStirng(배열명)
	System.out.println(Arrays.toString(Arr2));
	System.out.println(Arrays.toString(Arr3));
}
}
