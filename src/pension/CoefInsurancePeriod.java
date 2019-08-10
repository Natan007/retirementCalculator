package pension;

//calculation coeficient insurance period
//"������ 25. ���������� ���������� �����
//1. ���������� ���������� �����, �� ������������� ��� ���������� ������ ����, ����������� �� 
//������������� �� �'��� ����� ���� ����."(����� ������� ��� ������������'������ �������� ������� �����������)

class CoefInsurancePeriod implements InsurancePeriod {

	double getCoefInsurancePeriod() {

		double coefInsurancePeriod = INSURANCE_PERIOD / (100. * 12);

//		System.out.println(coefInsurancePeriod);
//		double coefInsurancePeriod = 0.99999999999;  //test

		Double coefDouble = new Double(coefInsurancePeriod);

		String coefString = coefDouble.toString();

		if (coefString.length() > 7) {

			if (coefString.charAt(7) == '0' | coefString.charAt(7) == '1' | coefString.charAt(7) == '2'
					| coefString.charAt(7) == '3' | coefString.charAt(7) == '4') {

				coefString = (coefString.substring(0, 7));

			} else {
				coefDouble = Double.parseDouble(coefString) + 0.00001;
				coefString = coefDouble.toString();

				if (coefString.length() > 7) {
					coefString = (coefString.substring(0, 7));
				}
			}
		}

		return Double.parseDouble(coefString); // coefInsurancePeriod
	}

}