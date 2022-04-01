package assignment3;


public class Professor extends DeptEmployee {
	// additional instance field
	private int numberofPublications;

// a constructor
	public Professor(String name, double salary, int aYear, int aMonth, int aDay, int numberofPublications) {
		super(name, salary, aYear, aMonth, aDay);
		this.numberofPublications = numberofPublications;
	}

	// Setters and getters
	public int getNumberofPublications() {
		return numberofPublications;
	}

	public void setNumberofPublications(int numberofPublications) {
		this.numberofPublications = numberofPublications;
	}

}
