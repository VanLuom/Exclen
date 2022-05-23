package advance.dev.models;

public class Students extends Person{
public Students(String name, int old) {
		super(name, old);
		// TODO Auto-generated constructor stub
	}

double mark;

public Students(String name, int old, double mark) {
	super(name, old);
	this.mark = mark;
}

public double getMark() {
	return mark;
}

public void setMark(double mark) {
	this.mark = mark;
}
public String toString() {
	return String.format("name:%s - old:%d - mark:%.2f", name , old, mark);
	
}



	
	

}
