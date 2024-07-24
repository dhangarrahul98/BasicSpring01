package springExample;

public class Student {
private int id;


public Student() {
	System.out.println("constructor calling");
}

public void setId(int id) {
	System.out.println("set id");
	this.id=id;
}

public int getId() {
	return id;
}

}
