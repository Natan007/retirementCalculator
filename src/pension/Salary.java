package pension;

import java.util.Map;
import java.util.HashMap;

//monthly salary from 07.2000 in kopecks, key - year + month
class Salary {

	Map<String, Integer> mapSalary = createMap();

	private Map<String, Integer> createMap() {
		Map<String, Integer> mapSalary = new HashMap<String, Integer>();
	
		

//		mapSalary.put("200007", 10000);  //test
//		mapSalary.put("200008", 10000);  //test
//		mapSalary.put("200009", 10000);  //test
//		mapSalary.put("200010", 20000);  //test
//		mapSalary.put("200011", 10000);  //test
//		mapSalary.put("200012", 10000);  //test
		
		mapSalary.put("200007", 48600);
		mapSalary.put("200008", 48600);
		mapSalary.put("200009", 61100);
		mapSalary.put("200010", 93600);
		mapSalary.put("200011", 48600);
		mapSalary.put("200012", 48600);
		
		mapSalary.put("200101", 85300);
		mapSalary.put("200102", 52000);
		mapSalary.put("200103", 51900);
		mapSalary.put("200104", 52200);
		mapSalary.put("200105", 51960);
		mapSalary.put("200106", 52200);
		mapSalary.put("200107", 59893);
		mapSalary.put("200108", 62200);
		mapSalary.put("200109", 83866);
		mapSalary.put("200110", 77200);
		mapSalary.put("200111", 74050);
		mapSalary.put("200112", 106130);

		mapSalary.put("200201", 16243);
		mapSalary.put("200202", 53665);
		mapSalary.put("200203", 96785);
		mapSalary.put("200204", 74546);
		mapSalary.put("200205", 24660);
		mapSalary.put("200206", 201264);
		mapSalary.put("200207", 47074);
		mapSalary.put("200208", 45500);
		mapSalary.put("200209", 73800);
		mapSalary.put("200210", 28878);
		mapSalary.put("200211", 92327);
		mapSalary.put("200212", 43609);

		mapSalary.put("200301", 67650);
		mapSalary.put("200302", 62730);
		mapSalary.put("200303", 6500);
		mapSalary.put("200304", 136165);
		mapSalary.put("200305", 62400);
		mapSalary.put("200306", 62400);
		mapSalary.put("200307", 62400);
		mapSalary.put("200308", 62400);
		mapSalary.put("200309", 89345);
		mapSalary.put("200310", 12710);
		mapSalary.put("200311", 102427);
		mapSalary.put("200312", 60089);

		mapSalary.put("200401", 62802);
		mapSalary.put("200402", 69424);
		mapSalary.put("200403", 71962);
		mapSalary.put("200404", 65217);
		mapSalary.put("200405", 64955);
		mapSalary.put("200406", 65471);
		mapSalary.put("200407", 62728);
		mapSalary.put("200408", 61106);
		mapSalary.put("200409", 65988);
		mapSalary.put("200410", 60229);
		mapSalary.put("200411", 59009);
		mapSalary.put("200412", 59976);

		mapSalary.put("200501", 63621);
		mapSalary.put("200502", 60704);
		mapSalary.put("200503", 76922);
		mapSalary.put("200504", 102638);
		mapSalary.put("200505", 97630);
		mapSalary.put("200506", 103040);
		mapSalary.put("200507", 102502);
		mapSalary.put("200508", 85114);
		mapSalary.put("200509", 111295);
		mapSalary.put("200510", 320723);
		mapSalary.put("200511", 26409);
		mapSalary.put("200512", 102422);

		mapSalary.put("200601", 106073);
		mapSalary.put("200602", 105741);
		mapSalary.put("200603", 114129);
		mapSalary.put("200604", 107258);
		mapSalary.put("200605", 106163);
		mapSalary.put("200606", 106993);
		mapSalary.put("200607", 163438);
//		mapSalary.put("200608", 0);
//		mapSalary.put("200609", 0);
//		mapSalary.put("200610", 0);
//		mapSalary.put("200611", 0);
//		mapSalary.put("200612", 0);
//
//		mapSalary.put("200701", 0);
//		mapSalary.put("200702", 0);
//		mapSalary.put("200703", 0);
//		mapSalary.put("200704", 7000);
		mapSalary.put("200705", 70000);
		mapSalary.put("200706", 70000);
		mapSalary.put("200707", 70000);
		mapSalary.put("200708", 71600);
		mapSalary.put("200709", 72400);
		mapSalary.put("200710", 72400);
		mapSalary.put("200711", 74872);
		mapSalary.put("200712", 45600);

//		mapSalary.put("200801", 0);
//		mapSalary.put("200802", 0);
//		mapSalary.put("200803", 0);
//		mapSalary.put("200804", 0);
//		mapSalary.put("200805", 0);
//		mapSalary.put("200806", 0);
//		mapSalary.put("200807", 0);
//		mapSalary.put("200808", 0);
//		mapSalary.put("200809", 0);
//		mapSalary.put("200810", 0);
//		mapSalary.put("200811", 0);
//		mapSalary.put("200812", 0);

		mapSalary.put("201609", 392523);
		mapSalary.put("201610", 525546);
		mapSalary.put("201611", 482500);
		mapSalary.put("201612", 482500);

		mapSalary.put("201701", 483630);
		mapSalary.put("201702", 556629);
		mapSalary.put("201703", 473295);
		mapSalary.put("201704", 601100);
		mapSalary.put("201705", 518760);
		mapSalary.put("201706", 490500);
		mapSalary.put("201707", 520500);
		mapSalary.put("201708", 592531);
		mapSalary.put("201709", 467806);
		mapSalary.put("201710", 495720);
		mapSalary.put("201711", 475156);
		mapSalary.put("201712", 629096);

		mapSalary.put("201801", 572000);
		mapSalary.put("201802", 532448);
		mapSalary.put("201803", 492294);
		mapSalary.put("201804", 507000);
		mapSalary.put("201805", 542000);
		mapSalary.put("201806", 483100);
		mapSalary.put("201807", 507852);
		mapSalary.put("201808", 437862);
//		mapSalary.put("201809", 126501);
//		mapSalary.put("201810", 0);
//		mapSalary.put("201811", 0);
//		mapSalary.put("201812", 0);
//
//		mapSalary.put("201901", 0);
//		mapSalary.put("201902", 0);
//		mapSalary.put("201903", 0);
//		mapSalary.put("201904", 0);
//		mapSalary.put("201905", 0);
//		mapSalary.put("201906", 0);
//		mapSalary.put("201907", 0);
//		mapSalary.put("201908", 0);
//		mapSalary.put("201909", 0);

		return mapSalary;
	}

	double getIndCoef(AverageWage averageWage) {

		int monthSalary = 0;
		double monthCoef;

		double sumCoef = 0.;
		int sumMonths = 0;

		for (Map.Entry<String, Integer> entry : mapSalary.entrySet()) {
			try {
				monthSalary = entry.getValue();
			} catch (NullPointerException c) {
				System.out.println("Відсутня інформація про зарплату  по ключу " + entry.getKey());
				System.out.println("Запис не враховується при обчиcленнях");
				continue;
			}
//			System.out.println("key  " + entry.getKey());    //test
//			System.out.println("monthSalary " + monthSalary);  //test
			try {
				monthCoef = (double) monthSalary / averageWage.getWage(entry.getKey());
//				System.out.println("monthCoef " + monthCoef);  //test
				sumCoef = sumCoef + monthCoef;
//				System.out.println(sumCoef);  //test
			} catch (NullPointerException exc) {
				System.out.println(
						"Відсутня інформація про середньомісячну зарплату в Україні по ключу " + entry.getKey());
				System.out.println("Запис не враховується при обчиcленнях");
				continue;
			}

			sumMonths = sumMonths + 1;
		}
//		System.out.println("sumMonths " + sumMonths);  //test
		return sumCoef / sumMonths;
	}

}


















