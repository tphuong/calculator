package pixie;

public class Calculator implements CalcInterface {
	
	public CalResult add(int x, int y){
		CalResult calcresult = new CalResult();
		int total = x + y;
		calcresult.setErrCode(0);
		calcresult.setResult(total);
		return calcresult;
		
	}
	

	public CalResult sub (int x, int y){
		CalResult calresult = new CalResult();
		int total = x - y;
		calresult.setErrCode(0);
		calresult.setResult(total);
		return calresult;
	}
	
	public CalResult mul (int x, int y){
		CalResult calresult = new CalResult();
		int total = x * y;
		calresult.setErrCode(0);
		calresult.setResult(total);
		return calresult;
	}
	
	public CalResult devide(int x, int y) {
		CalResult calcresult = new CalResult();
		if (y == 0){
			calcresult.setErrCode(1);;
			calcresult.setMessage("Stupid");
			return calcresult;
		}
		int total = x / y;
		calcresult.setErrCode(0);
		calcresult.setResult(total);
		return calcresult;
		
	}	
	

}
