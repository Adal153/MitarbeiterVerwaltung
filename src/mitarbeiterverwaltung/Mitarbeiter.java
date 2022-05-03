package mitarbeiterverwaltung;

public class Mitarbeiter {
	private String name;
	private int alter;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public Mitarbeiter() {
		this("Klaus", 30);
	}
	
	public Mitarbeiter(String name, int alter) {
		super();
		this.name = name;
		this.alter = alter;
	}
	
	@Override
	public String toString() {
		return "Mensch [name=" + name + ", alter=" + alter + "]";
	}	
	
}
