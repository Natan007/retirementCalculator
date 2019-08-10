package pension;

import java.util.Map;
import java.util.TreeMap;

//calculation of pension
class Pension implements InsurancePeriod {

	public static void main(String[] args) {

		int pensionInt;

		String key, indKeyUntil = null, pensionString;
		double indCoefAfter = 0., coef, indCoefUntil = 0., indCoef, pensionDouble;

		AverageWage averageWage = new AverageWage();
		CoefInsurancePeriod coefInsurancePeriod = new CoefInsurancePeriod();
		Salary salary = new Salary();

		Search5Years search5Years = new Search5Years();
		Map<String, Integer> mapSearch = new TreeMap<String, Integer>();

		SalaryUntil2000 nextKey = new SalaryUntil2000();
		IndCoefUntil2000 indCoefUntil2000 = new IndCoefUntil2000();

//====================================================================================================================
// calculating individual coefficient after 06.2000

		indCoefAfter = salary.getIndCoef(averageWage);

//		System.out.println("indcoefAfter=" + indCoefAfter); // test
//====================================================================================================================

// calculating individual coefficient until 06.2000

		mapSearch = search5Years.find5Years(); // the choice of 5 years of the insurance period until 06.2000

		if (mapSearch.isEmpty()) {
			System.out.println("Не знайдено безперервного п'ятирічного періоду роботи до 06.2000");
		} else {

			for (Map.Entry<String, Integer> search : mapSearch.entrySet()) {
//				System.out.println("Key = " + search.getKey() + ", number of keys = " + search.getValue()); // test

				key = search.getKey();
				for (int i = 1; i <= search.getValue(); i++) {

					coef = indCoefUntil2000.getIndCoefUntil2000(averageWage, key);
//					System.out.println("indcoef for " + key + " = " + coef); // test

					if (coef > indCoefUntil) {
						indCoefUntil = coef;
						indKeyUntil = key;
					}
//					System.out.println("current indcoefUntil = " + indCoefUntil + " indKeyUntil= " + indKeyUntil); // test

					key = nextKey.keyForNextStep(key);

				}
			}
//		System.out.println("result-indcoefUntil = " + indCoefUntil + ", indKeyUntil= " + indKeyUntil);  // test
		}

//----------------------------------------------------------// for TEST----------------------------------------	

//		indCoefUntil = indCoefUntil2000.getIndCoefUntil2000(averageWage, "198501");  // test
//		System.out.println("indcoefUntil= " + indCoefUntil); // test

// ----------------------------------------------------// END for TEST------------------------------------------
//====================================================================================================================

// choice max individual coefficient

		if (indCoefAfter >= indCoefUntil)

		{
			indCoef = indCoefAfter;
			System.out.println("Для розрахунків вибрано період після 06.2000. Інд. коеф.= " + indCoef);
		} else {
			indCoef = indCoefUntil;
			System.out.println("Для розрахунків вибрано 5-річний термін, починаючи з " + indKeyUntil + ".");
			System.out.println("Інд. коеф.= " + indCoef);
		}

//--------------------------------------------------------------------------------------------------------------

//result in kopecks		

//		System.out.println("AverageWageFor3years " + averageWage.getAverageWageFor3years(1988)); // test
//		System.out.println(indCoef * averageWage.getAverageWageFor3years(1988)); // test
//		System.out.println("coefInsurancePeriod=" + coefInsurancePeriod.getCoefInsurancePeriod()); // test

		pensionDouble = (indCoef * averageWage.getAverageWageFor3years(2019)
				* coefInsurancePeriod.getCoefInsurancePeriod());

		pensionInt = (int) pensionDouble;

		if ((pensionDouble - pensionInt) >= 0.5) {
			pensionInt = pensionInt + 1;
		}

//		System.out.println("pensionDouble=" + pensionDouble); // test
//		System.out.println("pensionInt=" + pensionInt); // test
//
//		System.out.println("INSURANCE_PERIOD_OVER_30_YEARS= " + INSURANCE_PERIOD_OVER_30_YEARS); // test
//		System.out.println(INSURANCE_PERIOD_OVER_30_YEARS * pensionInt / 100); // test

		pensionInt = pensionInt + INSURANCE_PERIOD_OVER_30_YEARS * pensionInt / 100;

// printing  ------------------------------------------------------------------------------------------------

		Integer pension = new Integer(pensionInt);
		pensionString = pension.toString();

		if (pensionString.length() == 1) {
			pensionString = "00" + pensionString;
		}

		if (pensionString.length() == 2) {
			pensionString = "0" + pensionString;
		}

//		System.out.println(pensionString);   //test
		System.out.println("Ваша пенсія - " + pensionString.substring(0, pensionString.length() - 2) + '.'
				+ pensionString.substring(pensionString.length() - 2) + " грн.");
	}
}

//====================================================================================================================
