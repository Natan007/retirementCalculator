package pension;

import java.util.Map;

//monthly salary until 06.2000 in kopecks, key - year + month
class SalaryUntil2000 {

//	formation of the key for the next iteration
	String keyForNextStep(String key) {

		switch (key.substring(4)) {
		case "01":
			key = key.substring(0, 4) + "02";
			break;

		case "02":
			key = key.substring(0, 4) + "03";
			break;

		case "03":
			key = key.substring(0, 4) + "04";
			break;

		case "04":
			key = key.substring(0, 4) + "05";
			break;

		case "05":
			key = key.substring(0, 4) + "06";
			break;

		case "06":
			key = key.substring(0, 4) + "07";
			break;

		case "07":
			key = key.substring(0, 4) + "08";
			break;

		case "08":
			key = key.substring(0, 4) + "09";
			break;

		case "09":
			key = key.substring(0, 4) + "10";
			break;

		case "10":
			key = key.substring(0, 4) + "11";
			break;

		case "11":
			key = key.substring(0, 4) + "12";
			break;

		case "12":
			key = key.substring(0, 4);
			Integer keyInt = new Integer(key);
			keyInt++;
			key = keyInt.toString() + "01";
			break;
		}
//		System.out.println(key); // test
		return key;
	}

	void createMap(Map<String, Integer> mapSalary) {
//		mapSalary.put("198501", 5000);  //test
//		mapSalary.put("198502", 5000);  //test
//		mapSalary.put("198503", 5000);  //test
//		mapSalary.put("198504", 5000);  //test
//		mapSalary.put("198505", 5000);  //test
//		mapSalary.put("198506", 5000);  //test
//		mapSalary.put("198507", 5000);  //test
//		mapSalary.put("198508", 5000);  //test
//		mapSalary.put("198509", 5000);  //test
//		mapSalary.put("198510", 5000);  //test
//		mapSalary.put("198511", 5000);  //test
//		mapSalary.put("198512", 8000);  //test
//		
//		mapSalary.put("198601", 5000);  //test
//		mapSalary.put("198602", 5000);  //test
//		mapSalary.put("198603", 5000);  //test
//		mapSalary.put("198604", 5000);  //test
//		mapSalary.put("198605", 5000);  //test
//		mapSalary.put("198606", 5000);  //test
//		mapSalary.put("198607", 5000);  //test
//		mapSalary.put("198608", 5000);  //test
//		mapSalary.put("198609", 5000);  //test
//		mapSalary.put("198610", 5000);  //test
//		mapSalary.put("198611", 5000);  //test
//		mapSalary.put("198612", 5000);  //test
//		
//		mapSalary.put("198701", 7000);  //test
//		mapSalary.put("198702", 7000);  //test
//		mapSalary.put("198703", 7000);  //test
//		mapSalary.put("198704", 7000);  //test
//		mapSalary.put("198705", 7000);  //test
//		mapSalary.put("198706", 7000);  //test
//		mapSalary.put("198707", 7000);  //test
//		mapSalary.put("198708", 7000);  //test
//		mapSalary.put("198709", 7000);  //test
//		mapSalary.put("198710", 7000);  //test
//		mapSalary.put("198711", 7000);  //test
//		mapSalary.put("198712", 7000);  //test

		mapSalary.put("198501", 20500);
		mapSalary.put("198502", 12000);
		mapSalary.put("198503", 14600);
		mapSalary.put("198504", 12000);
		mapSalary.put("198505", 12000);
		mapSalary.put("198506", 12000);
		mapSalary.put("198507", 18428);
		mapSalary.put("198508", 7085);
		mapSalary.put("198509", 12000);
		mapSalary.put("198510", 12000);
		mapSalary.put("198511", 12000);
		mapSalary.put("198512", 12000);

		mapSalary.put("198601", 12000);
		mapSalary.put("198602", 12000);
		mapSalary.put("198603", 15000);
		mapSalary.put("198604", 7630);
		mapSalary.put("198605", 12799);
		mapSalary.put("198606", 13200);
		mapSalary.put("198607", 11081);
		mapSalary.put("198608", 32750);
		mapSalary.put("198609", 8727);
		mapSalary.put("198610", 13000);
		mapSalary.put("198611", 13000);
		mapSalary.put("198612", 13000);

		mapSalary.put("198701", 13000);
		mapSalary.put("198702", 13000);
		mapSalary.put("198703", 16600);
		mapSalary.put("198704", 13000);
		mapSalary.put("198705", 13000);
		mapSalary.put("198706", 13000);
		mapSalary.put("198707", 20500);
		mapSalary.put("198708", 31600);
		mapSalary.put("198709", 13000);
		mapSalary.put("198710", 13000);
		mapSalary.put("198711", 16000);
		mapSalary.put("198712", 13000);

		mapSalary.put("198801", 13000);
		mapSalary.put("198802", 22400);
		mapSalary.put("198803", 15000);
		mapSalary.put("198804", 15000);
		mapSalary.put("198805", 15000);
		mapSalary.put("198806", 15714);
		mapSalary.put("198807", 27551);
		mapSalary.put("198808", 8476);
		mapSalary.put("198809", 15000);
		mapSalary.put("198810", 18000);
		mapSalary.put("198811", 18000);
		mapSalary.put("198812", 56500);

		mapSalary.put("198901", 14616);
		mapSalary.put("198902", 24800);
		mapSalary.put("198903", 15000);
		mapSalary.put("198904", 39000);
		mapSalary.put("198905", 15000);
		mapSalary.put("198906", 51000);
		mapSalary.put("198907", 34043);
		mapSalary.put("198908", 5216);
		mapSalary.put("198909", 35000);
		mapSalary.put("198910", 52417);
		mapSalary.put("198911", 35000);
		mapSalary.put("198912", 81500);

		mapSalary.put("199001", 13720);
		mapSalary.put("199002", 31200);
		mapSalary.put("199003", 21759);
		mapSalary.put("199004", 22500);
		mapSalary.put("199005", 22500);
		mapSalary.put("199006", 22410);
		mapSalary.put("199007", 9145);
		mapSalary.put("199008", 28047);
		mapSalary.put("199009", 0);
		mapSalary.put("199010", 23388);
		mapSalary.put("199011", 12928);
		mapSalary.put("199012", 8500);

		mapSalary.put("199309", 818000);
		mapSalary.put("199310", 3213900);
		mapSalary.put("199311", 8570400);
		mapSalary.put("199312", 9192800);

		mapSalary.put("199401", 185220);
		mapSalary.put("199402", 0);
		mapSalary.put("199403", 11636400);
		mapSalary.put("199404", 24600000);
		mapSalary.put("199405", 24600000);
		mapSalary.put("199406", 31466000);
		mapSalary.put("199407", 47105000);
		mapSalary.put("199408", 15966000);
		mapSalary.put("199409", 44650000);
		mapSalary.put("199410", 151000000);
		mapSalary.put("199411", 98930000);
		mapSalary.put("199412", 263100000);

		mapSalary.put("199501", 260000000/100000);
		mapSalary.put("199502", 459400000/100000);
		mapSalary.put("199503", 560100000/100000);
		mapSalary.put("199504", 532000000/100000);
		mapSalary.put("199505", 685000000/100000);
		mapSalary.put("199506", 568000000/100000);
		mapSalary.put("199507", 811800000/100000);
		mapSalary.put("199508", 581800000/100000);
		mapSalary.put("199509", 893200000/100000);
		mapSalary.put("199510", 612000000/100000);
		mapSalary.put("199511", 26868);
		mapSalary.put("199512", 715000000/100000);

		mapSalary.put("199601", 1309000000/100000);
		mapSalary.put("199602", 1963000000/100000);
		mapSalary.put("199603", 2022000000/100000);
		mapSalary.put("199604", 1670000000/100000);
		mapSalary.put("199605", 1662400000/100000);
		mapSalary.put("199606", 1670000000/100000);
		mapSalary.put("199607", 1670000000/100000);
		mapSalary.put("199608", 1670000000/100000);
		mapSalary.put("199609", 27319);
		mapSalary.put("199610", 15383);
		mapSalary.put("199611", 21080);
		mapSalary.put("199612", 10054);

		mapSalary.put("199701", 9200);
		mapSalary.put("199702", 9830);
		mapSalary.put("199703", 15975);
		mapSalary.put("199704", 30482);
		mapSalary.put("199705", 32100);
		mapSalary.put("199706", 29500);
		mapSalary.put("199707", 22000);
		mapSalary.put("199708", 37000);
		mapSalary.put("199709", 60052);
		mapSalary.put("199710", 3871);
		mapSalary.put("199711", 51676);
		mapSalary.put("199712", 2629);

		mapSalary.put("199801", 10625);
		mapSalary.put("199802", 25927);
		mapSalary.put("199803", 11360);
		mapSalary.put("199804", 14394);
		mapSalary.put("199805", 7750);
		mapSalary.put("199806", 37264);
		mapSalary.put("199807", 12416);
		mapSalary.put("199808", 22000);
		mapSalary.put("199809", 22000);
		mapSalary.put("199810", 22368);
		mapSalary.put("199811", 22000);
		mapSalary.put("199812", 47724);

		mapSalary.put("199901", 46000);
		mapSalary.put("199902", 24232);
		mapSalary.put("199903", 25012);
		mapSalary.put("199904", 24690);
		mapSalary.put("199905", 28600);
		mapSalary.put("199906", 28600);
		mapSalary.put("199907", 28600);
		mapSalary.put("199908", 37600);
		mapSalary.put("199909", 33100);
		mapSalary.put("199910", 38100);
		mapSalary.put("199911", 38100);
		mapSalary.put("199912", 38100);
				
//		mapSalary.put("200001", 25830);
//		mapSalary.put("200002", 53420);
//		mapSalary.put("200003", 47591);
//		mapSalary.put("200004", 35600);
//		mapSalary.put("200005", 76520);
//		mapSalary.put("200006", 68600);

	}

}
