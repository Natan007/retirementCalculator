package pension;

import java.util.HashMap;
import java.util.Map;

 class IndCoefUntil2000 {
	Map<String, Integer> mapSalary = new HashMap<String, Integer>();
	SalaryUntil2000 salaryUntil2000 = new SalaryUntil2000();

//	It fills the collection with data 
	Map<String, Integer> createMap() {
		salaryUntil2000.createMap(mapSalary);
		return mapSalary;
	}

	// calculating individual coefficient until 06.2000
	double getIndCoefUntil2000(AverageWage averageWage, String startDate) {

		String key = null;

		double sumCoef = 0.;
		int sumMonths = 6;

		if (startDate == null) {
			System.out.println("Задайте стартову дату розрахунку інд. коефіцієнта для періоду до 06.2000");
			return 0.0;
		}

//		Map<String, Integer> s = 
		createMap();
//		for(Map.Entry<String, Integer> sos : s.entrySet()) {
//		System.out.println("Key = " + sos.getKey() + ", Value = " + sos.getValue());
//  	}
		if (mapSalary.isEmpty()) {
			System.out.println("Fill the collection with individual monthly salaries until 06.2000");
			return 0.0;
		}

		key = startDate;
//		System.out.println("key getIndCoefUntil2000 = " + key); // test

		for (int i = 0; i < 6; i++) {
			if (mapSalary.get(key) == null) {
				System.out.println("Відсутня інформація про зарплату  по ключу " + key);
				System.out.println(
						"Зарплата за " + key.substring(4) + "." + key.substring(0, 4) + " прирівнюється до нуля.");
			}

			try {
				sumCoef = sumCoef + (double) mapSalary.get(key) / averageWage.getWage(key);
//				System.out.println("sumCoef = " + sumCoef);   //test
			} catch (NullPointerException exc) {
				System.out.println("Відсутня інформація про середньомісячну зарплату в Україні по ключу " + key);
				System.out.println(
						"Зарплата особи за " + key.substring(4) + "." + key.substring(0, 4) + " прирівнюється до нуля.");
			}
			
			key = salaryUntil2000.keyForNextStep(key);

		}
		
		return sumCoef / sumMonths;
	}
}

