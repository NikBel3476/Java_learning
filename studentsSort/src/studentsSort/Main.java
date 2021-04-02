package studentsSort;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
			ArrayList<Student> students = new ArrayList<Student>();
		
			File studentList = new File("file.txt");
			
			try {
				Scanner scan = new Scanner(studentList);
				String name = "";
				String surname = "";
				Integer mark = 0;
				while(scan.hasNext()) {
					if(!scan.hasNextInt()) {
						surname = scan.next();
						name = scan.next();
					} else {
						mark += scan.nextInt();
						if(!scan.hasNextInt()) {
							students.add(new Student(name, surname, mark));
							mark = 0;
							name = "";
							surname = "";
						}
					}
				}
				
				students.sort(null);
				
				Collections.sort(students);
				
				System.out.println(students);

				scan.close();
				
			} catch(IOException e) {
				System.out.print(e);
			}
	}

}
