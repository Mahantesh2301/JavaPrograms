package arraystopic;

import java.util.HashSet;
import java.util.Set;

public class FindDup {
	public static void main(String[] args) {
		String dupli[] = new String[] { "java", "spring", "hibernate", "java" };
		Set nondupli = new HashSet<>();
		Set dupliSet = new HashSet<>();
		for (String s : dupli) {
			if (!nondupli.contains(s)) {
				nondupli.add(s);
			} else {
				dupliSet.add(s);
			}
		}
		System.out.println(dupliSet);
	}
}
