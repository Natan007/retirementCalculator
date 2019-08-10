package pension;

import java.util.Map;
import java.util.HashMap;

class AverageWage {
	// average monthly salary in Ukraine in kopecks
	Map<String, Integer> mapWage = createMap();

	private Map<String, Integer> createMap() {
		Map<String, Integer> mapWage = new HashMap<String, Integer>();

//		mapWage.put("198501", 10000); // test
//		mapWage.put("198502", 10000); // test
//		mapWage.put("198503", 10000); // test
//		mapWage.put("198504", 10000); // test
//		mapWage.put("198505", 10000); // test
//		mapWage.put("198506", 10000); // test
//		mapWage.put("198507", 10000); // test
//		mapWage.put("198508", 10000); // test
//		mapWage.put("198509", 10000); // test
//		mapWage.put("198510", 10000); // test
//		mapWage.put("198511", 10000); // test
//		mapWage.put("198512", 10000); // test
//
//		mapWage.put("198601", 20000); // test
//		mapWage.put("198602", 20000); // test
//		mapWage.put("198603", 20000); // test
//		mapWage.put("198604", 20000); // test
//		mapWage.put("198605", 20000); // test
//		mapWage.put("198606", 20000); // test
//		mapWage.put("198607", 20000); // test
//		mapWage.put("198608", 20000); // test
//		mapWage.put("198609", 20000); // test
//		mapWage.put("198610", 20000); // test
//		mapWage.put("198611", 20000); // test
//		mapWage.put("198612", 20000); // test
//
//		mapWage.put("198701", 10000); // test
//		mapWage.put("198702", 10000); // test
//		mapWage.put("198703", 10000); // test
//		mapWage.put("198704", 10000); // test
//		mapWage.put("198705", 10000); // test
//		mapWage.put("198706", 10000); // test
//		mapWage.put("198707", 10000); // test
//		mapWage.put("198708", 10000); // test
//		mapWage.put("198709", 10000); // test
//		mapWage.put("198710", 10000); // test
//		mapWage.put("198711", 10000); // test
//		mapWage.put("198712", 10000); // test

		mapWage.put("198501", 17395);  
		mapWage.put("198502", 17395);
		mapWage.put("198503", 17395);
		mapWage.put("198504", 17395);
		mapWage.put("198505", 17395);
		mapWage.put("198506", 17395);
		mapWage.put("198507", 17395);
		mapWage.put("198508", 17395);
		mapWage.put("198509", 17395);
		mapWage.put("198510", 17395);
		mapWage.put("198511", 17395);
		mapWage.put("198512", 17395);

		mapWage.put("198601", 17900);  
		mapWage.put("198602", 17900);
		mapWage.put("198603", 17900);
		mapWage.put("198604", 17900);
		mapWage.put("198605", 17900);
		mapWage.put("198606", 17900);
		mapWage.put("198607", 17900);
		mapWage.put("198608", 17900);
		mapWage.put("198609", 17900);
		mapWage.put("198610", 17900);
		mapWage.put("198611", 17900);
		mapWage.put("198612", 17900);

		mapWage.put("198701", 18501);  
		mapWage.put("198702", 18501);
		mapWage.put("198703", 18501);
		mapWage.put("198704", 18501);
		mapWage.put("198705", 18501);
		mapWage.put("198706", 18501);
		mapWage.put("198707", 18501);
		mapWage.put("198708", 18501);
		mapWage.put("198709", 18501);
		mapWage.put("198710", 18501);
		mapWage.put("198711", 18501);
		mapWage.put("198712", 18501);

		mapWage.put("198801", 19979);
		mapWage.put("198802", 19979);
		mapWage.put("198803", 19979);
		mapWage.put("198804", 19979);
		mapWage.put("198805", 19979);
		mapWage.put("198806", 19979);
		mapWage.put("198807", 19979);
		mapWage.put("198808", 19979);
		mapWage.put("198809", 19979);
		mapWage.put("198810", 19979);
		mapWage.put("198811", 19979);
		mapWage.put("198812", 19979);

		mapWage.put("198901", 21774);
		mapWage.put("198902", 21774);
		mapWage.put("198903", 21774);
		mapWage.put("198904", 21774);
		mapWage.put("198905", 21774);
		mapWage.put("198906", 21774);
		mapWage.put("198907", 21774);
		mapWage.put("198908", 21774);
		mapWage.put("198909", 21774);
		mapWage.put("198910", 21774);
		mapWage.put("198911", 21774);
		mapWage.put("198912", 21774);

		mapWage.put("199001", 24840);
		mapWage.put("199002", 24840);
		mapWage.put("199003", 24840);
		mapWage.put("199004", 24840);
		mapWage.put("199005", 24840);
		mapWage.put("199006", 24840);
		mapWage.put("199007", 24840);
		mapWage.put("199008", 24840);
		mapWage.put("199009", 24840);
		mapWage.put("199010", 24840);
		mapWage.put("199011", 24840);
		mapWage.put("199012", 24840);

		mapWage.put("199301", 1420400);
		mapWage.put("199302", 1785400);
		mapWage.put("199303", 2294500);
		mapWage.put("199304", 2539600);
		mapWage.put("199305", 3048900);
		mapWage.put("199306", 6042300);
		mapWage.put("199307", 7656400);
		mapWage.put("199308", 8873700);
		mapWage.put("199309", 20834300);
		mapWage.put("199310", 25327200);
		mapWage.put("199311", 32763900);
		mapWage.put("199312", 83653400);

		mapWage.put("199401", 74552300);
		mapWage.put("199402", 75362200);
		mapWage.put("199403", 85449000);
		mapWage.put("199404", 89440000);
		mapWage.put("199405", 95683300);
		mapWage.put("199406", 109332300);
		mapWage.put("199407", 117626100);
		mapWage.put("199408", 123459600);
		mapWage.put("199409", 132150300);
		mapWage.put("199410", 195056000);
		mapWage.put("199411", 264495600);
		mapWage.put("199412", 349004700);

		mapWage.put("199501", 3208);  
		mapWage.put("199502", 4153);
		mapWage.put("199503", 5023);
		mapWage.put("199504", 5367);
		mapWage.put("199505", 6074);
		mapWage.put("199506", 7139);
		mapWage.put("199507", 7584);
		mapWage.put("199508", 8139);
		mapWage.put("199509", 8873);
		mapWage.put("199510", 9518);
		mapWage.put("199511", 10122);
		mapWage.put("199512", 12448);

		mapWage.put("199601", 10328);  
		mapWage.put("199602", 10895);
		mapWage.put("199603", 11755);
		mapWage.put("199604", 11628);
		mapWage.put("199605", 11944);
		mapWage.put("199606", 12547);
		mapWage.put("199607", 13046);
		mapWage.put("199608", 12999);
		mapWage.put("199609", 13270);
		mapWage.put("199610", 13487);
		mapWage.put("199611", 13227);
		mapWage.put("199612", 15151);
		
		mapWage.put("199701", 12668);  
		mapWage.put("199702", 12636);
		mapWage.put("199703", 13515);
		mapWage.put("199704", 13314);
		mapWage.put("199705", 13953);
		mapWage.put("199706", 14430);
		mapWage.put("199707", 15144);
		mapWage.put("199708", 14767);
		mapWage.put("199709", 15034);
		mapWage.put("199710", 14965);
		mapWage.put("199711", 14707);
		mapWage.put("199712", 16581);

		mapWage.put("199801", 13682);
		mapWage.put("199802", 13785);
		mapWage.put("199803", 14976);
		mapWage.put("199804", 14639);
		mapWage.put("199805", 14861);
		mapWage.put("199806", 15801);
		mapWage.put("199807", 15921);
		mapWage.put("199808", 15321);
		mapWage.put("199809", 15640);
		mapWage.put("199810", 15607);
		mapWage.put("199811", 15554);
		mapWage.put("199812", 17609);

		mapWage.put("199901", 14816);
		mapWage.put("199902", 15203);
		mapWage.put("199903", 16661);
		mapWage.put("199904", 16553);
		mapWage.put("199905", 16887);
		mapWage.put("199906", 18076);
		mapWage.put("199907", 18327);
		mapWage.put("199908", 18094);
		mapWage.put("199909", 18644);
		mapWage.put("199910", 18685);
		mapWage.put("199911", 19039);
		mapWage.put("199912", 21888);

		mapWage.put("200001", 18097);
		mapWage.put("200002", 19062);
		mapWage.put("200003", 21067);
		mapWage.put("200004", 20535);
		mapWage.put("200005", 21321);
		mapWage.put("200006", 22878);
		mapWage.put("200007", 23849);
		mapWage.put("200008", 24744);
		mapWage.put("200009", 24904);
		mapWage.put("200010", 25411);
		mapWage.put("200011", 25758);
		mapWage.put("200012", 29626);

//		mapWage.put("200007", 10000);  //test
//		mapWage.put("200008", 10000);  //test
//		mapWage.put("200009", 10000);  //test
//		mapWage.put("200010", 10000);  //test
//		mapWage.put("200011", 10000);  //test
//		mapWage.put("200012", 10000);  //test
		
		mapWage.put("200101", 25339);
		mapWage.put("200102", 26366);
		mapWage.put("200103", 28103);
		mapWage.put("200104", 28893);
		mapWage.put("200105", 30296);
		mapWage.put("200106", 31781);
		mapWage.put("200107", 32731);
		mapWage.put("200108", 32933);
		mapWage.put("200109", 32634);
		mapWage.put("200110", 33575);
		mapWage.put("200111", 33444);
		mapWage.put("200112", 37845);

		mapWage.put("200201", 32076);
		mapWage.put("200202", 32870);
		mapWage.put("200203", 35481);
		mapWage.put("200204", 35578);
		mapWage.put("200205", 35888);
		mapWage.put("200206", 37741);
		mapWage.put("200207", 39810);
		mapWage.put("200208", 39007);
		mapWage.put("200209", 39114);
		mapWage.put("200210", 39749);
		mapWage.put("200211", 39570);
		mapWage.put("200212", 44291);

		mapWage.put("200301", 33211);
		mapWage.put("200302", 32696);
		mapWage.put("200303", 34618);
		mapWage.put("200304", 34713);
		mapWage.put("200305", 35319);
		mapWage.put("200306", 39054);
		mapWage.put("200307", 38137);
		mapWage.put("200308", 37416);
		mapWage.put("200309", 39858);
		mapWage.put("200310", 40065);
		mapWage.put("200311", 39269);
		mapWage.put("200312", 42463);

		mapWage.put("200401", 44470);
		mapWage.put("200402", 46150);
		mapWage.put("200403", 48917);
		mapWage.put("200404", 49466);
		mapWage.put("200405", 49848);
		mapWage.put("200406", 55081);
		mapWage.put("200407", 53082);
		mapWage.put("200408", 52059);
		mapWage.put("200409", 55661);
		mapWage.put("200410", 56187);
		mapWage.put("200411", 56935);
		mapWage.put("200412", 60711);

		mapWage.put("200501", 60609);
		mapWage.put("200502", 62818);
		mapWage.put("200503", 68238);
		mapWage.put("200504", 67807);
		mapWage.put("200505", 69752);
		mapWage.put("200506", 77767);
		mapWage.put("200507", 73212);
		mapWage.put("200508", 72643);
		mapWage.put("200509", 76463);
		mapWage.put("200510", 79103);
		mapWage.put("200511", 81638);
		mapWage.put("200512", 91142);

		mapWage.put("200601", 78151);
		mapWage.put("200602", 81916);
		mapWage.put("200603", 88399);
		mapWage.put("200604", 87746);
		mapWage.put("200605", 90517);
		mapWage.put("200606", 99869);
		mapWage.put("200607", 93286);
		mapWage.put("200608", 92465);
		mapWage.put("200609", 95967);
		mapWage.put("200610", 96575);
		mapWage.put("200611", 98870);
		mapWage.put("200612", 110433);

		mapWage.put("200701", 100360);
		mapWage.put("200702", 103358);
		mapWage.put("200703", 109638);
		mapWage.put("200704", 109858);
		mapWage.put("200705", 114125);
		mapWage.put("200706", 127697);
		mapWage.put("200707", 122225);
		mapWage.put("200708", 119904);
		mapWage.put("200709", 123818);
		mapWage.put("200710", 129250);
		mapWage.put("200711", 131623);
		mapWage.put("200712", 144316);

		mapWage.put("200801", 134227);
		mapWage.put("200802", 144959);
		mapWage.put("200803", 149471);
		mapWage.put("200804", 151500);
		mapWage.put("200805", 156336);
		mapWage.put("200806", 172831);
		mapWage.put("200807", 161163);
		mapWage.put("200808", 157137);
		mapWage.put("200809", 164325);
		mapWage.put("200810", 166713);
		mapWage.put("200811", 159270);
		mapWage.put("200812", 170567);

		mapWage.put("201601", 389473);
		mapWage.put("201602", 402989);
		mapWage.put("201603", 420847);
		mapWage.put("201604", 421177);
		mapWage.put("201605", 437092);
		mapWage.put("201606", 493407);
		mapWage.put("201607", 444553);
		mapWage.put("201608", 432012);
		mapWage.put("201609", 458329);
		mapWage.put("201610", 455604);
		mapWage.put("201611", 468650);
		mapWage.put("201612", 556297);

		mapWage.put("201701", 537861);
		mapWage.put("201702", 559026);
		mapWage.put("201703", 588770);
		mapWage.put("201704", 584343);
		mapWage.put("201705", 617333);
		mapWage.put("201706", 703228);
		mapWage.put("201707", 617407);
		mapWage.put("201708", 602881);
		mapWage.put("201709", 645414);
		mapWage.put("201710", 652277);
		mapWage.put("201711", 659871);
		mapWage.put("201712", 760189);

		mapWage.put("201801", 693069);
		mapWage.put("201802", 710374);
		mapWage.put("201803", 738200);
		mapWage.put("201804", 743464);
		mapWage.put("201805", 776916);
		mapWage.put("201806", 872705);
		mapWage.put("201807", 762150);
		mapWage.put("201808", 760155);
		mapWage.put("201809", 787029);
		mapWage.put("201810", 800193);
		mapWage.put("201811", 813784);
		mapWage.put("201812", 909546);

		mapWage.put("201901", 818694);
		mapWage.put("201902", 832877);
		mapWage.put("201903", 881484);
		mapWage.put("201904", 866425);
		mapWage.put("201905", 908168);
		mapWage.put("201906", 908168);
		mapWage.put("201907", 908168);
		mapWage.put("201908", 908168);
		mapWage.put("201909", 908168);

		return mapWage;
	}

// getter for average monthly salary by the key	

