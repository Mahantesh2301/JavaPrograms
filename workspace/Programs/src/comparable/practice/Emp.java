package comparable.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Emp 
{
	String name;
	int id;
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", no=" + no + "]";
	}

	long no;

	public Emp(String name, int id, long no) {
		super();
		this.name = name;
		this.id = id;
		this.no = no;
	}

	public static void main(String[] args) 
	{
		Emp hari = new Emp("Hari", 1, 456779123);
		Emp Rick = new Emp("Rick", 101,656879123);
		Emp Nagu = new Emp("Nagu", 105, 45677917);
		
		ArrayList<Emp> as= new ArrayList<>();
		as.add(hari);
		as.add(Rick);
		as.add(Nagu);
		
		System.out.println(as);
		Collections.sort(as,new ComPName());
		System.out.println(as);
		Collections.sort(as,new CompId());
		System.out.println(as);

	}

}



class CompId implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.id-o2.id;
	}
	
}
