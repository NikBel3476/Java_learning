package lab3;

import java.util.Scanner;

public class numDifVals {
	static Scanner enter = new Scanner(System.in);
	
	private static int[] intArray; 
	
	private static int[] sort(int[] args) {
		int[] sortedArray = args;
		int value;
		for (int i = 1; i < sortedArray.length - 1; i++) {
			for (int j = 0; j < sortedArray.length - i; j++) {
				if (sortedArray[j] > sortedArray[j + 1]) {
					value = sortedArray[j];
					sortedArray[j] = sortedArray[j + 1];
					sortedArray[j + 1] = value;
				}
			}
		}
		return sortedArray;
	}
	
	public static void main(String[] args) {
		System.out.println("Введите длину массива");
		System.out.print("Длина массива = ");
		int len = enter.nextInt();
		intArray = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.print(i + ": ");
			intArray[i] = enter.nextInt();
		}
		
		sort(intArray);
		
		int difNumsAmount = intArray.length;
		for (int i = 0; i < intArray.length - 1; i++) {
			if (intArray[i] == intArray[i + 1]) {
				difNumsAmount--;
			}
		}
		
		System.out.println("Кол-во различных элем-ов = " + difNumsAmount);
	}
}
