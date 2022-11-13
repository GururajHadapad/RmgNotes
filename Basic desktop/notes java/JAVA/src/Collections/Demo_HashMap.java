package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Demo_HashMap {

	public static void main(String[] args) {
		HashMap hash = new HashMap<>();
		hash.put(01, "vin");
		hash.put(02, "jay");
		hash.put(03, "yog");
		hash.put(04, "ram");
		hash.put(05, "bheem");
        System.out.println(hash);
        Set h = hash.keySet();
     ArrayList list= new ArrayList<>(h);
	Collections.reverse(list);
	System.out.println(list);
	}

}
