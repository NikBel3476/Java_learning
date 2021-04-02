package lab7;

public class City {

	private String name;
	
	public City(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() == obj.getClass()) {
			City temp = (City) obj;
			return name.equals(temp.name);
		}
		return false;
	}
	
	public int compareTo(City city) {
		return name.compareTo(city.getName());
	}
}
