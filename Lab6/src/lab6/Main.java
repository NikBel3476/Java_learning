package lab6;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		Student[] Students = {
				new Student("Петров", "Николай", "Борисович"),
				new Student("Смирнов", "Василий", "Александрович"),
				new Student("Грачев", "Борис", "Данилович"),
				new Student("Орлова", "Мария", "Сергеевна"),
				new Student("Морозова", "Юлия", "Михайловна"),
				new Student("Борисов", "Андрей", "Михайлович"),
				new Student("Петров", "Михаил", "Алексеевич"),
				new Student("Максимова", "Татьяна", "Евгеньевна"),
				new Student("Чернова", "Оксана", "Анатольевна"),
				new Student("Петров", "Михаил", "Андреевич"),
		};
		
		Group[] Groups = {
				new Group("Математика", 1),
				new Group("Физика", 2),
				new Group("Химия", 3),
				new Group("История", 4),
				new Group("Информатика", 5)
		};
		
		Groups[0].addStudent(Students[0]);
		Groups[0].addStudent(Students[1]);
		Groups[1].addStudent(Students[2]);
		Groups[1].addStudent(Students[3]);
		Groups[2].addStudent(Students[4]);
		Groups[2].addStudent(Students[5]);
		Groups[2].addStudent(Students[6]);
		Groups[3].addStudent(Students[7]);
		Groups[4].addStudent(Students[8]);
		Groups[4].addStudent(Students[9]);
		
		// hashCode
		System.out.println("----------Hash codes----------");
		System.out.println(Groups[2].hashCode());
		System.out.println(Students[4].hashCode());
		
		// cloning
		Group copiedGroup = Groups[0].clone();
		Student copiedStudent = Students[0].clone();
		System.out.println("----------Copied group and student----------");
		System.out.println(copiedGroup);
		System.out.println(copiedStudent);
		
		// compare
		System.out.println("----------Compare----------");
		System.out.println("Сравнение групп " + Groups[2] + " и " + Groups[3]);
		System.out.println(Groups[2].equals(Groups[3]));
		System.out.println("Сравнение студентов " + Students[2] + " и " + Students[3]);
		System.out.println(Students[2].equals(Students[3]));
		System.out.println("Сравнение групп " + Groups[0] + " и " + copiedGroup);
		System.out.println(Groups[0].equals(copiedGroup));
		System.out.println("Сравнение студентов " + Students[0] + " и " + copiedStudent);
		System.out.println(Students[0].equals(copiedStudent));
		
		// students in group
		System.out.println("----------Students in group----------");
		System.out.println("Студенты группы " + Groups[4]);
		LinkedList<Student> studentsInGroup = Groups[4].getStudents();
		for (Student student: studentsInGroup) {
			System.out.println(student);
		}
		
		// toString
		System.out.println("----------Groups and students before sorting----------");
		for (Group group: Groups) {
			System.out.println(group);
		}
		for (Student student: Students) {
			System.out.println(student);
		}
		
		// sorting
		System.out.println("----------Groups and students after sotring----------");
		Arrays.sort(Groups);
		Arrays.sort(Students);
		for (Group group: Groups) {
			System.out.println(group);
		}
		for (Student student: Students) {
			System.out.println(student);
		}
	}
}