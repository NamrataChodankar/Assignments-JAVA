

	public class InterestCalculatorImplementation implements SimpleAndCompoundInterestCalculator
	{

		@Override
		public double getSimpleInterest(double principalAmount, double rateOfInterest, double timeInYears) {
			double sinterest = (principalAmount * rateOfInterest * timeInYears)/100;
			//sinterest /=100;
			return sinterest;
		}

		@Override
		public double getCompoundInterest(double principalAmount, double rateOfInterest, double timeInYears) {
			double rate = 1+rateOfInterest/100;
			double cinterest = (principalAmount * Math.pow(rate,timeInYears)) - principalAmount;
			return cinterest;
		}
		
}
