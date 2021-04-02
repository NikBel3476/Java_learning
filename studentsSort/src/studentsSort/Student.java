package studentsSort;

public class Student implements Comparable<Student> {
	
	private String name;
	private String surname;
	private Integer mark;
	
	public Student(String name, String surname, int mark) {
		this.name = name;
		this.surname = surname;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public Integer getMark() {
		return mark;
	}
	
	public String toString() {
		return (String)(mark + " " + surname + " " + name); 
	}
	
	public int compareTo(Student student) {
		if (mark.compareTo(student.getMark()) == 0) {
			if (surname.compareTo(student.getSurname()) == 0) {
				return name.compareTo(student.getName());
			}
			return surname.compareTo(student.getSurname());
		}
		return mark.compareTo(student.getMark());
	}
}
