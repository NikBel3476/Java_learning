////	Доделать ЧЁТКУЮ сортировку + потом вывод в другой документ
///*
// * Во входном файле расположены данные о студентах, в каждой строке фамилия, имя, 
// * одна или несколько оценок (от 2 до 5). Вывести в выходной файл список студентов
// * и их средних оценок в порядке убывания.
// */
//
//package lab5;
//
//import java.util.*;
//import java.io.*;
//
//public class FileSortStudent {
//	
//	private static ArrayList<Students> students = new ArrayList<Students>();
//	
//	private static void sort() {
//		int size = students.size();
//		
//		while(true) {
//			for(int i = 0; i < size; i++) {
//				
//			};
//			break;
//		};
//	};
//	
//	//private static ArrayList<String> students = new ArrayList<String>();
//	//private static ArrayList<Integer> marks = new ArrayList<Integer>();
///*
//	private static void sorting(Integer mark, String student) {
//		int size = marks.size();
//		int maxIndex = 0;
//		int count = 0;
//		for(int i = 0; i < size; i++) {
//			if(marks.get(i) <= mark && marks.get(count) <= marks.get(i)) {
//				count = i;
//			} else {
//				maxIndex = i;
//			};
//		};
//		students.add(maxIndex, student);
//		marks.add(maxIndex, mark);
//		
//	};
//*/
//	public static void main(String[] args) {
//		
//		File studentList = new File("file.txt");
//		
//		try {
//			Scanner scan = new Scanner(studentList);
//			String student = "";
//			Integer mark = 0;
//			while(scan.hasNext()) {
//				if(!scan.hasNextInt()) {
//					student = scan.next() + " " + scan.next();
//				} else {
//					mark += scan.nextInt();
//					if(!scan.hasNextInt()) {
//						students.add(new Students(mark, student));
//						mark = 0;
//						student = "";
//					};
//				};
//				
//			};
//			
//			System.out.println(students);
//			sort();
//			
//			scan.close();
//			
//		} catch(IOException e) {
//			System.out.print(e);
//		};
//		
//		
//		
//	};
//
//}