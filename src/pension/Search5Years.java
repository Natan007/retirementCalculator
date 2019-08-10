package pension;

import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

class Search5Years {
	Map<String, Integer> mapSalary = new TreeMap<String, Integer>();
	Map<String, Integer> mapSearch5Years = new TreeMap<String, Integer>();
	SalaryUntil2000 salaryUntil2000 = new SalaryUntil2000();

//	fills the collection with data 
	Map<String, Integer> createMap() {
		salaryUntil2000.createMap(mapSalary);
		return mapSalary;
	}

	Map<String, Integer> find5Years() {

		String startKey, generatedKey, nextKey;
		int counter = 1;

//		Map<String, Integer> s =   //test
		createMap();
//		for (Map.Entry<String, Integer> sos : s.entrySet()) {   //test
//			System.out.println("Key = " + sos.getKey() + ", Value = " + sos.getValue());   //test
//		}    //test

		if (mapSalary.isEmpty()) {
			System.out.println("Fill the collection with individual monthly salaries until 06.2000");
			return mapSearch5Years;
		}

		Iterator<String> itr = mapSalary.keySet().iterator();

		nextKey = itr.next();
		startKey = nextKey;

//		System.out.println("		startKey=" + startKey); // test
//		System.out.println("                  counter=" + counter); // test

		while (itr.hasNext()) {

			generatedKey = salaryUntil2000.keyForNextStep(nextKey);
//			System.out.println("generated next key = " + generatedKey); // test

			nextKey = itr.next();
//			System.out.println("real next key= " + nextKey); // test

			if (nextKey.equals(generatedKey)) {
				counter++;
//				System.out.println("counter=" + counter);  // test
//				System.out.println(); // test
			}

			if (!nextKey.equals(generatedKey) | !itr.hasNext()) {
//				System.out.println("                 sumcounter=" + counter);

//				if (counter >= 6) // test
//					mapSearch5Years.put(startKey, counter - 6 + 1); // test

				if (counter >= 60)
					mapSearch5Years.put(startKey, counter - 60 + 1);

				counter = 1;

				startKey = nextKey;
				
//				System.out.println("		startKey=" + startKey); // test
//				System.out.println("                  counter=" + counter); // test
//				System.out.println(); // test
				
			}
		}

		return mapSearch5Years;
	}
}
