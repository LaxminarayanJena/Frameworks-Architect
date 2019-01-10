package collectionsExample;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		
List<Integer> list = new ArrayList<Integer>();

list.add(10);
//list.add(10.5);
list.add(null);

int i= list.get(0);

	}

}
