package epamTask2;

public class SimpleInterestCompoundInterest {
	float principal,rateOfInterest,time,numberOfTimesaYear;
	public SimpleInterestCompoundInterest(float principal,float rateOfInterest,float time,float numberOfTimesaYear) {
		this.principal=principal;
		this.rateOfInterest=rateOfInterest;
		this.time=time;
		this.numberOfTimesaYear=numberOfTimesaYear;
	}
	public float calculateSimpleInterest() {
		return (float)(principal * rateOfInterest * time)/100;
	}
	public float calculateCompoundInterest() {
		return (float) (principal*Math.pow(1+rateOfInterest/(numberOfTimesaYear*100) , numberOfTimesaYear*time)-principal);
	}
}
