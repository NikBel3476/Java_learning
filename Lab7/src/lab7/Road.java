package lab7;

public class Road {
	
	private City cityA;
	private City cityB;
	
	public Road(City cityA, City cityB) {
		this.cityA = cityA;
		this.cityB = cityB;
	}
	
	public City getCityA() {
		return cityA;
	}
	
	public City getCityB() {
		return cityB;
	}
	
	public String toString() {
		return (String)("Дорога между " + cityA + " и " + cityB);
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() == obj.getClass()) {
			Road temp = (Road) obj;
			return cityA.equals(temp.cityA) && cityB.equals(temp.getCityB()); 
		}
		return false;
	}
}