	int getWage(String keyMapWage) throws NullPointerException {
		if (keyMapWage.length() != 6) {
			System.out.println("Невірний формат ключа.");
		}

		return mapWage.get(keyMapWage);
	}

//	"Зс - середня заробітна плата (дохід) в Україні, з якої сплачено страхові внески, за три календарні роки,
//що передують року звернення за призначенням пенсії" (cт.40 ЗАКОНУ УКРАЇНИ Про загальнообов'язкове державне
//пенсійне страхування)
//parameter year - year application for pension	

	int getAverageWageFor3years(int year) {

		int averageWageFor3years;
		int period = 36; // 3 years in months
		int sum = 0;
		String months[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
		String key, yearString;

		for (int i = 0; i < 3; i++) {
			year = year - 1;
			yearString = Integer.toString(year);
//			System.out.println(yearString); // test
			for (int j = 0; j < 12; j++) {
				key = yearString + months[j];
				try {
//					System.out.println(key + "  " + getWage(key)); // test
					sum = sum + getWage(key);
				} catch (NullPointerException exc) {
					System.out.print("Відсутня інформація про середньомісячну зарплату в Україні по ключу " + key);
					System.out.println(".Приймаємо її нульовою.");
				}
			}
		}
		averageWageFor3years = sum / period;
		
		if ((((sum % period) * 10) / period) >= 5) {
			averageWageFor3years = averageWageFor3years + 1;  //rounding
		}
//		System.out.println(sum);   // test
//		System.out.println(period);    // test
//		System.out.println(sum % period);   // test
		
		return averageWageFor3years; // the average wage in Ukraine for three years: year - 1, year - 2, year - 3.
	}

}
